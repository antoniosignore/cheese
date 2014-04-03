package com.netnumeri.server.finance.trading

import org.springframework.dao.DataIntegrityViolationException

class StrategyExecutionController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [strategyExecutionInstanceList: StrategyExecution.list(params), strategyExecutionInstanceTotal: StrategyExecution.count()]
    }

    def create() {
        [strategyExecutionInstance: new StrategyExecution(params)]
    }

    def save() {
        def strategyExecutionInstance = new StrategyExecution(params)
        if (!strategyExecutionInstance.save(flush: true)) {
            render(view: "create", model: [strategyExecutionInstance: strategyExecutionInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'strategyExecution.label', default: 'StrategyExecution'), strategyExecutionInstance.id])
        redirect(action: "show", id: strategyExecutionInstance.id)
    }

    def show(Long id) {
        def strategyExecutionInstance = StrategyExecution.get(id)
        if (!strategyExecutionInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategyExecution.label', default: 'StrategyExecution'), id])
            redirect(action: "list")
            return
        }

        [strategyExecutionInstance: strategyExecutionInstance]
    }

    def edit(Long id) {
        def strategyExecutionInstance = StrategyExecution.get(id)
        if (!strategyExecutionInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategyExecution.label', default: 'StrategyExecution'), id])
            redirect(action: "list")
            return
        }

        [strategyExecutionInstance: strategyExecutionInstance]
    }

    def update(Long id, Long version) {
        def strategyExecutionInstance = StrategyExecution.get(id)
        if (!strategyExecutionInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategyExecution.label', default: 'StrategyExecution'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (strategyExecutionInstance.version > version) {
                strategyExecutionInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'strategyExecution.label', default: 'StrategyExecution')] as Object[],
                        "Another user has updated this StrategyExecution while you were editing")
                render(view: "edit", model: [strategyExecutionInstance: strategyExecutionInstance])
                return
            }
        }

        strategyExecutionInstance.properties = params

        if (!strategyExecutionInstance.save(flush: true)) {
            render(view: "edit", model: [strategyExecutionInstance: strategyExecutionInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'strategyExecution.label', default: 'StrategyExecution'), strategyExecutionInstance.id])
        redirect(action: "show", id: strategyExecutionInstance.id)
    }

    def delete(Long id) {
        def strategyExecutionInstance = StrategyExecution.get(id)
        if (!strategyExecutionInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'strategyExecution.label', default: 'StrategyExecution'), id])
            redirect(action: "list")
            return
        }

        try {
            strategyExecutionInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'strategyExecution.label', default: 'StrategyExecution'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'strategyExecution.label', default: 'StrategyExecution'), id])
            redirect(action: "show", id: id)
        }
    }
}
