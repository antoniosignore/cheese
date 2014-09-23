package com.dtmc.candlestick

import org.springframework.dao.DataIntegrityViolationException

class PatternController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [patternInstanceList: Pattern.list(params), patternInstanceTotal: Pattern.count()]
    }

    def create() {
        [patternInstance: new Pattern(params)]
    }

    def save() {
        def patternInstance = new Pattern(params)
        if (!patternInstance.save(flush: true)) {
            render(view: "create", model: [patternInstance: patternInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'pattern.label', default: 'Pattern'), patternInstance.id])
        redirect(action: "show", id: patternInstance.id)
    }

    def show(Long id) {
        def patternInstance = Pattern.get(id)
        if (!patternInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'pattern.label', default: 'Pattern'), id])
            redirect(action: "list")
            return
        }

        [patternInstance: patternInstance]
    }

    def edit(Long id) {
        def patternInstance = Pattern.get(id)
        if (!patternInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'pattern.label', default: 'Pattern'), id])
            redirect(action: "list")
            return
        }

        [patternInstance: patternInstance]
    }

    def update(Long id, Long version) {
        def patternInstance = Pattern.get(id)
        if (!patternInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'pattern.label', default: 'Pattern'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (patternInstance.version > version) {
                patternInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                          [message(code: 'pattern.label', default: 'Pattern')] as Object[],
                          "Another user has updated this Pattern while you were editing")
                render(view: "edit", model: [patternInstance: patternInstance])
                return
            }
        }

        patternInstance.properties = params

        if (!patternInstance.save(flush: true)) {
            render(view: "edit", model: [patternInstance: patternInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'pattern.label', default: 'Pattern'), patternInstance.id])
        redirect(action: "show", id: patternInstance.id)
    }

    def delete(Long id) {
        def patternInstance = Pattern.get(id)
        if (!patternInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'pattern.label', default: 'Pattern'), id])
            redirect(action: "list")
            return
        }

        try {
            patternInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'pattern.label', default: 'Pattern'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'pattern.label', default: 'Pattern'), id])
            redirect(action: "show", id: id)
        }
    }
}
