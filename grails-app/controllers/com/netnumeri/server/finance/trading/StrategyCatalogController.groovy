package com.netnumeri.server.finance.trading

import org.springframework.dao.DataIntegrityViolationException

class StrategyCatalogController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [strategyCatalogInstanceList: StrategyCatalog.list(params), strategyCatalogInstanceTotal: StrategyCatalog.count()]
    }

    def create() {
        [strategyCatalogInstance: new StrategyCatalog(params)]
    }

    def save() {
        def strategyCatalogInstance = new StrategyCatalog(params)
        if (!strategyCatalogInstance.save(flush: true)) {
            render(view: "create", model: [strategyCatalogInstance: strategyCatalogInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'strategyCatalog.label', default: 'StrategyCatalog'), strategyCatalogInstance.id])
        redirect(action: "show", id: strategyCatalogInstance.id)
    }

    def show(Long id) {
        def strategyCatalogInstance = StrategyCatalog.get(id)
        if (!strategyCatalogInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategyCatalog.label', default: 'StrategyCatalog'), id])
            redirect(action: "list")
            return
        }

        [strategyCatalogInstance: strategyCatalogInstance]
    }

    def edit(Long id) {
        def strategyCatalogInstance = StrategyCatalog.get(id)
        if (!strategyCatalogInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategyCatalog.label', default: 'StrategyCatalog'), id])
            redirect(action: "list")
            return
        }

        [strategyCatalogInstance: strategyCatalogInstance]
    }

    def update(Long id, Long version) {
        def strategyCatalogInstance = StrategyCatalog.get(id)
        if (!strategyCatalogInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategyCatalog.label', default: 'StrategyCatalog'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (strategyCatalogInstance.version > version) {
                strategyCatalogInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'strategyCatalog.label', default: 'StrategyCatalog')] as Object[],
                        "Another user has updated this StrategyCatalog while you were editing")
                render(view: "edit", model: [strategyCatalogInstance: strategyCatalogInstance])
                return
            }
        }

        strategyCatalogInstance.properties = params

        if (!strategyCatalogInstance.save(flush: true)) {
            render(view: "edit", model: [strategyCatalogInstance: strategyCatalogInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'strategyCatalog.label', default: 'StrategyCatalog'), strategyCatalogInstance.id])
        redirect(action: "show", id: strategyCatalogInstance.id)
    }

    def delete(Long id) {
        def strategyCatalogInstance = StrategyCatalog.get(id)
        if (!strategyCatalogInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategyCatalog.label', default: 'StrategyCatalog'), id])
            redirect(action: "list")
            return
        }

        try {
            strategyCatalogInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'strategyCatalog.label', default: 'StrategyCatalog'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'strategyCatalog.label', default: 'StrategyCatalog'), id])
            redirect(action: "show", id: id)
        }
    }
}
