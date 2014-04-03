<%@ page import="com.dtmc.club.Banker" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'banker.label', default: 'Banker')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-banker" class="first">

    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="name"
                              title="${message(code: 'banker.name.label', default: 'Name')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${bankerInstanceList}" status="i" var="bankerInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${bankerInstance.id}">${fieldValue(bean: bankerInstance, field: "name")}</g:link></td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <bs:paginate total="${bankerInstanceTotal}"/>
    </div>
</section>

</body>

</html>
