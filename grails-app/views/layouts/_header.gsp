<g:if test="${actionName == 'indicator' || (controllerName =='stock' && actionName == 'show')}">

    <g:link controller="ssa" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">SSA</g:link>
    <g:link controller="bb" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">BB</g:link>
    <g:link controller="priceChannel" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">PC</g:link>
    <g:link controller="macd" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">MACD</g:link>
    <g:link controller="rsi" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">RSI</g:link>
    <g:link controller="cci" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">CCI</g:link>
    <g:link controller="aaron" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Aaron</g:link>
    <g:link controller="movingVariance" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Moving Variance</g:link>
    <g:link controller="momentum" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">Momentum</g:link>
    <g:link controller="roc" action="indicator" id="${params.id}" role="button" class="btn btn-success btn-small">ROC</g:link>

</g:if>
