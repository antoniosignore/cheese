<html>

<head>
    <title><g:message code="default.contact.title"/></title>
    <meta name="layout" content="kickstart"/>

    <g:set var="layout_nomainmenu" value="${true}" scope="request"/>
    <g:set var="layout_nosecondarymenu" value="${true}" scope="request"/>
</head>

<body>

<section id="intro">
    <p class="lead">
        For ongoing information about Don't Touch My Cheese, please read our company
        <a href="http://wordpress.com/signup/">blog</a>. Also, feel free to
    contact us with service questions, partnership proposals, or media
    inquiries.
    </p>
</section>

<section id="address">
    <div class="row-fluid">
        <div class="span4">
            <h1><g:message code="default.contact.address"/></h1>
            <address>
                <strong>DTMC Central Ltd.</strong><br>
                123 Future Ave<br>
                San Francisco, CA 94107<br>
                <br>
                <strong><abbr title="Phone">Phone</abbr></strong>
                (123) 456-7890
                <br>

                <strong><abbr title="Phone">Fax</abbr></strong>
                +49 (0) 72 27 - 95 35 - 605
                <br>

                <strong><abbr title="Phone">Email</abbr></strong>
                <a href="mailto:info@${meta(name: 'app.name')}.com">info@${meta(name: 'app.name')}.com</a>
                <br>

            </address>
        </div>

        <div class="span8">
            <iframe width="100%" scrolling="no" height="300" frameborder="0"
                    src="http://maps.google.ca/maps?f=q&source=s_q&hl=en&geocode=&q=123+Future+Ave,San+Francisco,+CA+94107&ie=UTF8&hq=&hnear=Downtown,San+Francisco,+CA+94107&z=12&iwloc=near&output=embed"
                    marginwidth="0" marginheight="0"></iframe>
        </div>
    </div>
</section>

</body>

</html>
