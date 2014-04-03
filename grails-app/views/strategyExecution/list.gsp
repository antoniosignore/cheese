<%@ page import="com.netnumeri.server.finance.trading.StrategyExecution" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'strategyExecution.label', default: 'StrategyExecution')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-strategyExecution" class="first">
    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'strategyExecution.dateCreated.label', default: 'Date Created')}"/>

            <th><g:message code="strategyExecution.instrument.label" default="Instrument"/></th>

            <g:sortableColumn property="lastUpdated"
                              title="${message(code: 'strategyExecution.lastUpdated.label', default: 'Last Updated')}"/>

            <g:sortableColumn property="name"
                              title="${message(code: 'strategyExecution.name.label', default: 'Name')}"/>

            <th><g:message code="strategyExecution.user.label" default="User"/></th>

        </tr>
        </thead>
        <tbody>
        <g:each in="${strategyExecutionInstanceList}" status="i" var="strategyExecutionInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${strategyExecutionInstance.id}">${fieldValue(bean: strategyExecutionInstance, field: "dateCreated")}</g:link></td>

                <td>${fieldValue(bean: strategyExecutionInstance, field: "instrument")}</td>

                <td><g:formatDate date="${strategyExecutionInstance.lastUpdated}"/></td>

                <td>${fieldValue(bean: strategyExecutionInstance, field: "name")}</td>

                <td>${fieldValue(bean: strategyExecutionInstance, field: "user")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <dtmc:paginate total="${strategyExecutionInstanceTotal}"/>
    </div>
</section>
</body>
</html>
