<%@ page import="com.netnumeri.server.finance.trading.StrategyExecution" %>



<div class="control-group fieldcontain ${hasErrors(bean: strategyExecutionInstance, field: 'instrument', 'error')} ">
    <label for="instrument" class="control-label"><g:message
            code="strategyExecution.instrument.label"
            default="Instrument"/></label>

    <div class="controls">
        <g:select id="instrument" name="instrument.id" from="${com.netnumeri.server.finance.finpojo.Instrument.list()}"
                  optionKey="id" value="${strategyExecutionInstance?.instrument?.id}" class="many-to-one"
                  noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: strategyExecutionInstance, field: 'instrument', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategyExecutionInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="strategyExecution.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${strategyExecutionInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: strategyExecutionInstance, field: 'name', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategyExecutionInstance, field: 'signals', 'error')} ">
    <label for="signals" class="control-label"><g:message
            code="strategyExecution.signals.label"
            default="Signals"/></label>

    <div class="controls">
        <g:select name="signals" from="${com.netnumeri.server.finance.trading.Signal.list()}" multiple="multiple"
                  optionKey="id" size="5" value="${strategyExecutionInstance?.signals*.id}" class="many-to-many"/>
        <span class="help-inline">${hasErrors(bean: strategyExecutionInstance, field: 'signals', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategyExecutionInstance, field: 'user', 'error')} ">
    <label for="user" class="control-label"><g:message
            code="strategyExecution.user.label"
            default="User"/></label>

    <div class="controls">
        <g:select id="user" name="user.id" from="${com.dtmc.club.Member.list()}" optionKey="id"
                  value="${strategyExecutionInstance?.user?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: strategyExecutionInstance, field: 'user', 'error')}</span>
    </div>
</div>

