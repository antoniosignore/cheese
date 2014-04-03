<ul class="nav pull-right">
    <li class="dropdown dropdown-btn">

        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
            <i class="icon-info-sign"></i>
            <g:message code="default.info.label"/> <b class="caret"></b>
        </a>

        <ul class="dropdown-menu">

            <li class="">
                <a href="${createLink(uri: '/siteinfo/about')}">
                    <i class="icon-info-sign"></i>
                    <g:message code="default.about.label"/>
                </a>
            </li>
            <li class="">
                <a href="http://antoniosignore.wordpress.com/">
                    <i class="icon-align-justify"></i>
                    <i><g:message code="default.blog.label"/></i>
                </a>
            </li>
            <li class="">
                <a href="${createLink(uri: '/siteinfo/contact')}">
                    <i class="icon-envelope"></i>
                    <g:message code="default.contact.label"/>
                </a>
            </li>

            <li class="divider"></li>
            <li class=""><a href="${createLink(uri: '/siteinfo/imprint')}">Imprint</a></li>
            <li class=""><a href="${createLink(uri: '/siteinfo/terms')}"><i>Terms of Use</i></a></li>
        </ul>
    </li>
</ul>
