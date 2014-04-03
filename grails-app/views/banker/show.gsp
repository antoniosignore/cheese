<%@ page import="com.dtmc.club.Banker" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'banker.label', default: 'Banker')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-banker" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="banker.name.label"
                                                     default="Name"/></td>

            <td valign="top" class="value">${fieldValue(bean: bankerInstance, field: "name")}</td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
