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

    <g:render template="/common/charts"/>

</section>
</body>

</html>
