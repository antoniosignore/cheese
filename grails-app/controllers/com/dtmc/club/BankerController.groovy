package com.dtmc.club

import org.springframework.dao.DataIntegrityViolationException

class BankerController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [bankerInstanceList: Banker.list(params), bankerInstanceTotal: Banker.count()]
    }

    def create() {
        [bankerInstance: new Banker(params)]
    }

    def save() {
        def bankerInstance = new Banker(params)
        if (!bankerInstance.save(flush: true)) {
            render(view: "create", model: [bankerInstance: bankerInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'banker.label', default: 'Banker'), bankerInstance.id])
        redirect(action: "show", id: bankerInstance.id)
    }

    def show(Long id) {
        def bankerInstance = Banker.get(id)
        if (!bankerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'banker.label', default: 'Banker'), id])
            redirect(action: "list")
            return
        }

        [bankerInstance: bankerInstance]
    }

    def edit(Long id) {
        def bankerInstance = Banker.get(id)
        if (!bankerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'banker.label', default: 'Banker'), id])
            redirect(action: "list")
            return
        }

        [bankerInstance: bankerInstance]
    }

    def update(Long id, Long version) {
        def bankerInstance = Banker.get(id)
        if (!bankerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'banker.label', default: 'Banker'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (bankerInstance.version > version) {
                bankerInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'banker.label', default: 'Banker')] as Object[],
                        "Another user has updated this Banker while you were editing")
                render(view: "edit", model: [bankerInstance: bankerInstance])
                return
            }
        }

        bankerInstance.properties = params

        if (!bankerInstance.save(flush: true)) {
            render(view: "edit", model: [bankerInstance: bankerInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'banker.label', default: 'Banker'), bankerInstance.id])
        redirect(action: "show", id: bankerInstance.id)
    }

    def delete(Long id) {
        def bankerInstance = Banker.get(id)
        if (!bankerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'banker.label', default: 'Banker'), id])
            redirect(action: "list")
            return
        }

        try {
            bankerInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'banker.label', default: 'Banker'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'banker.label', default: 'Banker'), id])
            redirect(action: "show", id: id)
        }
    }
}
