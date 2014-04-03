<%@ page import="com.dtmc.club.Club" %>



<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'agreement', 'error')} ">
    <label for="agreement" class="control-label"><g:message
            code="club.agreement.label"
            default="Agreement"/></label>

    <div class="controls">
        <input type="file" id="agreement" name="agreement"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'agreement', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'banker', 'error')} ">
    <label for="banker" class="control-label"><g:message
            code="club.banker.label"
            default="Banker"/></label>

    <div class="controls">
        <g:select id="banker" name="banker.id" from="${com.dtmc.club.Banker.list()}" optionKey="id"
                  value="${clubInstance?.banker?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'banker', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'broker', 'error')} ">
    <label for="broker" class="control-label"><g:message
            code="club.broker.label"
            default="Broker"/></label>

    <div class="controls">
        <g:select id="broker" name="broker.id" from="${com.dtmc.club.Broker.list()}" optionKey="id"
                  value="${clubInstance?.broker?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'broker', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'inauguralMeeting', 'error')} ">
    <label for="inauguralMeeting" class="control-label"><g:message
            code="club.inauguralMeeting.label"
            default="Inaugural Meeting"/></label>

    <div class="controls">
        <bs:datePicker name="inauguralMeeting" precision="day" value="${clubInstance?.inauguralMeeting}" default="none"
                       noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'inauguralMeeting', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'joiningFee', 'error')} ">
    <label for="joiningFee" class="control-label"><g:message
            code="club.joiningFee.label"
            default="Joining Fee"/></label>

    <div class="controls">
        <g:field type="number" name="joiningFee" step="any" value="${clubInstance.joiningFee}"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'joiningFee', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'legalStructure', 'error')} ">
    <label for="legalStructure" class="control-label"><g:message
            code="club.legalStructure.label"
            default="Legal Structure"/></label>

    <div class="controls">
        <g:select id="legalStructure" name="legalStructure.id" from="${com.dtmc.club.LegalStructure.list()}"
                  optionKey="id" value="${clubInstance?.legalStructure?.id}" class="many-to-one"
                  noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'legalStructure', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'members', 'error')} ">
    <label for="members" class="control-label"><g:message
            code="club.members.label"
            default="Members"/></label>

    <div class="controls">

        <ul class="one-to-many">
            <g:each in="${clubInstance?.members ?}" var="m">
                <li><g:link controller="member" action="show" id="${m.id}">${m?.encodeAsHTML()}</g:link></li>
            </g:each>
            <li class="add">
                <g:link controller="member" action="create"
                        params="['club.id': clubInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'member.label', default: 'Member')])}</g:link>
            </li>
        </ul>

        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'members', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'monthlySubscription', 'error')} ">
    <label for="monthlySubscription" class="control-label"><g:message
            code="club.monthlySubscription.label"
            default="Monthly Subscription"/></label>

    <div class="controls">
        <g:field type="number" name="monthlySubscription" step="any" value="${clubInstance.monthlySubscription}"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'monthlySubscription', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'name', 'error')} ">
    <label for="name" class="control-label"><g:message
            code="club.name.label"
            default="Name"/></label>

    <div class="controls">
        <g:textField name="name" value="${clubInstance?.name}"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'name', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'risk', 'error')} ">
    <label for="risk" class="control-label"><g:message
            code="club.risk.label"
            default="Risk"/></label>

    <div class="controls">
        <g:select name="risk" from="${com.netnumeri.server.enums.RiskEnum?.values()}"
                  keys="${com.netnumeri.server.enums.RiskEnum.values()*.name()}" value="${clubInstance?.risk?.name()}"
                  noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'risk', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: clubInstance, field: 'yearsTimeSpan', 'error')} ">
    <label for="yearsTimeSpan" class="control-label"><g:message
            code="club.yearsTimeSpan.label"
            default="Years Time Span"/></label>

    <div class="controls">
        <g:field type="number" name="yearsTimeSpan" value="${clubInstance.yearsTimeSpan}"/>
        <span class="help-inline">${hasErrors(bean: clubInstance, field: 'yearsTimeSpan', 'error')}</span>
    </div>
</div>

