package com.netnumeri.server.finance.finpojo

import org.springframework.dao.DataIntegrityViolationException

class TradeController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def portfolioService

    def index() {
        redirect(action: "list", params: params)
    }

    def list(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        [tradeInstanceList: Trade.list(params), tradeInstanceTotal: Trade.count()]
    }

    def create() {

        println "portfolioId"  + params.get ("portfolioId")

        Long portfolioId = Portfolio.get(params.get ("portfolioId") as Long)
        Portfolio portfolio = Portfolio.load(portfolioId)

        Trade trade = new Trade()
        trade.setPortfolio(portfolio)

        [tradeInstance: trade]
    }

    def save() {
        def tradeInstance = new Trade(params)

        portfolioService.add(tradeInstance)

//        if (!tradeInstance.save(flush: true)) {
//            render(view: "create", model: [tradeInstance: tradeInstance])
//            return
//        }

        tradeInstance.portfolio.save()

        flash.message = message(code: 'default.created.message', args: [message(code: 'trade.label', default: 'Trade'), tradeInstance.id])
        redirect(action: "show", id: tradeInstance.id)
    }

    def show(Long id) {
        def tradeInstance = Trade.get(id)
        if (!tradeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'trade.label', default: 'Trade'), id])
            redirect(action: "list")
            return
        }

        [tradeInstance: tradeInstance]
    }

    def edit(Long id) {
        def tradeInstance = Trade.get(id)
        if (!tradeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'trade.label', default: 'Trade'), id])
            redirect(action: "list")
            return
        }

        [tradeInstance: tradeInstance]
    }

    def update(Long id, Long version) {
        def tradeInstance = Trade.get(id)
        if (!tradeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'trade.label', default: 'Trade'), id])
            redirect(action: "list")
            return
        }

        if (version != null) {
            if (tradeInstance.version > version) {
                tradeInstance.errors.rejectValue("version", "default.optimistic.locking.failure",
                        [message(code: 'trade.label', default: 'Trade')] as Object[],
                        "Another user has updated this Trade while you were editing")
                render(view: "edit", model: [tradeInstance: tradeInstance])
                return
            }
        }

        tradeInstance.properties = params

        if (!tradeInstance.save(flush: true)) {
            render(view: "edit", model: [tradeInstance: tradeInstance])
            return
        }

        flash.message = message(code: 'default.updated.message', args: [message(code: 'trade.label', default: 'Trade'), tradeInstance.id])
        redirect(action: "show", id: tradeInstance.id)
    }

    def delete(Long id) {
        def tradeInstance = Trade.get(id)
        if (!tradeInstance) {
            flash.message = message(code: 'default.not.found.message', args: [message(code: 'trade.label', default: 'Trade'), id])
            redirect(action: "list")
            return
        }

        try {
            tradeInstance.delete(flush: true)
            flash.message = message(code: 'default.deleted.message', args: [message(code: 'trade.label', default: 'Trade'), id])
            redirect(action: "list")
        }
        catch (DataIntegrityViolationException e) {
            flash.message = message(code: 'default.not.deleted.message', args: [message(code: 'trade.label', default: 'Trade'), id])
            redirect(action: "show", id: id)
        }
    }
}
