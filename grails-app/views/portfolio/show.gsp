<%@ page import="com.netnumeri.server.finance.finpojo.Portfolio" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'portfolio.label', default: 'Portfolio')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-portfolio" class="first">

<table class="table">
<tbody>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.closeSeries.label"
                                             default="Close Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "closeSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.dateCreated.label"
                                             default="Date Created"/></td>

    <td valign="top" class="value"><g:formatDate date="${portfolioInstance?.dateCreated}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.description.label"
                                             default="Description"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "description")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.firstDate.label"
                                             default="First Date"/></td>

    <td valign="top" class="value"><g:formatDate date="${portfolioInstance?.firstDate}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.highSeries.label"
                                             default="High Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "highSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.indicators.label"
                                             default="Indicators"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "indicators")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.isSpotFixed.label"
                                             default="Is Spot Fixed"/></td>

    <td valign="top" class="value"><g:formatBoolean boolean="${portfolioInstance?.isSpotFixed}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.isVolatilityFixed.label"
                                             default="Is Volatility Fixed"/></td>

    <td valign="top" class="value"><g:formatBoolean boolean="${portfolioInstance?.isVolatilityFixed}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.items.label"
                                             default="Items"/></td>

    <td valign="top" style="text-align: left;" class="value">
        <ul>
            <g:each in="${portfolioInstance.items}" var="i">
                <li><g:link controller="portfolioEntry" action="show"
                            id="${i.id}">${i?.encodeAsHTML()}</g:link></li>
            </g:each>
        </ul>
    </td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.lastDate.label"
                                             default="Last Date"/></td>

    <td valign="top" class="value"><g:formatDate date="${portfolioInstance?.lastDate}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.lastQuote.label"
                                             default="Last Quote"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "lastQuote")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.lastUpdated.label"
                                             default="Last Updated"/></td>

    <td valign="top" class="value"><g:formatDate date="${portfolioInstance?.lastUpdated}"/></td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.logReturnSeries.label"
                                             default="Log Return Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "logReturnSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.lowSeries.label"
                                             default="Low Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "lowSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.marketSpotShift.label"
                                             default="Market Spot Shift"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "marketSpotShift")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.marketVolatilityShift.label"
                                             default="Market Volatility Shift"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "marketVolatilityShift")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.name.label"
                                             default="Name"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "name")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.openSeries.label"
                                             default="Open Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "openSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.portfolioType.label"
                                             default="Portfolio Type"/></td>

    <td valign="top" class="value">${portfolioInstance?.portfolioType?.encodeAsHTML()}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.priceSeries.label"
                                             default="Price Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "priceSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.returnSeries.label"
                                             default="Return Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "returnSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.spot.label"
                                             default="Spot"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "spot")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.tempSpot.label"
                                             default="Temp Spot"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "tempSpot")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.tempVolatility.label"
                                             default="Temp Volatility"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "tempVolatility")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.trades.label"
                                             default="Trades"/></td>

    <td valign="top" style="text-align: left;" class="value">
        <ul>
            <g:each in="${portfolioInstance.trades}" var="t">
                <li><g:link controller="trade" action="show"
                            id="${t.id}">${t?.encodeAsHTML()}</g:link></li>
            </g:each>
        </ul>
    </td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.volatility.label"
                                             default="Volatility"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "volatility")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.volumeLogReturnSeries.label"
                                             default="Volume Log Return Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "volumeLogReturnSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.volumeReturnSeries.label"
                                             default="Volume Return Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "volumeReturnSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.volumeSeries.label"
                                             default="Volume Series"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "volumeSeries")}</td>

</tr>

<tr class="prop">
    <td valign="top" class="name"><g:message code="portfolio.wealth.label"
                                             default="Wealth"/></td>

    <td valign="top" class="value">${fieldValue(bean: portfolioInstance, field: "wealth")}</td>

</tr>

</tbody>
</table>
</section>

</body>

</html>
