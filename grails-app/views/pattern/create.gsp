<%@ page import="com.dtmc.candlestick.Pattern" %>
<!doctype html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'pattern.label', default: 'Pattern')}"/>
    <title><g:message code="default.create.label" args="[entityName]"/></title>
</head>

<body>

<section id="create-pattern" class="first">

    <g:hasErrors bean="${patternInstance}">
        <div class="alert alert-error">
            <g:renderErrors bean="${patternInstance}" as="list"/>
        </div>
    </g:hasErrors>

    <g:form action="save" class="form-horizontal" >
    <fieldset class="form">
        <g:render template="form"/>
    </fieldset>

    <div class="form-actions">
        <g:submitButton name="create" class="btn btn-primary"
                        value="${message(code: 'default.button.create.label', default: 'Create')}"/>
        <button class="btn" type="reset"><g:message code="default.button.reset.label" default="Reset"/></button>
    </div>
    </g:form>

</section>

</body>

</html>
