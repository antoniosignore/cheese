<%@ page import="com.netnumeri.server.utils.StockUtils; com.netnumeri.server.finance.finpojo.asset.Stock" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'stock.label', default: 'Stock')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-stock" class="first">
    <table class="table table-striped table-bordered table-condensed table-hover">
        <tbody>
        <tr class="prop">
            <td valign="top" class="value">${fieldValue(bean: stockInstance, field: "name")}</td>
            <td valign="top" class="value">${fieldValue(bean: stockInstance, field: "description")}</td>
        </tr>
        </tbody>
    </table>

    <g:link controller="ssa" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">SSA</g:link>
    <g:link controller="bb" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">BB</g:link>
    <g:link controller="priceChannel" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">PC</g:link>
    <g:link controller="macd" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">MACD</g:link>
    <g:link controller="rsi" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">RSI</g:link>
    <g:link controller="cci" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">CCI</g:link>
    <g:link controller="aaron" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Aaron</g:link>
    <g:link controller="movingVariance" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Moving Variance</g:link>
    <g:link controller="momentum" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Momentum</g:link>
    <g:link controller="roc" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">ROC</g:link>
    <g:link controller="trueRange" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">True Range</g:link>
    <g:link controller="moneyFlow" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Money Flow</g:link>
    <g:link controller="accumulateDistribution" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Accumulate Distribution</g:link>

    <g:link controller="chaikinMoneyFlow" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Chaikin Money Flow</g:link>
    <g:link controller="chaikinOscillator" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Chaikin Oscillator</g:link>
    <g:link controller="chaikinVolatility" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Chaikin Volatility</g:link>
    <g:link controller="trueRange" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">True Range</g:link>
    <g:link controller="keyFastStochastic" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">k Fast Stochastic</g:link>
    <g:link controller="diStochastic" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">d Stochastic</g:link>
    <g:link controller="diStochasticSmoothed" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">d Stochastic Smoothed</g:link>
    <g:link controller="plusDirectional" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Plus Directional</g:link>
    <g:link controller="momentumPct" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Momentum Pct</g:link>
    <g:link controller="mfi" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Market Facilitation Index</g:link>
    <g:link controller="balanceOfPower" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Balance of Power</g:link>
    <g:link controller="priceAction" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Price Action</g:link>

    <g:render template="/common/charts"/>

</section>
</body>

</html>
