<%@ page import="com.dtmc.security.Role" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'role.label', default: 'Role')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-role" class="first">

    <table class="table table-striped table-bordered table-condensed table-hover">
        <thead>
        <tr>

            <g:sortableColumn property="authority"
                              title="${message(code: 'role.authority.label', default: 'Authority')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${roleInstanceList}" status="i" var="roleInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${roleInstance.id}">${fieldValue(bean: roleInstance, field: "authority")}</g:link></td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <bs:paginate total="${roleInstanceTotal}"/>
    </div>
</section>

</body>

</html>
