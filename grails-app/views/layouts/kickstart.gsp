<!doctype html>
<html lang="${session.'org.springframework.web.servlet.i18n.SessionLocaleResolver.LOCALE'}">
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title><g:layoutTitle default="${meta(name: 'app.name')}"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <r:require module="angular"/>
    <r:layoutResources />

    <g:layoutHead/>
    %{--<g:javascript>--}%
			%{--$(document).ready(function() {--}%
			   %{--$('#city').autocomplete({--}%
				 %{--source: '<g:createLink controller='home' action='ajaxStockFinder'/>'--}%
			   %{--});--}%
			%{--});--}%
    %{--</g:javascript>--}%

</head>

<body>

<body>
<div class="view-container" ng-app="phonecatApp">
    <div ng-view class="view-frame"></div>
</div>
<r:layoutResources />
</body>

%{--<g:render template="/_menu/navbar"/>--}%

%{--<!-- Enable to overwrite Header by individual page -->--}%
%{--<g:if test="${pageProperty(name: 'page.header')}">--}%
    %{--<g:pageProperty name="page.header"/>--}%
%{--</g:if>--}%
%{--<g:else>--}%
    %{--<g:render template="/layouts/header"/>--}%
%{--</g:else>--}%

%{--<div class="ui-widget">--}%
    %{--<label for="city">Stock: </label>--}%
    %{--<input id="city">--}%
%{--</div>--}%

%{--<div class="container">--}%
    %{--<div class="row-fluid">--}%
        %{--<g:render template="/layouts/leftbar"/>--}%
        %{--<g:render template="/layouts/content"/>--}%
        %{--<g:render template="/layouts/rightbar"/>--}%
    %{--</div>--}%

%{--</div>--}%

%{--<g:if test="${pageProperty(name: 'page.footer')}">--}%
    %{--<g:pageProperty name="page.footer"/>--}%
%{--</g:if>--}%
%{--<g:else>--}%
    %{--<g:render template="/layouts/footer"/>--}%
%{--</g:else>--}%

%{--<r:layoutResources/>--}%
</body>

<style type="text/css">
html, body {
    padding-top: 20px; /* 40px to make the container go all the way to the bottom of the topbar */
}
</style>

</html>

