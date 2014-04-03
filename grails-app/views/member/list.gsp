<%@ page import="com.dtmc.club.Member" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'member.label', default: 'Member')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>
<section id="list-member" class="first">

    <table class="table table-bordered">
        <thead>
        <tr>
            <g:sortableColumn property="username"
                              title="${message(code: 'member.username.label', default: 'Username')}"/>
            <g:sortableColumn property="firstname"
                              title="${message(code: 'member.firstname.label', default: 'Firstname')}"/>
            <g:sortableColumn property="lastname"
                              title="${message(code: 'member.lastname.label', default: 'Lastname')}"/>
            <g:sortableColumn property="email" title="${message(code: 'member.email.label', default: 'Email')}"/>
            <g:sortableColumn property="phone" title="${message(code: 'member.phone.label', default: 'Phone')}"/>
        </tr>
        </thead>
        <tbody>
        <g:each in="${memberInstanceList}" status="i" var="memberInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                <td><g:link action="show"
                            id="${memberInstance.id}">${fieldValue(bean: memberInstance, field: "username")}</g:link></td>
                <td>${fieldValue(bean: memberInstance, field: "firstname")}</td>
                <td>${fieldValue(bean: memberInstance, field: "lastname")}</td>
                <td>${fieldValue(bean: memberInstance, field: "email")}</td>
                <td>${fieldValue(bean: memberInstance, field: "phone")}</td>
            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <bs:paginate total="${memberInstanceTotal}"/>
    </div>
</section>
</body>
</html>
