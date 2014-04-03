<%@ page import="com.netnumeri.server.finance.trading.Signal" %>



<div class="control-group fieldcontain ${hasErrors(bean: signalInstance, field: 'day', 'error')} ">
    <label for="day" class="control-label"><g:message
            code="signal.day.label"
            default="Day"/></label>

    <div class="controls">
        <bs:datePicker name="day" precision="day" value="${signalInstance?.day}" default="none" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: signalInstance, field: 'day', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: signalInstance, field: 'direction', 'error')} ">
    <label for="direction" class="control-label"><g:message
            code="signal.direction.label"
            default="Direction"/></label>

    <div class="controls">
        <g:select name="direction" from="${com.netnumeri.server.finance.beans.TradeEnum?.values()}"
                  keys="${com.netnumeri.server.finance.beans.TradeEnum.values()*.name()}"
                  value="${signalInstance?.direction?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: signalInstance, field: 'direction', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: signalInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="signal.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${signalInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: signalInstance, field: 'name', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: signalInstance, field: 'user', 'error')} ">
    <label for="user" class="control-label"><g:message
            code="signal.user.label"
            default="User"/></label>

    <div class="controls">
        <g:select id="user" name="user.id" from="${com.dtmc.club.Member.list()}" optionKey="id"
                  value="${signalInstance?.user?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: signalInstance, field: 'user', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: signalInstance, field: 'value', 'error')} required">
    <label for="value" class="control-label"><g:message
            code="signal.value.label"
            default="Value"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="value" step="any" required="" value="${signalInstance.value}"/>
        <span class="help-inline">${hasErrors(bean: signalInstance, field: 'value', 'error')}</span>
    </div>
</div>

