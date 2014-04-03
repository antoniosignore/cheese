
<%@ page import="com.netnumeri.server.finance.finpojo.TradingSystem" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="kickstart">
		<g:set var="entityName" value="${message(code: 'strategy.label', default: 'Strategy')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		%{--<a href="#list-strategy" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>--}%
		%{--<div class="nav" role="navigation">--}%
			%{--<ul>--}%
				%{--<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>--}%
				%{--<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>--}%
			%{--</ul>--}%
		%{--</div>--}%
		<div id="list-strategy" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table class="table table-striped table-bordered table-condensed table-hover">
			<thead>
					<tr>

                        <g:sortableColumn property="name" title="${message(code: 'strategy.name.label', default: 'Name')}" />

						<g:sortableColumn property="dateCreated" title="${message(code: 'strategy.dateCreated.label', default: 'Date Created')}" />
					
						<g:sortableColumn property="lastUpdated" title="${message(code: 'strategy.lastUpdated.label', default: 'Last Updated')}" />
					
						<th><g:message code="strategy.member.label" default="Member" /></th>
					

						<th><g:message code="strategy.portfolio.label" default="Portfolio" /></th>
					
						<g:sortableColumn property="strategyEnum" title="${message(code: 'strategy.strategyEnum.label', default: 'Strategy Enum')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${strategyInstanceList}" status="i" var="strategyInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                        <td><g:link action="show" id="${strategyInstance.id}">${fieldValue(bean: strategyInstance, field: "name")}</g:link></td>

						<td>${fieldValue(bean: strategyInstance, field: "dateCreated")}</td>

						<td><g:formatDate date="${strategyInstance.lastUpdated}" /></td>
					
						<td>${fieldValue(bean: strategyInstance, field: "member")}</td>

						<td>${fieldValue(bean: strategyInstance, field: "portfolio")}</td>
					
						<td>${fieldValue(bean: strategyInstance, field: "strategyEnum")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${strategyInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
