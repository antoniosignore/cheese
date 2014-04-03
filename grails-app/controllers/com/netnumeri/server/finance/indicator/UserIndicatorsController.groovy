package com.netnumeri.server.finance.indicator

import org.springframework.dao.DataIntegrityViolationException

class UserIndicatorsController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [userIndicatorsInstanceList: UserIndicators.list(params), userIndicatorsInstanceTotal: UserIndicators.count()]
    }

    def create() {
        [userIndicatorsInstance: new UserIndicators(params)]
    }

    def save() {
        def userIndicatorsInstance = new UserIndicators(params)
        if (!userIndicatorsInstance.save(flush: true)) {
            render(view: "create", model: [userIndicatorsInstance: userIndicatorsInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'userIndicators.label', default: 'UserIndicators'), userIndicatorsInstance.id])
        redirect(action: "show", id: userIndicatorsInstance.id)
    }

    def show(Long id) {
        def userIndicatorsInstance = UserIndicators.get(id)
        if (!userIndicatorsInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'userIndicators.label', default: 'UserIndicators'), id])
            redirect(action: "list")
            return
        }

        [userIndicatorsInstance: userIndicatorsInstance]
    }

    def edit(Long id) {
        def userIndicatorsInstance = UserIndicators.get(id)
        if (!userIndicatorsInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'userIndicators.label', default: 'UserIndicators'), id])
            redirect(action: "list")
            return
        }

        [userIndicatorsInstance: userIndicatorsInstance]
    }

    def update(Long id, Long version) {
        def userIndicatorsInstance = UserIndicators.get(id)
        if (!userIndicatorsInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'userIndicators.label', default: 'UserIndicators'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (userIndicatorsInstance.version > version) {
                userIndicatorsInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'userIndicators.label', default: 'UserIndicators')] as Object[],
                        "Another user has updated this UserIndicators while you were editing")
                render(view: "edit", model: [userIndicatorsInstance: userIndicatorsInstance])
                return
            }
        }

        userIndicatorsInstance.properties = params

        if (!userIndicatorsInstance.save(flush: true)) {
            render(view: "edit", model: [userIndicatorsInstance: userIndicatorsInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'userIndicators.label', default: 'UserIndicators'), userIndicatorsInstance.id])
        redirect(action: "show", id: userIndicatorsInstance.id)
    }

    def delete(Long id) {
        def userIndicatorsInstance = UserIndicators.get(id)
        if (!userIndicatorsInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'userIndicators.label', default: 'UserIndicators'), id])
            redirect(action: "list")
            return
        }

        try {
            userIndicatorsInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'userIndicators.label', default: 'UserIndicators'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'userIndicators.label', default: 'UserIndicators'), id])
            redirect(action: "show", id: id)
        }
    }
}
