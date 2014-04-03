<%@ page import="com.netnumeri.server.finance.trading.StrategySubscription" %>



<div class="control-group fieldcontain ${hasErrors(bean: strategySubscriptionInstance, field: 'strategy', 'error')} ">
    <label for="strategy" class="control-label"><g:message
            code="strategySubscription.strategy.label"
            default="Strategy"/></label>

    <div class="controls">
        <g:select id="strategy" name="strategy.id" from="${com.netnumeri.server.finance.trading.StrategyCatalog.list()}"
                  optionKey="id" value="${strategySubscriptionInstance?.strategy?.id}" class="many-to-one"
                  noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: strategySubscriptionInstance, field: 'strategy', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategySubscriptionInstance, field: 'user', 'error')} ">
    <label for="user" class="control-label"><g:message
            code="strategySubscription.user.label"
            default="User"/></label>

    <div class="controls">
        <g:select id="user" name="user.id" from="${com.dtmc.club.Member.list()}" optionKey="id"
                  value="${strategySubscriptionInstance?.user?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: strategySubscriptionInstance, field: 'user', 'error')}</span>
    </div>
</div>

