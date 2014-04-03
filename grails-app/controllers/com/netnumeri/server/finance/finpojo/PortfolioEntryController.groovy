package com.netnumeri.server.finance.finpojo

import org.springframework.dao.DataIntegrityViolationException

class PortfolioEntryController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [portfolioEntryInstanceList: PortfolioEntry.list(params), portfolioEntryInstanceTotal: PortfolioEntry.count()]
    }

    def create() {
        [portfolioEntryInstance: new PortfolioEntry(params)]
    }

    def save() {
        def portfolioEntryInstance = new PortfolioEntry(params)
        if (!portfolioEntryInstance.save(flush: true)) {
            render(view: "create", model: [portfolioEntryInstance: portfolioEntryInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry'), portfolioEntryInstance.id])
        redirect(action: "show", id: portfolioEntryInstance.id)
    }

    def show(Long id) {
        def portfolioEntryInstance = PortfolioEntry.get(id)
        if (!portfolioEntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry'), id])
            redirect(action: "list")
            return
        }

        [portfolioEntryInstance: portfolioEntryInstance]
    }

    def edit(Long id) {
        def portfolioEntryInstance = PortfolioEntry.get(id)
        if (!portfolioEntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry'), id])
            redirect(action: "list")
            return
        }

        [portfolioEntryInstance: portfolioEntryInstance]
    }

    def update(Long id, Long version) {
        def portfolioEntryInstance = PortfolioEntry.get(id)
        if (!portfolioEntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (portfolioEntryInstance.version > version) {
                portfolioEntryInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'portfolioEntry.label', default: 'PortfolioEntry')] as Object[],
                        "Another user has updated this PortfolioEntry while you were editing")
                render(view: "edit", model: [portfolioEntryInstance: portfolioEntryInstance])
                return
            }
        }

        portfolioEntryInstance.properties = params

        if (!portfolioEntryInstance.save(flush: true)) {
            render(view: "edit", model: [portfolioEntryInstance: portfolioEntryInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry'), portfolioEntryInstance.id])
        redirect(action: "show", id: portfolioEntryInstance.id)
    }

    def delete(Long id) {
        def portfolioEntryInstance = PortfolioEntry.get(id)
        if (!portfolioEntryInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry'), id])
            redirect(action: "list")
            return
        }

        try {
            portfolioEntryInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry'), id])
            redirect(action: "show", id: id)
        }
    }
}
