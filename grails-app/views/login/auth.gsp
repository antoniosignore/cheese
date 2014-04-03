<!doctype html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    %{--<meta name="layout" content="kickstart"/>--}%

</head>

<body>

PIPPO
<sec:ifNotLoggedIn>

    <section id="login" class="first">

        <div class="row">
            <div class="span3"></div>

            <div class="span6">
                <h3><g:message code="springSecurity.login.header"/></h3>

                <form id='loginForm' class='form-horizontal' action='${postUrl}' method='POST' autocomplete='off'>
                    <fieldset class="form">
                        <div class="control-group fieldcontain ${hasErrors(bean: _DemoPageInstance, field: 'name', 'error')} ">
                            <label for='username' class="control-label"><g:message
                                    code="springSecurity.login.username.label"/>:</label>

                            <div class="controls">
                                <input type='text' class='span4' name='j_username' id='username'/>
                            </div>
                        </div>

                        <div class="control-group fieldcontain ${hasErrors(bean: _DemoPageInstance, field: 'name', 'error')} ">
                            <label for='password' class="control-label"><g:message
                                    code="springSecurity.login.password.label"/>:</label>

                            <div class="controls">
                                <input type='password' class='span4' name='j_password' id='password'/>
                            </div>
                        </div>

                        <div id="remember_me_holder" class="control-group fieldcontain">
                            <label for='remember_me' class="control-label"><g:message
                                    code="springSecurity.login.remember.me.label"/></label>

                            <div class="controls">
                                <bs:checkBox class="span4" name="${rememberMeParameter}" value="${hasCookie}"/>
                            </div>
                        </div>
                    </fieldset>

                    <div class="controls">
                        <input type='submit' id="submit" class="btn btn-success"
                               value='${message(code: "springSecurity.login.button")}'/>
                        <s2ui:linkButton elementId='register' controller='register'
                                         messageCode='spring.security.ui.login.register'/>
                    </div>
                </form>
            </div>

            <div class="span3"></div>
        </div>
    </section>

    <script type='text/javascript'>
        <!--
        (function () {
            document.forms['loginForm'].elements['j_username'].focus();
        })();
        // -->
    </script>

</sec:ifNotLoggedIn>

</body>
</html>
