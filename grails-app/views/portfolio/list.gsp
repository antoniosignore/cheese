<%@ page import="dtmc.PortfolioService; com.netnumeri.server.finance.finpojo.Portfolio" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'portfolio.label', default: 'Portfolio')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<g:set var="port" bean="portfolioService"/>

<section id="list-portfolio" class="first">
    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="name" title="${message(code: 'name.label', default: 'Name')}"/>
            <g:sortableColumn property="description" title="${message(code: 'description.label', default: 'Description')}"/>
            <g:sortableColumn property="value" title="${message(code: 'value.label', default: 'Market value')}"/>
            <g:sortableColumn property="wealth" title="${message(code: 'wealth.label', default: 'Wealth')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${portfolioInstanceList}" status="i" var="portfolioInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show" id="${portfolioInstance.id}">${fieldValue(bean: portfolioInstance, field: "name")}</g:link></td>

                <td>${fieldValue(bean: portfolioInstance, field: "description")}</td>
                <td>${((PortfolioService)port).m2m(portfolioInstance)}</td>
                <td>${((PortfolioService)port).wealth(portfolioInstance)}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <dtmc:paginate total="${portfolioInstanceTotal}"/>
    </div>
</section>
</body>
</html>
