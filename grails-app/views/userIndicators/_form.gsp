<%@ page import="com.netnumeri.server.finance.indicator.UserIndicators" %>



<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'double1', 'error')} ">
    <label for="double1" class="control-label"><g:message
            code="userIndicators.double1.label"
            default="Double1"/></label>

    <div class="controls">
        <g:field type="number" name="double1" step="any" value="${userIndicatorsInstance.double1}"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'double1', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'double2', 'error')} ">
    <label for="double2" class="control-label"><g:message
            code="userIndicators.double2.label"
            default="Double2"/></label>

    <div class="controls">
        <g:field type="number" name="double2" step="any" value="${userIndicatorsInstance.double2}"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'double2', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'integer1', 'error')} ">
    <label for="integer1" class="control-label"><g:message
            code="userIndicators.integer1.label"
            default="Integer1"/></label>

    <div class="controls">
        <g:field type="number" name="integer1" value="${userIndicatorsInstance.integer1}"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'integer1', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'integer2', 'error')} ">
    <label for="integer2" class="control-label"><g:message
            code="userIndicators.integer2.label"
            default="Integer2"/></label>

    <div class="controls">
        <g:field type="number" name="integer2" value="${userIndicatorsInstance.integer2}"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'integer2', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'integer3', 'error')} ">
    <label for="integer3" class="control-label"><g:message
            code="userIndicators.integer3.label"
            default="Integer3"/></label>

    <div class="controls">
        <g:field type="number" name="integer3" value="${userIndicatorsInstance.integer3}"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'integer3', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="userIndicators.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${userIndicatorsInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'name', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'str1', 'error')} ">
    <label for="str1" class="control-label"><g:message
            code="userIndicators.str1.label"
            default="Str1"/></label>

    <div class="controls">
        <g:textField name="str1" value="${userIndicatorsInstance?.str1}"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'str1', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'type', 'error')} ">
    <label for="type" class="control-label"><g:message
            code="userIndicators.type.label"
            default="Type"/></label>

    <div class="controls">
        <g:select name="type" from="${com.netnumeri.server.enums.IndicatorEnum?.values()}"
                  keys="${com.netnumeri.server.enums.IndicatorEnum.values()*.name()}"
                  value="${userIndicatorsInstance?.type?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'type', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: userIndicatorsInstance, field: 'user', 'error')} ">
    <label for="user" class="control-label"><g:message
            code="userIndicators.user.label"
            default="User"/></label>

    <div class="controls">
        <g:select id="user" name="user.id" from="${com.dtmc.club.Member.list()}" optionKey="id"
                  value="${userIndicatorsInstance?.user?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: userIndicatorsInstance, field: 'user', 'error')}</span>
    </div>
</div>

