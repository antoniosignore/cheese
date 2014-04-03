<%@ page import="com.netnumeri.server.finance.finpojo.asset.Stock" %>


<div class="control-group fieldcontain ${hasErrors(bean: stockInstance, field: 'description', 'error')} ">
    <label for="description" class="control-label"><g:message code="stock.description.label"
                                                              default="Description"/></label>

    <div class="controls">
        <g:textField name="description" value="${stockInstance?.description}"/>
        <span class="help-inline">${hasErrors(bean: stockInstance, field: 'description', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: stockInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message code="stock.name.label" default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${stockInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: stockInstance, field: 'name', 'error')}</span>
    </div>
</div>

<g:render template="/common/datepicker"/>
