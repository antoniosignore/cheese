package com.dtmc.club

import org.springframework.dao.DataIntegrityViolationException

class BrokerController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [brokerInstanceList: Broker.list(params), brokerInstanceTotal: Broker.count()]
    }

    def create() {
        [brokerInstance: new Broker(params)]
    }

    def save() {
        def brokerInstance = new Broker(params)
        if (!brokerInstance.save(flush: true)) {
            render(view: "create", model: [brokerInstance: brokerInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'broker.label', default: 'Broker'), brokerInstance.id])
        redirect(action: "show", id: brokerInstance.id)
    }

    def show(Long id) {
        def brokerInstance = Broker.get(id)
        if (!brokerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'broker.label', default: 'Broker'), id])
            redirect(action: "list")
            return
        }

        [brokerInstance: brokerInstance]
    }

    def edit(Long id) {
        def brokerInstance = Broker.get(id)
        if (!brokerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'broker.label', default: 'Broker'), id])
            redirect(action: "list")
            return
        }

        [brokerInstance: brokerInstance]
    }

    def update(Long id, Long version) {
        def brokerInstance = Broker.get(id)
        if (!brokerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'broker.label', default: 'Broker'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (brokerInstance.version > version) {
                brokerInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'broker.label', default: 'Broker')] as Object[],
                        "Another user has updated this Broker while you were editing")
                render(view: "edit", model: [brokerInstance: brokerInstance])
                return
            }
        }

        brokerInstance.properties = params

        if (!brokerInstance.save(flush: true)) {
            render(view: "edit", model: [brokerInstance: brokerInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'broker.label', default: 'Broker'), brokerInstance.id])
        redirect(action: "show", id: brokerInstance.id)
    }

    def delete(Long id) {
        def brokerInstance = Broker.get(id)
        if (!brokerInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'broker.label', default: 'Broker'), id])
            redirect(action: "list")
            return
        }

        try {
            brokerInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'broker.label', default: 'Broker'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'broker.label', default: 'Broker'), id])
            redirect(action: "show", id: id)
        }
    }
}
