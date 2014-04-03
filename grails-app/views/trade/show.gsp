<%@ page import="com.netnumeri.server.finance.finpojo.Trade" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'trade.label', default: 'Trade')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-trade" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="trade.amount.label"
                                                     default="Amount"/></td>

            <td valign="top" class="value">${fieldValue(bean: tradeInstance, field: "amount")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="trade.comment.label"
                                                     default="Comment"/></td>

            <td valign="top" class="value">${fieldValue(bean: tradeInstance, field: "blog")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="trade.cost.label"
                                                     default="Cost"/></td>

            <td valign="top" class="value">${fieldValue(bean: tradeInstance, field: "cost")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="trade.date.label"
                                                     default="Date"/></td>

            <td valign="top" class="value"><g:formatDate date="${tradeInstance?.tradeDate}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="trade.instrument.label"
                                                     default="Instrument"/></td>

            <td valign="top" class="value"><g:link controller="instrument" action="show"
                                                   id="${tradeInstance?.instrument?.id}">${tradeInstance?.instrument?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="trade.portfolio.label"
                                                     default="Portfolio"/></td>

            <td valign="top" class="value"><g:link controller="portfolio" action="show"
                                                   id="${tradeInstance?.portfolio?.id}">${tradeInstance?.portfolio?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="trade.price.label"
                                                     default="Price"/></td>

            <td valign="top" class="value">${fieldValue(bean: tradeInstance, field: "price")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="trade.tradeAction.label"
                                                     default="Trade Action"/></td>

            <td valign="top" class="value">${tradeInstance?.tradeAction?.encodeAsHTML()}</td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
