<%@ page import="com.dtmc.security.Role" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'role.label', default: 'Role')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-role" class="first">

    <table class="table table-striped table-bordered table-condensed table-hover">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="role.authority.label"
                                                     default="Authority"/></td>

            <td valign="top" class="value">${fieldValue(bean: roleInstance, field: "authority")}</td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
