<%@ page import="com.dtmc.club.Club" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'club.label', default: 'Club')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-club" class="first">

    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="agreement"
                              title="${message(code: 'club.agreement.label', default: 'Agreement')}"/>

            <th><g:message code="club.banker.label" default="Banker"/></th>

            <th><g:message code="club.broker.label" default="Broker"/></th>

            <g:sortableColumn property="dateCreated"
                              title="${message(code: 'club.dateCreated.label', default: 'Date Created')}"/>

            <g:sortableColumn property="inauguralMeeting"
                              title="${message(code: 'club.inauguralMeeting.label', default: 'Inaugural Meeting')}"/>

            <g:sortableColumn property="joiningFee"
                              title="${message(code: 'club.joiningFee.label', default: 'Joining Fee')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${clubInstanceList}" status="i" var="clubInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${clubInstance.id}">${fieldValue(bean: clubInstance, field: "agreement")}</g:link></td>

                <td>${fieldValue(bean: clubInstance, field: "banker")}</td>

                <td>${fieldValue(bean: clubInstance, field: "broker")}</td>

                <td><g:formatDate date="${clubInstance.dateCreated}"/></td>

                <td><g:formatDate date="${clubInstance.inauguralMeeting}"/></td>

                <td>${fieldValue(bean: clubInstance, field: "joiningFee")}</td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <bs:paginate total="${clubInstanceTotal}"/>
    </div>
</section>

</body>

</html>
