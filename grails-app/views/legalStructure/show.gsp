<%@ page import="com.dtmc.club.LegalStructure" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'legalStructure.label', default: 'LegalStructure')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-legalStructure" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="legalStructure.name.label"
                                                     default="Name"/></td>

            <td valign="top" class="value">${fieldValue(bean: legalStructureInstance, field: "name")}</td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
