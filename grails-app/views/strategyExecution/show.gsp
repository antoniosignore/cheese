<%@ page import="com.netnumeri.server.finance.trading.StrategyExecution" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'strategyExecution.label', default: 'StrategyExecution')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-strategyExecution" class="first">

    <table class="table">
        <tbody>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyExecution.dateCreated.label"
                                                     default="Date Created"/></td>

            <td valign="top" class="value"><g:formatDate date="${strategyExecutionInstance?.dateCreated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyExecution.instrument.label"
                                                     default="Instrument"/></td>

            <td valign="top" class="value"><g:link controller="instrument" action="show"
                                                   id="${strategyExecutionInstance?.instrument?.id}">${strategyExecutionInstance?.instrument?.encodeAsHTML()}</g:link></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyExecution.lastUpdated.label"
                                                     default="Last Updated"/></td>

            <td valign="top" class="value"><g:formatDate date="${strategyExecutionInstance?.lastUpdated}"/></td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyExecution.name.label"
                                                     default="Name"/></td>

            <td valign="top" class="value">${fieldValue(bean: strategyExecutionInstance, field: "name")}</td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyExecution.signals.label"
                                                     default="Signals"/></td>

            <td valign="top" style="text-align: left;" class="value">
                <ul>
                    <g:each in="${strategyExecutionInstance.signals}" var="s">
                        <li><g:link controller="signal" action="show"
                                    id="${s.id}">${s?.encodeAsHTML()}</g:link></li>
                    </g:each>
                </ul>
            </td>

        </tr>

        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategyExecution.user.label"
                                                     default="User"/></td>

            <td valign="top" class="value"><g:link controller="member" action="show"
                                                   id="${strategyExecutionInstance?.user?.id}">${strategyExecutionInstance?.user?.encodeAsHTML()}</g:link></td>

        </tr>

        </tbody>
    </table>
</section>

</body>

</html>
