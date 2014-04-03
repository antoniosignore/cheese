<%@ page import="com.netnumeri.server.finance.finpojo.PortfolioEntry" %>



<div class="control-group fieldcontain ${hasErrors(bean: portfolioEntryInstance, field: 'amount', 'error')} ">
    <label for="amount" class="control-label"><g:message
            code="portfolioEntry.amount.label"
            default="Amount"/></label>

    <div class="controls">
        <g:field type="number" name="amount" value="${portfolioEntryInstance.amount}"/>
        <span class="help-inline">${hasErrors(bean: portfolioEntryInstance, field: 'amount', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioEntryInstance, field: 'instrument', 'error')} ">
    <label for="instrument" class="control-label"><g:message
            code="portfolioEntry.instrument.label"
            default="Instrument"/></label>

    <div class="controls">
        <g:select id="instrument" name="instrument.id" from="${com.netnumeri.server.finance.finpojo.Instrument.list()}"
                  optionKey="id" value="${portfolioEntryInstance?.instrument?.id}" class="many-to-one"
                  noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: portfolioEntryInstance, field: 'instrument', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioEntryInstance, field: 'portfolio', 'error')} ">
    <label for="portfolio" class="control-label"><g:message
            code="portfolioEntry.portfolio.label"
            default="Portfolio"/></label>

    <div class="controls">
        <g:select id="portfolio" name="portfolio.id" from="${com.netnumeri.server.finance.finpojo.Portfolio.list()}"
                  optionKey="id" value="${portfolioEntryInstance?.portfolio?.id}" class="many-to-one"
                  noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: portfolioEntryInstance, field: 'portfolio', 'error')}</span>
    </div>
</div>

