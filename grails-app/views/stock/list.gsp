<%@ page import="com.netnumeri.server.finance.finpojo.asset.Stock" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'stock.label', default: 'Stock')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-stock" class="first">

    <table class="table table-striped table-bordered table-condensed table-hover">
        <thead>
        <tr>

            <g:sortableColumn property="name" title="${message(code: 'stock.name.label', default: 'Name')}"/>

            <g:sortableColumn property="description"
                              title="${message(code: 'stock.description.label', default: 'Description')}"/>

            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'stock.dateCreated.label', default: 'Date Created')}"/>

            <g:sortableColumn property="lastUpdated"
                              title="${message(code: 'stock.lastUpdated.label', default: 'Last Updated')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${stockInstanceList}" status="i" var="stockInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${stockInstance.id}">${fieldValue(bean: stockInstance, field: "name")}</g:link></td>

                <td>${fieldValue(bean: stockInstance, field: "description")}</td>

                <td>${fieldValue(bean: stockInstance, field: "dateCreated")}</td>

                <td>${fieldValue(bean: stockInstance, field: "lastUpdated")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <dtmc:paginate total="${stockInstanceTotal}"/>
    </div>
</section>

</body>

</html>
