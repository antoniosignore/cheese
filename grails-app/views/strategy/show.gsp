
<%@ page import="com.netnumeri.server.finance.finpojo.TradingSystem" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'strategy.label', default: 'Strategy')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-strategy" class="first">

    <table class="table table-striped table-bordered table-condensed table-hover">
        <tbody>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategy.dateCreated.label"
                                                     default="Date Created"/></td>
            
            <td valign="top" class="value"><g:formatDate date="${strategyInstance?.dateCreated}"/></td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategy.lastUpdated.label"
                                                     default="Last Updated"/></td>
            
            <td valign="top" class="value"><g:formatDate date="${strategyInstance?.lastUpdated}"/></td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategy.member.label"
                                                     default="Member"/></td>
            
            <td valign="top" class="value"><g:link controller="member" action="show"
                                                   id="${strategyInstance?.member?.id}">${strategyInstance?.member.username?.encodeAsHTML()}</g:link></td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategy.name.label"
                                                     default="Name"/></td>
            
            <td valign="top" class="value">${fieldValue(bean: strategyInstance, field: "name")}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategy.portfolio.label"
                                                     default="Portfolio"/></td>
            
            <td valign="top" class="value"><g:link controller="portfolio" action="show"
                                                   id="${strategyInstance?.portfolio?.id}">${strategyInstance?.portfolio?.name?.encodeAsHTML()}</g:link></td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategy.strategyEnum.label"
                                                     default="Strategy Enum"/></td>
            
            <td valign="top" class="value">${strategyInstance?.strategyEnum?.encodeAsHTML()}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="strategy.when.label"
                                                     default="When"/></td>
            
            <td valign="top" class="value"><g:formatDate date="${strategyInstance?.when}"/></td>
            
        </tr>
        
        </tbody>
    </table>
</section>

</body>

</html>
