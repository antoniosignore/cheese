<%@ page import="com.netnumeri.server.finance.finpojo.PortfolioEntry" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'portfolioEntry.label', default: 'PortfolioEntry')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-portfolioEntry" class="first">

    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="amount"
                              title="${message(code: 'portfolioEntry.amount.label', default: 'Amount')}"/>

            <th><g:message code="portfolioEntry.instrument.label" default="Instrument"/></th>

            <th><g:message code="portfolioEntry.portfolio.label" default="Portfolio"/></th>

        </tr>
        </thead>
        <tbody>
        <g:each in="${portfolioEntryInstanceList}" status="i" var="portfolioEntryInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${portfolioEntryInstance.id}">${fieldValue(bean: portfolioEntryInstance, field: "amount")}</g:link></td>

                <td>${fieldValue(bean: portfolioEntryInstance, field: "instrument")}</td>

                <td>${fieldValue(bean: portfolioEntryInstance, field: "portfolio")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <bs:paginate total="${portfolioEntryInstanceTotal}"/>
    </div>
</section>

</body>

</html>
