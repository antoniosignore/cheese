<!-- Main menu in one row (e.g., controller entry points -->

<div class="span12">

<!-- print system messages (infos, warnings, etc) - not validation errors -->

    <g:if test="${flash.message && !layout_noflashmessage}">
        <div class="alert alert-info">${flash.message}</div>
    </g:if>

%{--<g:set var="pagetitle"--}%
%{--value="${message(code: params.controller + '.' + params.action + '.custom.title.label', default: params.controller + '.' + params.action + '.custom.title.label NOT DEFINED')}"/>--}%

%{--<h3>${pagetitle}</h3>--}%

    <br/>
    <g:if test="${!layout_nosecondarymenu}">
            %{--<div class="span12">--}%
                <g:render template="/_menu/submenubar"/>
            %{--</div>--}%
    </g:if>

    <g:layoutBody/>

    <g:pageProperty name="page.body"/>

</div>
