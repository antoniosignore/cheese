<%@ page import="com.netnumeri.server.finance.candlestick.Pattern" %>



<div class="control-group fieldcontain ${hasErrors(bean: patternInstance, field: 'code', 'error')} ">
    <label for="code" class="control-label"><g:message
            code="pattern.code.label"
            default="Code"/></label>

    <div class="controls">
        <g:field type="number" name="code" value="${patternInstance.code}"/>
        <span class="help-inline">${hasErrors(bean: patternInstance, field: 'code', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: patternInstance, field: 'confirmation', 'error')} ">
    <label for="confirmation" class="control-label"><g:message
            code="pattern.confirmation.label"
            default="Confirmation"/></label>

    <div class="controls">
        <g:select name="confirmation" from="${com.netnumeri.server.enums.ConfirmationTypeEnum?.values()}" keys="${com.netnumeri.server.enums.ConfirmationTypeEnum.values()*.name()}" value="${patternInstance?.confirmation?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: patternInstance, field: 'confirmation', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: patternInstance, field: 'patternDefinition', 'error')} ">
    <label for="definition" class="control-label"><g:message
            code="pattern.definition.label"
            default="Definition"/></label>

    <div class="controls">
        <g:textField name="definition" value="${patternInstance?.definition}"/>
        <span class="help-inline">${hasErrors(bean: patternInstance, field: 'patternDefinition', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: patternInstance, field: 'noSticks', 'error')} ">
    <label for="noSticks" class="control-label"><g:message
            code="pattern.noSticks.label"
            default="No Sticks"/></label>

    <div class="controls">
        <g:field type="number" name="noSticks" value="${patternInstance.noSticks}"/>
        <span class="help-inline">${hasErrors(bean: patternInstance, field: 'noSticks', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: patternInstance, field: 'patternType', 'error')} ">
    <label for="patternType" class="control-label"><g:message
            code="pattern.patternType.label"
            default="Pattern Type"/></label>

    <div class="controls">
        <g:select name="patternType" from="${com.netnumeri.server.enums.PatternTypeEnum?.values()}" keys="${com.netnumeri.server.enums.PatternTypeEnum.values()*.name()}" value="${patternInstance?.patternType?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: patternInstance, field: 'patternType', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: patternInstance, field: 'recognition', 'error')} ">
    <label for="recognition" class="control-label"><g:message
            code="pattern.recognition.label"
            default="Recognition"/></label>

    <div class="controls">
        <g:textField name="recognition" value="${patternInstance?.recognition}"/>
        <span class="help-inline">${hasErrors(bean: patternInstance, field: 'recognition', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: patternInstance, field: 'relevanceType', 'error')} ">
    <label for="relevanceType" class="control-label"><g:message
            code="pattern.relevanceType.label"
            default="Relevance Type"/></label>

    <div class="controls">
        <g:select name="relevanceType" from="${com.netnumeri.server.enums.RelevanceTypeEnum?.values()}" keys="${com.netnumeri.server.enums.RelevanceTypeEnum.values()*.name()}" value="${patternInstance?.relevanceType?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: patternInstance, field: 'relevanceType', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: patternInstance, field: 'reliability', 'error')} ">
    <label for="reliability" class="control-label"><g:message
            code="pattern.reliability.label"
            default="Reliability"/></label>

    <div class="controls">
        <g:select name="reliability" from="${com.netnumeri.server.enums.ReliabilityTypeEnum?.values()}" keys="${com.netnumeri.server.enums.ReliabilityTypeEnum.values()*.name()}" value="${patternInstance?.reliability?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: patternInstance, field: 'reliability', 'error')}</span>
    </div>
</div>

