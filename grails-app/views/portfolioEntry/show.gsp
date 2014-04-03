<%@ page import="com.netnumeri.server.finance.finpojo.PortfolioEntry" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'portfolioEntry.label', default: 'PortfolioEntry')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-portfolioEntry" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="portfolioEntry.amount.label"
                                                     default="Amount"/></td>

            <td valign="top" class="value">${fieldValue(bean: portfolioEntryInstance, field: "amount")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="portfolioEntry.instrument.label"
                                                     default="Instrument"/></td>

            <td valign="top" class="value"><g:link controller="instrument" action="show"
                                                   id="${portfolioEntryInstance?.instrument?.id}">${portfolioEntryInstance?.instrument?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="portfolioEntry.portfolio.label"
                                                     default="Portfolio"/></td>

            <td valign="top" class="value"><g:link controller="portfolio" action="show"
                                                   id="${portfolioEntryInstance?.portfolio?.id}">${portfolioEntryInstance?.portfolio?.encodeAsHTML()}</g:link></td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
