<%@ page import="com.netnumeri.server.finance.trading.StrategyCatalog" %>



<div class="control-group fieldcontain ${hasErrors(bean: strategyCatalogInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="strategyCatalog.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${strategyCatalogInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: strategyCatalogInstance, field: 'name', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategyCatalogInstance, field: 'subscriptions', 'error')} ">
    <label for="subscriptions" class="control-label"><g:message
            code="strategyCatalog.subscriptions.label"
            default="Subscriptions"/></label>

    <div class="controls">

        <ul class="one-to-many">
            <g:each in="${strategyCatalogInstance?.subscriptions ?}" var="s">
                <li><g:link controller="strategySubscription" action="show"
                            id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
            </g:each>
            <li class="add">
                <g:link controller="strategySubscription" action="create"
                        params="['strategyCatalog.id': strategyCatalogInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'strategySubscription.label', default: 'StrategySubscription')])}</g:link>
            </li>
        </ul>

        <span class="help-inline">${hasErrors(bean: strategyCatalogInstance, field: 'subscriptions', 'error')}</span>
    </div>
</div>

