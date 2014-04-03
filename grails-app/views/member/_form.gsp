<%@ page import="com.dtmc.club.Member" %>



<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'username', 'error')} ">
    <label for="username" class="control-label"><g:message
            code="member.username.label"
            default="Username"/></label>

    <div class="controls">
        <g:textField name="username" value="${memberInstance?.username}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'username', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'password', 'error')} ">
    <label for="password" class="control-label"><g:message
            code="member.password.label"
            default="Password"/></label>

    <div class="controls">
        <g:textField name="password" value="${memberInstance?.password}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'password', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'firstname', 'error')} ">
    <label for="firstname" class="control-label"><g:message
            code="member.firstname.label"
            default="Firstname"/></label>

    <div class="controls">
        <g:textField name="firstname" maxlength="30" value="${memberInstance?.firstname}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'firstname', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'lastname', 'error')} ">
    <label for="lastname" class="control-label"><g:message
            code="member.lastname.label"
            default="Lastname"/></label>

    <div class="controls">
        <g:textField name="lastname" maxlength="30" value="${memberInstance?.lastname}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'lastname', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'email', 'error')} ">
    <label for="email" class="control-label"><g:message
            code="member.email.label"
            default="Email"/></label>

    <div class="controls">
        <g:field type="email" name="email" value="${memberInstance?.email}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'email', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'phone', 'error')} ">
    <label for="phone" class="control-label"><g:message
            code="member.phone.label"
            default="Phone"/></label>

    <div class="controls">
        <g:textField name="phone" maxlength="15" value="${memberInstance?.phone}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'phone', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'mobile', 'error')} ">
    <label for="mobile" class="control-label"><g:message
            code="member.mobile.label"
            default="Mobile"/></label>

    <div class="controls">
        <g:textField name="mobile" maxlength="15" value="${memberInstance?.mobile}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'mobile', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'city', 'error')} ">
    <label for="city" class="control-label"><g:message
            code="member.city.label"
            default="City"/></label>

    <div class="controls">
        <g:textField name="city" maxlength="20" value="${memberInstance?.city}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'city', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'state', 'error')} ">
    <label for="state" class="control-label"><g:message
            code="member.state.label"
            default="State"/></label>

    <div class="controls">
        <g:textField name="state" maxlength="20" value="${memberInstance?.state}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'state', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'country', 'error')} ">
    <label for="country" class="control-label"><g:message
            code="member.country.label"
            default="Country"/></label>

    <div class="controls">
        <g:textField name="country" maxlength="20" value="${memberInstance?.country}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'country', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'twitter', 'error')} ">
    <label for="twitter" class="control-label"><g:message
            code="member.twitter.label"
            default="Twitter"/></label>

    <div class="controls">
        <g:textField name="twitter" maxlength="200" value="${memberInstance?.twitter}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'twitter', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'facebook', 'error')} ">
    <label for="facebook" class="control-label"><g:message
            code="member.facebook.label"
            default="Facebook"/></label>

    <div class="controls">
        <g:textField name="facebook" maxlength="200" value="${memberInstance?.facebook}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'facebook', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'linkedin', 'error')} ">
    <label for="linkedin" class="control-label"><g:message
            code="member.linkedin.label"
            default="Linkedin"/></label>

    <div class="controls">
        <g:textField name="linkedin" maxlength="200" value="${memberInstance?.linkedin}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'linkedin', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'timezone', 'error')} ">
    <label for="timezone" class="control-label"><g:message
            code="member.timezone.label"
            default="Timezone"/></label>

    <div class="controls">
        <g:textField name="timezone" value="${memberInstance?.timezone}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'timezone', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'accountExpired', 'error')} ">
    <label for="accountExpired" class="control-label"><g:message
            code="member.accountExpired.label"
            default="Account Expired"/></label>

    <div class="controls">
        <bs:checkBox name="accountExpired" value="${memberInstance?.accountExpired}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'accountExpired', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'accountLocked', 'error')} ">
    <label for="accountLocked" class="control-label"><g:message
            code="member.accountLocked.label"
            default="Account Locked"/></label>

    <div class="controls">
        <bs:checkBox name="accountLocked" value="${memberInstance?.accountLocked}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'accountLocked', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'address1', 'error')} ">
    <label for="address1" class="control-label"><g:message
            code="member.address1.label"
            default="Address1"/></label>

    <div class="controls">
        <g:textField name="address1" value="${memberInstance?.address1}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'address1', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'address2', 'error')} ">
    <label for="address2" class="control-label"><g:message
            code="member.address2.label"
            default="Address2"/></label>

    <div class="controls">
        <g:textField name="address2" value="${memberInstance?.address2}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'address2', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'club', 'error')} ">
    <label for="club" class="control-label"><g:message
            code="member.club.label"
            default="Club"/></label>

    <div class="controls">
        <g:select id="club" name="club.id" from="${com.dtmc.club.Club.list()}" optionKey="id"
                  value="${memberInstance?.club?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'club', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'company', 'error')} ">
    <label for="company" class="control-label"><g:message
            code="member.company.label"
            default="Company"/></label>

    <div class="controls">
        <g:textField name="company" value="${memberInstance?.company}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'company', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'enabled', 'error')} ">
    <label for="enabled" class="control-label"><g:message
            code="member.enabled.label"
            default="Enabled"/></label>

    <div class="controls">
        <bs:checkBox name="enabled" value="${memberInstance?.enabled}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'enabled', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'hoursWeeklyDedicated', 'error')} ">
    <label for="hoursWeeklyDedicated" class="control-label"><g:message
            code="member.hoursWeeklyDedicated.label"
            default="Hours Weekly Dedicated"/></label>

    <div class="controls">
        <g:field type="number" name="hoursWeeklyDedicated" value="${memberInstance.hoursWeeklyDedicated}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'hoursWeeklyDedicated', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'indicators', 'error')} ">
    <label for="indicators" class="control-label"><g:message
            code="member.indicators.label"
            default="Indicators"/></label>

    <div class="controls">

        <ul class="one-to-many">
            <g:each in="${memberInstance?.indicators ?}" var="i">
                <li><g:link controller="userIndicators" action="show" id="${i.id}">${i?.encodeAsHTML()}</g:link></li>
            </g:each>
            <li class="add">
                <g:link controller="userIndicators" action="create"
                        params="['member.id': memberInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'userIndicators.label', default: 'UserIndicators')])}</g:link>
            </li>
        </ul>

        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'indicators', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'memberGoal', 'error')} ">
    <label for="memberGoal" class="control-label"><g:message
            code="member.memberGoal.label"
            default="Member Goal"/></label>

    <div class="controls">
        <g:select name="memberGoal" from="${com.netnumeri.server.enums.MemberGoalEnum?.values()}"
                  keys="${com.netnumeri.server.enums.MemberGoalEnum.values()*.name()}"
                  value="${memberInstance?.memberGoal?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'memberGoal', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'memberType', 'error')} ">
    <label for="memberType" class="control-label"><g:message
            code="member.memberType.label"
            default="Member Type"/></label>

    <div class="controls">
        <g:select name="memberType" from="${com.netnumeri.server.enums.MemberTypeEnum?.values()}"
                  keys="${com.netnumeri.server.enums.MemberTypeEnum.values()*.name()}"
                  value="${memberInstance?.memberType?.name()}" noSelection="['': '']"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'memberType', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'passwordExpired', 'error')} ">
    <label for="passwordExpired" class="control-label"><g:message
            code="member.passwordExpired.label"
            default="Password Expired"/></label>

    <div class="controls">
        <bs:checkBox name="passwordExpired" value="${memberInstance?.passwordExpired}"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'passwordExpired', 'error')}</span>
    </div>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: memberInstance, field: 'small', 'error')} ">
    <label for="small" class="control-label"><g:message
            code="member.small.label"
            default="Small"/></label>

    <div class="controls">
        <g:select id="small" name="small.id" from="${com.dtmc.club.ImageNode.list()}" optionKey="id"
                  value="${memberInstance?.small?.id}" class="many-to-one" noSelection="['null': '']"/>
        <span class="help-inline">${hasErrors(bean: memberInstance, field: 'small', 'error')}</span>
    </div>
</div>

