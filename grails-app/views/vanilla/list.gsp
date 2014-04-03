<%@ page import="com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'vanilla.label', default: 'Vanilla')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-vanilla" class="first">

    <table class="table table-striped table-bordered table-condensed table-hover">
        <thead>
        <tr>

            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'vanilla.dateCreated.label', default: 'Date Created')}"/>

            <g:sortableColumn property="interestRate"
                              title="${message(code: 'vanilla.interestRate.label', default: 'Interest Rate')}"/>

            <g:sortableColumn property="lastUpdated"
                              title="${message(code: 'vanilla.lastUpdated.label', default: 'Last Updated')}"/>

            <g:sortableColumn property="name"
                              title="${message(code: 'vanilla.name.label', default: 'Name')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${vanillaInstanceList}" status="i" var="vanillaInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${vanillaInstance.id}">${fieldValue(bean: vanillaInstance, field: "dateCreated")}</g:link></td>

                <td>${fieldValue(bean: vanillaInstance, field: "interestRate")}</td>

                <td><g:formatDate date="${vanillaInstance.lastUpdated}"/></td>

                <td>${fieldValue(bean: vanillaInstance, field: "name")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <bs:paginate total="${vanillaInstanceTotal}"/>
    </div>
</section>

</body>

</html>
