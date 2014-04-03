<%@ page import="com.netnumeri.server.finance.trading.Signal" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'signal.label', default: 'Signal')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-signal" class="first">
    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'signal.dateCreated.label', default: 'Date Created')}"/>

            <g:sortableColumn property="day"
                              title="${message(code: 'signal.day.label', default: 'Day')}"/>

            <g:sortableColumn property="direction"
                              title="${message(code: 'signal.direction.label', default: 'Direction')}"/>

            <g:sortableColumn property="lastUpdated"
                              title="${message(code: 'signal.lastUpdated.label', default: 'Last Updated')}"/>

            <g:sortableColumn property="name"
                              title="${message(code: 'signal.name.label', default: 'Name')}"/>

            <th><g:message code="signal.user.label" default="User"/></th>

        </tr>
        </thead>
        <tbody>
        <g:each in="${signalInstanceList}" status="i" var="signalInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${signalInstance.id}">${fieldValue(bean: signalInstance, field: "dateCreated")}</g:link></td>

                <td><g:formatDate date="${signalInstance.day}"/></td>

                <td>${fieldValue(bean: signalInstance, field: "direction")}</td>

                <td><g:formatDate date="${signalInstance.lastUpdated}"/></td>

                <td>${fieldValue(bean: signalInstance, field: "name")}</td>

                <td>${fieldValue(bean: signalInstance, field: "user")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <dtmc:paginate total="${signalInstanceTotal}"/>
    </div>
</section>
</body>
</html>
