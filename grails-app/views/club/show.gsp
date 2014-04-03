<%@ page import="com.dtmc.club.Club" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'club.label', default: 'Club')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-club" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.agreement.label"
                                                     default="Agreement"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.banker.label"
                                                     default="Banker"/></td>

            <td valign="top" class="value"><g:link controller="banker" action="show"
                                                   id="${clubInstance?.banker?.id}">${clubInstance?.banker?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.broker.label"
                                                     default="Broker"/></td>

            <td valign="top" class="value"><g:link controller="broker" action="show"
                                                   id="${clubInstance?.broker?.id}">${clubInstance?.broker?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.dateCreated.label"
                                                     default="Date Created"/></td>

            <td valign="top" class="value"><g:formatDate date="${clubInstance?.dateCreated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.inauguralMeeting.label"
                                                     default="Inaugural Meeting"/></td>

            <td valign="top" class="value"><g:formatDate date="${clubInstance?.inauguralMeeting}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.joiningFee.label"
                                                     default="Joining Fee"/></td>

            <td valign="top" class="value">${fieldValue(bean: clubInstance, field: "joiningFee")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.lastUpdated.label"
                                                     default="Last Updated"/></td>

            <td valign="top" class="value"><g:formatDate date="${clubInstance?.lastUpdated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.legalStructure.label"
                                                     default="Legal Structure"/></td>

            <td valign="top" class="value"><g:link controller="legalStructure" action="show"
                                                   id="${clubInstance?.legalStructure?.id}">${clubInstance?.legalStructure?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.members.label"
                                                     default="Members"/></td>

            <td valign="top" style="text-align: left;" class="value">
                <ul>
                    <g:each in="${clubInstance.members}" var="m">
                        <li><g:link controller="member" action="show"
                                    id="${m.id}">${m?.encodeAsHTML()}</g:link></li>
                    </g:each>
                </ul>
            </td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.monthlySubscription.label"
                                                     default="Monthly Subscription"/></td>

            <td valign="top" class="value">${fieldValue(bean: clubInstance, field: "monthlySubscription")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.name.label"
                                                     default="Name"/></td>

            <td valign="top" class="value">${fieldValue(bean: clubInstance, field: "name")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.risk.label"
                                                     default="Risk"/></td>

            <td valign="top" class="value">${clubInstance?.risk?.encodeAsHTML()}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="club.yearsTimeSpan.label"
                                                     default="Years Time Span"/></td>

            <td valign="top" class="value">${fieldValue(bean: clubInstance, field: "yearsTimeSpan")}</td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
