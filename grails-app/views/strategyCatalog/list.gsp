<%@ page import="com.netnumeri.server.finance.trading.StrategyCatalog" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'strategyCatalog.label', default: 'StrategyCatalog')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-strategyCatalog" class="first">
    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'strategyCatalog.dateCreated.label', default: 'Date Created')}"/>

            <g:sortableColumn property="lastUpdated"
                              title="${message(code: 'strategyCatalog.lastUpdated.label', default: 'Last Updated')}"/>

            <g:sortableColumn property="name"
                              title="${message(code: 'strategyCatalog.name.label', default: 'Name')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${strategyCatalogInstanceList}" status="i" var="strategyCatalogInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${strategyCatalogInstance.id}">${fieldValue(bean: strategyCatalogInstance, field: "dateCreated")}</g:link></td>

                <td><g:formatDate date="${strategyCatalogInstance.lastUpdated}"/></td>

                <td>${fieldValue(bean: strategyCatalogInstance, field: "name")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <dtmc:paginate total="${strategyCatalogInstanceTotal}"/>
    </div>
</section>
</body>
</html>
