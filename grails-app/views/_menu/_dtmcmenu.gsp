<ul class="nav">

    <li class="${'portfolio'.equals(params.controller) ? 'active' : ''}">
        <g:link controller="portfolio" action="">Portfolio</g:link>
    </li>

    <li class="${'stock'.equals(params.controller) ? 'active' : ''}">
        <g:link controller="stock" action="">Stock</g:link>
    </li>

    <li class="${'userIndicators'.equals(params.controller) ? 'active' : ''}">
        <g:link controller="userIndicators" action="">User Indicators</g:link>
    </li>

</ul>
