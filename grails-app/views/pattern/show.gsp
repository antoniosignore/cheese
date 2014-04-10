<%@ page import="com.netnumeri.server.finance.candlestick.Pattern" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'pattern.label', default: 'Pattern')}"/>
    <title><g:message code="default.show.label" args="[entityName]"/></title>
</head>

<body>

<section id="show-pattern" class="first">

    <table class="table">
        <tbody>
        
        <tr class="prop">
            <td valign="top" class="name" style="width: 300px;"><g:message code="pattern.code.label"
                                                     default="Code"/></td>
            
            <td valign="top" class="value">${fieldValue(bean: patternInstance, field: "code")}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.confirmation.label"
                                                     default="Confirmation"/></td>
            
            <td valign="top" class="value">${patternInstance?.confirmation?.encodeAsHTML()}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.dateCreated.label"
                                                     default="Date Created"/></td>
            
            <td valign="top" class="value"><g:formatDate date="${patternInstance?.dateCreated}"/></td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.definition.label"
                                                     default="Definition"/></td>
            
            <td valign="top" class="value">${fieldValue(bean: patternInstance, field: "patternDefinition")}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.lastUpdated.label"
                                                     default="Last Updated"/></td>
            
            <td valign="top" class="value"><g:formatDate date="${patternInstance?.lastUpdated}"/></td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.noSticks.label"
                                                     default="No Sticks"/></td>
            
            <td valign="top" class="value">${fieldValue(bean: patternInstance, field: "noSticks")}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.patternType.label"
                                                     default="Pattern Type"/></td>
            
            <td valign="top" class="value">${patternInstance?.patternType?.encodeAsHTML()}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.recognition.label"
                                                     default="Recognition"/></td>
            
            <td valign="top" class="value">${fieldValue(bean: patternInstance, field: "recognition")}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.relevanceType.label"
                                                     default="Relevance Type"/></td>
            
            <td valign="top" class="value">${patternInstance?.relevanceType?.encodeAsHTML()}</td>
            
        </tr>
        
        <tr class="prop">
            <td valign="top" class="name"><g:message code="pattern.reliability.label"
                                                     default="Reliability"/></td>
            
            <td valign="top" class="value">${patternInstance?.reliability?.encodeAsHTML()}</td>
            
        </tr>
        
        </tbody>
    </table>
</section>

</body>

</html>
