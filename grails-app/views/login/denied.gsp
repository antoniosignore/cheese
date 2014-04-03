<!doctype html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="layout" content="kickstart"/>
</head>
<body>

<section id="Error" class="">
    <div class="big-message">
        <div class="container">
            <h2>
                <g:message code="error.no.privileges" default="Not enough role privileges"/>
            </h2>

            <p>
                ${data}
            </p>

            <div class="actions">
                <a href="${createLink(uri: '/')}" class="btn btn-large btn-primary">
                    <i class="icon-chevron-left icon-white"></i>
                    <g:message code="error.button.backToHome"/>
                </a>
                %{--<a href="${createLink(uri: '/contact')}" class="btn btn-large btn-success">--}%
                %{--<i class="icon-envelope"></i>--}%
                %{--<g:message code="error.button.contactSupport"/>--}%
                %{--</a>--}%
            </div>
        </div>
    </div>
</section>

</body>
</html>