<%@ page import="com.netnumeri.server.utils.StockUtils; com.netnumeri.server.finance.finpojo.asset.Stock" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'stock.label', default: 'Stock')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
    <g:set var="layout_nomainmenu" value="${true}" scope="request"/>
    <g:set var="layout_nosecondarymenu" value="${true}" scope="request"/>

</head>

<body>

<section id="show-stock" class="first">
    <g:render template="../stock/stock" />


    <div id="messages">
        <g:render template="/common/candlestick"/>
        <g:render template="bb"/>
    </div>

    %{--<dtmc:stocks list="${strategyInstance.stocksList}"/>--}%

</section>

</body>

</html>
