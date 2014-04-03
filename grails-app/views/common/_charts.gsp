<g:render template="/common/snapshot"/>
<g:render template="/common/candlestick"/>

<div id="container" class="js-masonry"
     data-masonry-options='{ "columnWidth": 300, "itemSelector": ".item" }'>
    <dtmc:indicators indicators="${indicators}"/>
</div>
