package com.netnumeri.server.finance.trading

import org.springframework.dao.DataIntegrityViolationException

class SignalController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [signalInstanceList: Signal.list(params), signalInstanceTotal: Signal.count()]
    }

    def create() {
        [signalInstance: new Signal(params)]
    }

    def save() {
        def signalInstance = new Signal(params)
        if (!signalInstance.save(flush: true)) {
            render(view: "create", model: [signalInstance: signalInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'signal.label', default: 'Signal'), signalInstance.id])
        redirect(action: "show", id: signalInstance.id)
    }

    def show(Long id) {
        def signalInstance = Signal.get(id)
        if (!signalInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'signal.label', default: 'Signal'), id])
            redirect(action: "list")
            return
        }

        [signalInstance: signalInstance]
    }

    def edit(Long id) {
        def signalInstance = Signal.get(id)
        if (!signalInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'signal.label', default: 'Signal'), id])
            redirect(action: "list")
            return
        }

        [signalInstance: signalInstance]
    }

    def update(Long id, Long version) {
        def signalInstance = Signal.get(id)
        if (!signalInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'signal.label', default: 'Signal'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (signalInstance.version > version) {
                signalInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'signal.label', default: 'Signal')] as Object[],
                        "Another user has updated this Signal while you were editing")
                render(view: "edit", model: [signalInstance: signalInstance])
                return
            }
        }

        signalInstance.properties = params

        if (!signalInstance.save(flush: true)) {
            render(view: "edit", model: [signalInstance: signalInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'signal.label', default: 'Signal'), signalInstance.id])
        redirect(action: "show", id: signalInstance.id)
    }

    def delete(Long id) {
        def signalInstance = Signal.get(id)
        if (!signalInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'signal.label', default: 'Signal'), id])
            redirect(action: "list")
            return
        }

        try {
            signalInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'signal.label', default: 'Signal'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'signal.label', default: 'Signal'), id])
            redirect(action: "show", id: id)
        }
    }
}
