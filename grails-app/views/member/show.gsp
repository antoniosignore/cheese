<%@ page import="com.dtmc.club.Member" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'member.label', default: 'Member')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-member" class="first">

<table class="table">
<tbody>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.username.label"
                                             default="Username"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "username")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.password.label"
                                             default="Password"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "password")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.firstname.label"
                                             default="Firstname"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "firstname")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.lastname.label"
                                             default="Lastname"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "lastname")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.email.label"
                                             default="Email"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "email")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.phone.label"
                                             default="Phone"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "phone")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.mobile.label"
                                             default="Mobile"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "mobile")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.city.label"
                                             default="City"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "city")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.state.label"
                                             default="State"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "state")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.country.label"
                                             default="Country"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "country")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.twitter.label"
                                             default="Twitter"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "twitter")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.facebook.label"
                                             default="Facebook"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "facebook")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.linkedin.label"
                                             default="Linkedin"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "linkedin")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.timezone.label"
                                             default="Timezone"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "timezone")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.accountExpired.label"
                                             default="Account Expired"/></td>

    <td valign="top" class="value"><g:formatBoolean boolean="${memberInstance?.accountExpired}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.accountLocked.label"
                                             default="Account Locked"/></td>

    <td valign="top" class="value"><g:formatBoolean boolean="${memberInstance?.accountLocked}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.address1.label"
                                             default="Address1"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "address1")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.address2.label"
                                             default="Address2"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "address2")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.club.label"
                                             default="Club"/></td>

    <td valign="top" class="value"><g:link controller="club" action="show"
                                           id="${memberInstance?.club?.id}">${memberInstance?.club?.toString()}</g:link></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.company.label"
                                             default="Company"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "company")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.enabled.label"
                                             default="Enabled"/></td>

    <td valign="top" class="value"><g:formatBoolean boolean="${memberInstance?.enabled}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.hoursWeeklyDedicated.label"
                                             default="Hours Weekly Dedicated"/></td>

    <td valign="top" class="value">${fieldValue(bean: memberInstance, field: "hoursWeeklyDedicated")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.indicators.label"
                                             default="Indicators"/></td>

    <td valign="top" style="text-align: left;" class="value">
        <ul>
            <g:each in="${memberInstance.indicators}" var="i">
                <li><g:link controller="userIndicators" action="show"
                            id="${i.id}">${i?.encodeAsHTML()}</g:link></li>
            </g:each>
        </ul>
    </td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.memberGoal.label"
                                             default="Member Goal"/></td>

    <td valign="top" class="value">${memberInstance?.memberGoal?.encodeAsHTML()}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.memberType.label"
                                             default="Member Type"/></td>

    <td valign="top" class="value">${memberInstance?.memberType?.encodeAsHTML()}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.passwordExpired.label"
                                             default="Password Expired"/></td>

    <td valign="top" class="value"><g:formatBoolean boolean="${memberInstance?.passwordExpired}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="member.small.label"
                                             default="Small"/></td>

    <td valign="top" class="value"><g:link controller="imageNode" action="show"
                                           id="${memberInstance?.small?.id}">${memberInstance?.small?.encodeAsHTML()}</g:link></td>

</tr>

</tbody>
</table>
</section>

</body>

</html>
