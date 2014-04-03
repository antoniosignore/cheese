package com.netnumeri.server.finance.finpojo.derivative.equity

import org.springframework.dao.DataIntegrityViolationException

class VanillaController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [vanillaInstanceList: Vanilla.list(params), vanillaInstanceTotal: Vanilla.count()]
    }

    def create() {
        [vanillaInstance: new Vanilla(params)]
    }

    def save() {
        def vanillaInstance = new Vanilla(params)
        if (!vanillaInstance.save(flush: true)) {
            render(view: "create", model: [vanillaInstance: vanillaInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'vanilla.label', default: 'Vanilla'), vanillaInstance.id])
        redirect(action: "show", id: vanillaInstance.id)
    }

    def show(Long id) {
        def vanillaInstance = Vanilla.get(id)
        if (!vanillaInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'vanilla.label', default: 'Vanilla'), id])
            redirect(action: "list")
            return
        }

        [vanillaInstance: vanillaInstance]
    }

    def edit(Long id) {
        def vanillaInstance = Vanilla.get(id)
        if (!vanillaInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'vanilla.label', default: 'Vanilla'), id])
            redirect(action: "list")
            return
        }

        [vanillaInstance: vanillaInstance]
    }

    def update(Long id, Long version) {
        def vanillaInstance = Vanilla.get(id)
        if (!vanillaInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'vanilla.label', default: 'Vanilla'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (vanillaInstance.version > version) {
                vanillaInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'vanilla.label', default: 'Vanilla')] as Object[],
                        "Another user has updated this Vanilla while you were editing")
                render(view: "edit", model: [vanillaInstance: vanillaInstance])
                return
            }
        }

        vanillaInstance.properties = params

        if (!vanillaInstance.save(flush: true)) {
            render(view: "edit", model: [vanillaInstance: vanillaInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'vanilla.label', default: 'Vanilla'), vanillaInstance.id])
        redirect(action: "show", id: vanillaInstance.id)
    }

    def delete(Long id) {
        def vanillaInstance = Vanilla.get(id)
        if (!vanillaInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'vanilla.label', default: 'Vanilla'), id])
            redirect(action: "list")
            return
        }

        try {
            vanillaInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'vanilla.label', default: 'Vanilla'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'vanilla.label', default: 'Vanilla'), id])
            redirect(action: "show", id: id)
        }
    }
}
