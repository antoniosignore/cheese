<%@ page import="com.netnumeri.server.finance.finpojo.Trade" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'trade.label', default: 'Trade')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-trade" class="first">
    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="amount"
                              title="${message(code: 'trade.amount.label', default: 'Amount')}"/>

            <g:sortableColumn property="comment"
                              title="${message(code: 'trade.comment.label', default: 'Comment')}"/>

            <g:sortableColumn property="cost"
                              title="${message(code: 'trade.cost.label', default: 'Cost')}"/>

            <g:sortableColumn property="date"
                              title="${message(code: 'trade.date.label', default: 'Date')}"/>

            <th><g:message code="trade.instrument.label" default="Instrument"/></th>

            <th><g:message code="trade.portfolio.label" default="Portfolio"/></th>

        </tr>
        </thead>
        <tbody>
        <g:each in="${tradeInstanceList}" status="i" var="tradeInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${tradeInstance.id}">${fieldValue(bean: tradeInstance, field: "amount")}</g:link></td>

                <td>${fieldValue(bean: tradeInstance, field: "blog")}</td>

                <td>${fieldValue(bean: tradeInstance, field: "cost")}</td>

                <td><g:formatDate date="${tradeInstance.tradeDate}"/></td>

                <td>${fieldValue(bean: tradeInstance, field: "instrument")}</td>

                <td>${fieldValue(bean: tradeInstance, field: "portfolio")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <dtmc:paginate total="${tradeInstanceTotal}"/>
    </div>
</section>
</body>
</html>
