<%@ page import="com.netnumeri.server.finance.indicator.UserIndicators" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'userIndicators.label', default: 'UserIndicators')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-userIndicators" class="first">

    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'userIndicators.name.label', default: 'Name')}"/>

            <g:sortableColumn property="double1"
                              title="${message(code: 'userIndicators.double1.label', default: 'Double1')}"/>

            <g:sortableColumn property="double2"
                              title="${message(code: 'userIndicators.double2.label', default: 'Double2')}"/>

            <g:sortableColumn property="integer1"
                              title="${message(code: 'userIndicators.integer1.label', default: 'Integer1')}"/>

            <g:sortableColumn property="integer2"
                              title="${message(code: 'userIndicators.integer2.label', default: 'Integer2')}"/>

            <g:sortableColumn property="integer3"
                              title="${message(code: 'userIndicators.integer3.label', default: 'Integer3')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${userIndicatorsInstanceList}" status="i" var="userIndicatorsInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${userIndicatorsInstance.id}">${fieldValue(bean: userIndicatorsInstance, field: "name")}</g:link></td>

                <td>${fieldValue(bean: userIndicatorsInstance, field: "double1")}</td>

                <td>${fieldValue(bean: userIndicatorsInstance, field: "double2")}</td>

                <td>${fieldValue(bean: userIndicatorsInstance, field: "integer1")}</td>

                <td>${fieldValue(bean: userIndicatorsInstance, field: "integer2")}</td>

                <td>${fieldValue(bean: userIndicatorsInstance, field: "integer3")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <bs:paginate total="${userIndicatorsInstanceTotal}"/>
    </div>
</section>

</body>

</html>
