<%@ page import="com.netnumeri.server.finance.indicator.UserIndicators" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'userIndicators.label', default: 'UserIndicators')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-userIndicators" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.dateCreated.label"
                                                     default="Date Created"/></td>

            <td valign="top" class="value"><g:formatDate date="${userIndicatorsInstance?.dateCreated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.double1.label"
                                                     default="Double1"/></td>

            <td valign="top" class="value">${fieldValue(bean: userIndicatorsInstance, field: "double1")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.double2.label"
                                                     default="Double2"/></td>

            <td valign="top" class="value">${fieldValue(bean: userIndicatorsInstance, field: "double2")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.integer1.label"
                                                     default="Integer1"/></td>

            <td valign="top" class="value">${fieldValue(bean: userIndicatorsInstance, field: "integer1")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.integer2.label"
                                                     default="Integer2"/></td>

            <td valign="top" class="value">${fieldValue(bean: userIndicatorsInstance, field: "integer2")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.integer3.label"
                                                     default="Integer3"/></td>

            <td valign="top" class="value">${fieldValue(bean: userIndicatorsInstance, field: "integer3")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.lastUpdated.label"
                                                     default="Last Updated"/></td>

            <td valign="top" class="value"><g:formatDate date="${userIndicatorsInstance?.lastUpdated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.name.label"
                                                     default="Name"/></td>

            <td valign="top" class="value">${fieldValue(bean: userIndicatorsInstance, field: "name")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.str1.label"
                                                     default="Str1"/></td>

            <td valign="top" class="value">${fieldValue(bean: userIndicatorsInstance, field: "str1")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.type.label"
                                                     default="Type"/></td>

            <td valign="top" class="value">${userIndicatorsInstance?.type?.encodeAsHTML()}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="userIndicators.user.label"
                                                     default="User"/></td>

            <td valign="top" class="value"><g:link controller="member" action="show"
                                                   id="${userIndicatorsInstance?.user?.id}">${userIndicatorsInstance?.user?.encodeAsHTML()}</g:link></td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
