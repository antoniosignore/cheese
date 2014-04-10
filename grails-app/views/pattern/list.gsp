
<%@ page import="com.netnumeri.server.finance.candlestick.Pattern" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'pattern.label', default: 'Pattern')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>

    <g:set var="layout_nomainmenu" value="${true}" scope="request"/>
    <g:set var="layout_nosecondarymenu" value="${true}" scope="request"/>

</head>

<body>

<section id="list-pattern" class="first">
    <table class="table table-bordered">
        <thead>
        <tr>
            <g:sortableColumn property="code" title="${message(code: 'pattern.code.label', default: 'Code')}"/>
            <g:sortableColumn property="definition" title="${message(code: 'pattern.patternDefinition.label', default: 'Definition')}"/>
            <g:sortableColumn property="recognition" title="${message(code: 'pattern.recognition.label', default: 'Recognition')}"/>
            <g:sortableColumn property="noSticks" title="${message(code: 'pattern.noSticks.label', default: 'Sticks')}"/>
            <g:sortableColumn property="patternType" title="${message(code: 'pattern.patternType.label', default: 'Pattern')}"/>
            <g:sortableColumn property="priorTrend" title="${message(code: 'pattern.priorTrend.label', default: 'Prior Trend')}"/>
            <g:sortableColumn property="relevanceType" title="${message(code: 'pattern.relevanceType.label', default: 'Relevance')}"/>
            <g:sortableColumn property="reliability" title="${message(code: 'pattern.reliability.label', default: 'Reliability')}"/>
            <g:sortableColumn property="confirmation" title="${message(code: 'pattern.confirmation.label', default: 'Confirmation')}"/>
        </tr>
        </thead>
        <tbody>
        <g:each in="${patternInstanceList}" status="i" var="patternInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                <td><g:link action="show" id="${patternInstance.id}">${fieldValue(bean: patternInstance, field: "code")}</g:link></td>
                <td>${fieldValue(bean: patternInstance, field: "patternDefinition")}</td>
                <td>${fieldValue(bean: patternInstance, field: "recognition")}</td>
                <td>${fieldValue(bean: patternInstance, field: "noSticks")}</td>
                <td>${fieldValue(bean: patternInstance, field: "priorTrend")}</td>
                <td>${fieldValue(bean: patternInstance, field: "patternType")}</td>
                <td>${fieldValue(bean: patternInstance, field: "relevanceType")}</td>
                <td>${fieldValue(bean: patternInstance, field: "reliability")}</td>
                <td>${fieldValue(bean: patternInstance, field: "confirmation")}</td>
            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <dtmc:paginate total="${patternInstanceTotal}"/>
    </div>
</section>
</body>
</html>
