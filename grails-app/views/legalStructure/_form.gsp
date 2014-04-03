<%@ page import="com.dtmc.club.LegalStructure" %>



<div class="control-group fieldcontain ${hasErrors(bean: legalStructureInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="legalStructure.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${legalStructureInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: legalStructureInstance, field: 'name', 'error')}</span>
    </div>
</div>

