<%@ page import="com.netnumeri.server.finance.trading.StrategyCatalog" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'strategyCatalog.label', default: 'StrategyCatalog')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-strategyCatalog" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyCatalog.dateCreated.label"
                                                     default="Date Created"/></td>

            <td valign="top" class="value"><g:formatDate date="${strategyCatalogInstance?.dateCreated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyCatalog.lastUpdated.label"
                                                     default="Last Updated"/></td>

            <td valign="top" class="value"><g:formatDate date="${strategyCatalogInstance?.lastUpdated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyCatalog.name.label"
                                                     default="Name"/></td>

            <td valign="top" class="value">${fieldValue(bean: strategyCatalogInstance, field: "name")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyCatalog.subscriptions.label"
                                                     default="Subscriptions"/></td>

            <td valign="top" style="text-align: left;" class="value">
                <ul>
                    <g:each in="${strategyCatalogInstance.subscriptions}" var="s">
                        <li><g:link controller="strategySubscription" action="show"
                                    id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
                    </g:each>
                </ul>
            </td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
