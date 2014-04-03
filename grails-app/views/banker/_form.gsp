<%@ page import="com.dtmc.club.Banker" %>



<div class="control-group fieldcontain ${hasErrors(bean: bankerInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="banker.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${bankerInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: bankerInstance, field: 'name', 'error')}</span>
    </div>
</div>

