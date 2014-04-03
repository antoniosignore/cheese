<%@ page import="com.netnumeri.server.finance.trading.StrategySubscription" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'strategySubscription.label', default: 'StrategySubscription')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-strategySubscription" class="first">
    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'strategySubscription.dateCreated.label', default: 'Date Created')}"/>

            <g:sortableColumn property="lastUpdated"
                              title="${message(code: 'strategySubscription.lastUpdated.label', default: 'Last Updated')}"/>

            <th><g:message code="strategySubscription.strategy.label" default="Strategy"/></th>

            <th><g:message code="strategySubscription.user.label" default="User"/></th>

        </tr>
        </thead>
        <tbody>
        <g:each in="${strategySubscriptionInstanceList}" status="i" var="strategySubscriptionInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${strategySubscriptionInstance.id}">${fieldValue(bean: strategySubscriptionInstance, field: "dateCreated")}</g:link></td>

                <td><g:formatDate date="${strategySubscriptionInstance.lastUpdated}"/></td>

                <td>${fieldValue(bean: strategySubscriptionInstance, field: "strategy")}</td>

                <td>${fieldValue(bean: strategySubscriptionInstance, field: "user")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <dtmc:paginate total="${strategySubscriptionInstanceTotal}"/>
    </div>
</section>
</body>
</html>
