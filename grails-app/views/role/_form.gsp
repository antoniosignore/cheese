<%@ page import="com.dtmc.security.Role" %>



<div class="control-group fieldcontain ${hasErrors(bean: roleInstance, field: 'authority', 'error')} ">
    <label for="authority" class="control-label"><g:message
            code="role.authority.label"
            default="Authority"/></label>

    <div class="controls">
        <g:textField name="authority" value="${roleInstance?.authority}"/>
        <span class="help-inline">${hasErrors(bean: roleInstance, field: 'authority', 'error')}</span>
    </div>
</div>

