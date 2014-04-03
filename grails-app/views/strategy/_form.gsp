<%@ page import="com.netnumeri.server.finance.finpojo.TradingSystem" %>



<div class="control-group fieldcontain ${hasErrors(bean: strategyInstance, field: 'member', 'error')} ">
	<label for="member">
		<g:message code="strategy.member.label" default="Member" />
		
	</label>
	<g:select id="member" name="member.id" from="${com.dtmc.club.Member.list()}" optionKey="id" value="${strategyInstance?.member?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategyInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="strategy.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${strategyInstance?.name}"/>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategyInstance, field: 'portfolio', 'error')} ">
	<label for="portfolio">
		<g:message code="strategy.portfolio.label" default="Portfolio" />
		
	</label>
	<g:select id="portfolio" name="portfolio.id" from="${com.netnumeri.server.finance.finpojo.Portfolio.list()}" optionKey="id" value="${strategyInstance?.portfolio?.id}" class="many-to-one" noSelection="['null': '']"/>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategyInstance, field: 'strategyEnum', 'error')} ">
	<label for="strategyEnum">
		<g:message code="strategy.strategyEnum.label" default="Strategy Enum" />
		
	</label>
	<g:select name="strategyEnum" from="${com.netnumeri.server.enums.StrategyEnum?.values()}" keys="${com.netnumeri.server.enums.StrategyEnum.values()*.name()}" value="${strategyInstance?.strategyEnum?.name()}" noSelection="['': '']"/>
</div>

<div class="control-group fieldcontain ${hasErrors(bean: strategyInstance, field: 'when', 'error')} ">
	<label for="when">
		<g:message code="strategy.when.label" default="When" />
		
	</label>
	<g:datePicker name="when" precision="day"  value="${strategyInstance?.when}" default="none" noSelection="['': '']" />
</div>

