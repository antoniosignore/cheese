<%@ page import="com.netnumeri.server.finance.trading.StrategySubscription" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'strategySubscription.label', default: 'StrategySubscription')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-strategySubscription" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategySubscription.dateCreated.label"
                                                     default="Date Created"/></td>

            <td valign="top" class="value"><g:formatDate date="${strategySubscriptionInstance?.dateCreated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategySubscription.lastUpdated.label"
                                                     default="Last Updated"/></td>

            <td valign="top" class="value"><g:formatDate date="${strategySubscriptionInstance?.lastUpdated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategySubscription.strategy.label"
                                                     default="Strategy"/></td>

            <td valign="top" class="value"><g:link controller="strategyCatalog" action="show"
                                                   id="${strategySubscriptionInstance?.strategy?.id}">${strategySubscriptionInstance?.strategy?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategySubscription.user.label"
                                                     default="User"/></td>

            <td valign="top" class="value"><g:link controller="member" action="show"
                                                   id="${strategySubscriptionInstance?.user?.id}">${strategySubscriptionInstance?.user?.encodeAsHTML()}</g:link></td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
