<%@ page import="com.netnumeri.server.finance.finpojo.derivative.equity.Vanilla" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'vanilla.label', default: 'Vanilla')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-vanilla" class="first">

    <table class="table table-striped table-bordered table-condensed table-hover">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="vanilla.dateCreated.label"
                                                     default="Date Created"/></td>

            <td valign="top" class="value"><g:formatDate date="${vanillaInstance?.dateCreated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="vanilla.interestRate.label"
                                                     default="Interest Rate"/></td>

            <td valign="top" class="value">${fieldValue(bean: vanillaInstance, field: "interestRate")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="vanilla.lastUpdated.label"
                                                     default="Last Updated"/></td>

            <td valign="top" class="value"><g:formatDate date="${vanillaInstance?.lastUpdated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="vanilla.name.label"
                                                     default="Name"/></td>

            <td valign="top" class="value">${fieldValue(bean: vanillaInstance, field: "name")}</td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
