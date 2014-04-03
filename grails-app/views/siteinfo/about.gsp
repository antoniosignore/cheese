<!doctype html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
    <g:set var="entityName" value="${message(code: 'stock.label', default: 'Stock')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>

    <g:set var="layout_nomainmenu" value="${true}" scope="request"/>
    <g:set var="layout_nosecondarymenu" value="${true}" scope="request"/>
</head>

<body>

<section id="intro">
    <h1><g:message code="default.welcome.title" args="[meta(name: 'app.name')]"/></h1>

    <p class="lead">
        ${meta(name: 'app.name')}
        is the hottest System since sliced bread!
    </p>
</section>

<section id="additional">
    <h1><g:message code="default.welcome.title" args="['Kickstart']"/></h1>

    <p>Kickstart is an extension for Grails in order to start with a
    good looking template for your project. It uses the Bootstrap web
    page template by Twitter and provides adapted scaffolding templates
    for standard web pages.</p>
</section>

</body>

</html>
