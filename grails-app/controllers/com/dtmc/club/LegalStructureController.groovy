package com.dtmc.club

import org.springframework.dao.DataIntegrityViolationException

class LegalStructureController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [legalStructureInstanceList: LegalStructure.list(params), legalStructureInstanceTotal: LegalStructure.count()]
    }

    def create() {
        [legalStructureInstance: new LegalStructure(params)]
    }

    def save() {
        def legalStructureInstance = new LegalStructure(params)
        if (!legalStructureInstance.save(flush: true)) {
            render(view: "create", model: [legalStructureInstance: legalStructureInstance])
            return
        }

        flash.message = message(code: 'default.created.message', args: [message(code: 'legalStructure.label', default: 'LegalStructure'), legalStructureInstance.id])
        redirect(action: "show", id: legalStructureInstance.id)
    }

    def show(Long id) {
        def legalStructureInstance = LegalStructure.get(id)
        if (!legalStructureInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'legalStructure.label', default: 'LegalStructure'), id])
            redirect(action: "list")
            return
        }

        [legalStructureInstance: legalStructureInstance]
    }

    def edit(Long id) {
        def legalStructureInstance = LegalStructure.get(id)
        if (!legalStructureInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'legalStructure.label', default: 'LegalStructure'), id])
            redirect(action: "list")
            return
        }

        [legalStructureInstance: legalStructureInstance]
    }

    def update(Long id, Long version) {
        def legalStructureInstance = LegalStructure.get(id)
        if (!legalStructureInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'legalStructure.label', default: 'LegalStructure'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (legalStructureInstance.version > version) {
                legalStructureInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'legalStructure.label', default: 'LegalStructure')] as Object[],
                        "Another user has updated this LegalStructure while you were editing")
                render(view: "edit", model: [legalStructureInstance: legalStructureInstance])
                return
            }
        }

        legalStructureInstance.properties = params

        if (!legalStructureInstance.save(flush: true)) {
            render(view: "edit", model: [legalStructureInstance: legalStructureInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'legalStructure.label', default: 'LegalStructure'), legalStructureInstance.id])
        redirect(action: "show", id: legalStructureInstance.id)
    }

    def delete(Long id) {
        def legalStructureInstance = LegalStructure.get(id)
        if (!legalStructureInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'legalStructure.label', default: 'LegalStructure'), id])
            redirect(action: "list")
            return
        }

        try {
            legalStructureInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'legalStructure.label', default: 'LegalStructure'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'legalStructure.label', default: 'LegalStructure'), id])
            redirect(action: "show", id: id)
        }
    }
}
