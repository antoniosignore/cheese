<%@ page import="com.dtmc.club.LegalStructure" %>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'legalStructure.label', default: 'LegalStructure')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
</head>

<body>

<section id="list-legalStructure" class="first">

    <table class="table table-bordered">
        <thead>
        <tr>

            <g:sortableColumn property="name"
                              title="${message(code: 'legalStructure.name.label', default: 'Name')}"/>

        </tr>
        </thead>
        <tbody>
        <g:each in="${legalStructureInstanceList}" status="i" var="legalStructureInstance">
            <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">

                <td><g:link action="show"
                            id="${legalStructureInstance.id}">${fieldValue(bean: legalStructureInstance, field: "name")}</g:link></td>

            </tr>
        </g:each>
        </tbody>
    </table>

    <div class="pagination">
        <bs:paginate total="${legalStructureInstanceTotal}"/>
    </div>
</section>

</body>

</html>
