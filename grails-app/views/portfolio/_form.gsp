<%@ page import="com.netnumeri.server.finance.finpojo.Portfolio" %>



<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'closeSeries', 'error')} ">
    <label for="closeSeries" class="control-label"><g:message
            code="portfolio.closeSeries.label"
            default="Close Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'closeSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'dailyarray', 'error')} ">
    <label for="dailyarray" class="control-label"><g:message
            code="portfolio.dailyarray.label"
            default="Dailyarray"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'dailyarray', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'description', 'error')} ">
    <label for="description" class="control-label"><g:message
            code="portfolio.description.label"
            default="Description"/></label>

    <div class="controls">
        <g:textField name="description" value="${portfolioInstance?.description}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'description', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'firstDate', 'error')} ">
    <label for="firstDate" class="control-label"><g:message
            code="portfolio.firstDate.label"
            default="First Date"/></label>

    <div class="controls">
        <bs:datePicker name="firstDate" precision="day" value="${portfolioInstance?.firstDate}" default="none"
                       noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'firstDate', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'highSeries', 'error')} ">
    <label for="highSeries" class="control-label"><g:message
            code="portfolio.highSeries.label"
            default="High Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'highSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'indicators', 'error')} ">
    <label for="indicators" class="control-label"><g:message
            code="portfolio.indicators.label"
            default="Indicators"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'indicators', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'isSpotFixed', 'error')} ">
    <label for="isSpotFixed" class="control-label"><g:message
            code="portfolio.isSpotFixed.label"
            default="Is Spot Fixed"/></label>

    <div class="controls">
        <bs:checkBox name="isSpotFixed" value="${portfolioInstance?.isSpotFixed}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'isSpotFixed', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'isVolatilityFixed', 'error')} ">
    <label for="isVolatilityFixed" class="control-label"><g:message
            code="portfolio.isVolatilityFixed.label"
            default="Is Volatility Fixed"/></label>

    <div class="controls">
        <bs:checkBox name="isVolatilityFixed" value="${portfolioInstance?.isVolatilityFixed}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'isVolatilityFixed', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'items', 'error')} ">
    <label for="items" class="control-label"><g:message
            code="portfolio.items.label"
            default="Items"/></label>

    <div class="controls">

        <ul class="one-to-many">
            <g:each in="${portfolioInstance?.items ?}" var="i">
                <li><g:link controller="portfolioEntry" action="show" id="${i.id}">${i?.encodeAsHTML()}</g:link></li>
            </g:each>
            <li class="add">
                <g:link controller="portfolioEntry" action="create"
                        params="['portfolio.id': portfolioInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'portfolioEntry.label', default: 'PortfolioEntry')])}</g:link>
            </li>
        </ul>

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'items', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'lastDate', 'error')} ">
    <label for="lastDate" class="control-label"><g:message
            code="portfolio.lastDate.label"
            default="Last Date"/></label>

    <div class="controls">
        <bs:datePicker name="lastDate" precision="day" value="${portfolioInstance?.lastDate}" default="none"
                       noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'lastDate', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'lastQuote', 'error')} ">
    <label for="lastQuote" class="control-label"><g:message
            code="portfolio.lastQuote.label"
            default="Last Quote"/></label>

    <div class="controls">
        <g:field type="number" name="lastQuote" step="any" value="${portfolioInstance.lastQuote}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'lastQuote', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'logReturnSeries', 'error')} ">
    <label for="logReturnSeries" class="control-label"><g:message
            code="portfolio.logReturnSeries.label"
            default="Log Return Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'logReturnSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'lowSeries', 'error')} ">
    <label for="lowSeries" class="control-label"><g:message
            code="portfolio.lowSeries.label"
            default="Low Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'lowSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'marketSpotShift', 'error')} required">
    <label for="marketSpotShift" class="control-label"><g:message
            code="portfolio.marketSpotShift.label"
            default="Market Spot Shift"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="marketSpotShift" step="any" required=""
                 value="${portfolioInstance.marketSpotShift}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'marketSpotShift', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'marketVolatilityShift', 'error')} required">
    <label for="marketVolatilityShift" class="control-label"><g:message
            code="portfolio.marketVolatilityShift.label"
            default="Market Volatility Shift"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="marketVolatilityShift" step="any" required=""
                 value="${portfolioInstance.marketVolatilityShift}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'marketVolatilityShift', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="portfolio.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${portfolioInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'name', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'openSeries', 'error')} ">
    <label for="openSeries" class="control-label"><g:message
            code="portfolio.openSeries.label"
            default="Open Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'openSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'portfolioType', 'error')} ">
    <label for="portfolioType" class="control-label"><g:message
            code="portfolio.portfolioType.label"
            default="Portfolio Type"/></label>

    <div class="controls">
        <g:select name="portfolioType" from="${com.netnumeri.server.enums.PortfolioTypeEnum?.values()}"
                  keys="${com.netnumeri.server.enums.PortfolioTypeEnum.values()*.name()}"
                  value="${portfolioInstance?.portfolioType?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'portfolioType', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'priceSeries', 'error')} ">
    <label for="priceSeries" class="control-label"><g:message
            code="portfolio.priceSeries.label"
            default="Price Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'priceSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'returnSeries', 'error')} ">
    <label for="returnSeries" class="control-label"><g:message
            code="portfolio.returnSeries.label"
            default="Return Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'returnSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'spot', 'error')} required">
    <label for="spot" class="control-label"><g:message
            code="portfolio.spot.label"
            default="Spot"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="spot" step="any" required="" value="${portfolioInstance.spot}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'spot', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'tempSpot', 'error')} required">
    <label for="tempSpot" class="control-label"><g:message
            code="portfolio.tempSpot.label"
            default="Temp Spot"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="tempSpot" step="any" required="" value="${portfolioInstance.tempSpot}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'tempSpot', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'tempVolatility', 'error')} required">
    <label for="tempVolatility" class="control-label"><g:message
            code="portfolio.tempVolatility.label"
            default="Temp Volatility"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="tempVolatility" step="any" required=""
                 value="${portfolioInstance.tempVolatility}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'tempVolatility', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'trades', 'error')} ">
    <label for="trades" class="control-label"><g:message
            code="portfolio.trades.label"
            default="Trades"/></label>

    <div class="controls">

        <ul class="one-to-many">
            <g:each in="${portfolioInstance?.trades ?}" var="t">
                <li><g:link controller="trade" action="show" id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
            </g:each>
            <li class="add">
                <g:link controller="trade" action="create"
                        params="['portfolio.id': portfolioInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'trade.label', default: 'Trade')])}</g:link>
            </li>
        </ul>

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'trades', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'volatility', 'error')} required">
    <label for="volatility" class="control-label"><g:message
            code="portfolio.volatility.label"
            default="Volatility"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="volatility" step="any" required="" value="${portfolioInstance.volatility}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'volatility', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'volumeLogReturnSeries', 'error')} ">
    <label for="volumeLogReturnSeries" class="control-label"><g:message
            code="portfolio.volumeLogReturnSeries.label"
            default="Volume Log Return Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'volumeLogReturnSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'volumeReturnSeries', 'error')} ">
    <label for="volumeReturnSeries" class="control-label"><g:message
            code="portfolio.volumeReturnSeries.label"
            default="Volume Return Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'volumeReturnSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'volumeSeries', 'error')} ">
    <label for="volumeSeries" class="control-label"><g:message
            code="portfolio.volumeSeries.label"
            default="Volume Series"/></label>

    <div class="controls">

        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'volumeSeries', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: portfolioInstance, field: 'wealth', 'error')} required">
    <label for="wealth" class="control-label"><g:message
            code="portfolio.wealth.label"
            default="Wealth"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="wealth" step="any" required="" value="${portfolioInstance.wealth}"/>
        <span class="help-inline">${hasErrors(bean: portfolioInstance, field: 'wealth', 'error')}</span>
    </div>
</div>

