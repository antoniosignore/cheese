<%@ page import="com.netnumeri.server.finance.finpojo.Trade" %>



<div class="control-group fieldcontain ${hasErrors(bean: tradeInstance, field: 'amount', 'error')} ">
    <label for="amount" class="control-label"><g:message
            code="trade.amount.label"
            default="Amount"/></label>

    <div class="controls">
        <g:field type="number" name="amount" value="${tradeInstance.amount}"/>
        <span class="help-inline">${hasErrors(bean: tradeInstance, field: 'amount', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: tradeInstance, field: 'blog', 'error')} ">
    <label for="blog" class="control-label"><g:message
            code="trade.blog.label"
            default="Blog"/></label>

    <div class="controls">
        <g:textField name="blog" value="${tradeInstance?.blog}"/>
        <span class="help-inline">${hasErrors(bean: tradeInstance, field: 'blog', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: tradeInstance, field: 'cost', 'error')} ">
    <label for="cost" class="control-label"><g:message
            code="trade.cost.label"
            default="Cost"/></label>

    <div class="controls">
        <g:field type="number" name="cost" step="any" value="${tradeInstance.cost}"/>
        <span class="help-inline">${hasErrors(bean: tradeInstance, field: 'cost', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: tradeInstance, field: 'instrument', 'error')} ">
    <label for="instrument" class="control-label"><g:message
            code="trade.instrument.label"
            default="Instrument"/></label>

    <div class="controls">
        <g:select id="instrument" name="instrument.id" from="${com.netnumeri.server.finance.finpojo.Instrument.list()}" optionKey="id" value="${tradeInstance?.instrument?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: tradeInstance, field: 'instrument', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: tradeInstance, field: 'portfolio', 'error')} ">
    <label for="portfolio" class="control-label"><g:message
            code="trade.portfolio.label"
            default="Portfolio"/></label>

    <div class="controls">
        <g:select id="portfolio" name="portfolio.id" from="${com.netnumeri.server.finance.finpojo.Portfolio.list()}" optionKey="id" value="${tradeInstance?.portfolio?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: tradeInstance, field: 'portfolio', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: tradeInstance, field: 'price', 'error')} ">
    <label for="price" class="control-label"><g:message
            code="trade.price.label"
            default="Price"/></label>

    <div class="controls">
        <g:field type="number" name="price" step="any" value="${tradeInstance.price}"/>
        <span class="help-inline">${hasErrors(bean: tradeInstance, field: 'price', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: tradeInstance, field: 'tradeAction', 'error')} ">
    <label for="tradeAction" class="control-label"><g:message
            code="trade.tradeAction.label"
            default="Trade Action"/></label>

    <div class="controls">
        <g:select name="tradeAction" from="${com.netnumeri.server.finance.beans.TradeEnum?.values()}" keys="${com.netnumeri.server.finance.beans.TradeEnum.values()*.name()}" value="${tradeInstance?.tradeAction?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: tradeInstance, field: 'tradeAction', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: tradeInstance, field: 'tradeDate', 'error')} ">
    <label for="tradeDate" class="control-label"><g:message
            code="trade.tradeDate.label"
            default="Trade Date"/></label>

    <div class="controls">
        <bs:datePicker name="tradeDate" precision="day"  value="${tradeInstance?.tradeDate}" default="none" noSelection="['': '']" />
        <span class="help-inline">${hasErrors(bean: tradeInstance, field: 'tradeDate', 'error')}</span>
    </div>
</div>

