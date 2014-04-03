<%@ page import="com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla" %>



<div class="control-group fieldcontain ${hasErrors(bean: vanillaInstance, field: 'interestRate', 'error')} required">
    <label for="interestRate" class="control-label"><g:message
            code="vanilla.interestRate.label"
            default="Interest Rate"/><span class="required-indicator">*</span></label>

    <div class="controls">
        <g:field type="number" name="interestRate" step="any" required="" value="${vanillaInstance.interestRate}"/>
        <span class="help-inline">${hasErrors(bean: vanillaInstance, field: 'interestRate', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: vanillaInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="vanilla.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${vanillaInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: vanillaInstance, field: 'name', 'error')}</span>
    </div>
</div>

