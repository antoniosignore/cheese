package com.netnumeri.server.finance.trading

import org.springframework.dao.DataIntegrityViolationException

class StrategySubscriptionController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [strategySubscriptionInstanceList: StrategySubscription.list(params), strategySubscriptionInstanceTotal: StrategySubscription.count()]
    }

    def create() {
        [strategySubscriptionInstance: new StrategySubscription(params)]
    }

    def save() {
        def strategySubscriptionInstance = new StrategySubscription(params)
        if (!strategySubscriptionInstance.save(flush: true)) {
            render(view: "create", model: [strategySubscriptionInstance: strategySubscriptionInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription'), strategySubscriptionInstance.id])
        redirect(action: "show", id: strategySubscriptionInstance.id)
    }

    def show(Long id) {
        def strategySubscriptionInstance = StrategySubscription.get(id)
        if (!strategySubscriptionInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription'), id])
            redirect(action: "list")
            return
        }

        [strategySubscriptionInstance: strategySubscriptionInstance]
    }

    def edit(Long id) {
        def strategySubscriptionInstance = StrategySubscription.get(id)
        if (!strategySubscriptionInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription'), id])
            redirect(action: "list")
            return
        }

        [strategySubscriptionInstance: strategySubscriptionInstance]
    }

    def update(Long id, Long version) {
        def strategySubscriptionInstance = StrategySubscription.get(id)
        if (!strategySubscriptionInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (strategySubscriptionInstance.version > version) {
                strategySubscriptionInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'strategySubscription.label', default: 'StrategySubscription')] as Object[],
                        "Another user has updated this StrategySubscription while you were editing")
                render(view: "edit", model: [strategySubscriptionInstance: strategySubscriptionInstance])
                return
            }
        }

        strategySubscriptionInstance.properties = params

        if (!strategySubscriptionInstance.save(flush: true)) {
            render(view: "edit", model: [strategySubscriptionInstance: strategySubscriptionInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription'), strategySubscriptionInstance.id])
        redirect(action: "show", id: strategySubscriptionInstance.id)
    }

    def delete(Long id) {
        def strategySubscriptionInstance = StrategySubscription.get(id)
        if (!strategySubscriptionInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription'), id])
            redirect(action: "list")
            return
        }

        try {
            strategySubscriptionInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription'), id])
            redirect(action: "show", id: id)
        }
    }
}
