<%@ page import="com.netnumeri.server.finance.trading.Signal" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'signal.label', default: 'Signal')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-signal" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="signal.dateCreated.label"
                                                     default="Date Created"/></td>

            <td valign="top" class="value"><g:formatDate date="${signalInstance?.dateCreated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="signal.day.label"
                                                     default="Day"/></td>

            <td valign="top" class="value"><g:formatDate date="${signalInstance?.day}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="signal.direction.label"
                                                     default="Direction"/></td>

            <td valign="top" class="value">${signalInstance?.direction?.encodeAsHTML()}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="signal.lastUpdated.label"
                                                     default="Last Updated"/></td>

            <td valign="top" class="value"><g:formatDate date="${signalInstance?.lastUpdated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="signal.name.label"
                                                     default="Name"/></td>

            <td valign="top" class="value">${fieldValue(bean: signalInstance, field: "name")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="signal.user.label"
                                                     default="User"/></td>

            <td valign="top" class="value"><g:link controller="member" action="show"
                                                   id="${signalInstance?.user?.id}">${signalInstance?.user?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="signal.value.label"
                                                     default="Value"/></td>

            <td valign="top" class="value">${fieldValue(bean: signalInstance, field: "value")}</td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
