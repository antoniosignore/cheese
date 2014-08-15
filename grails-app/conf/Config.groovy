// locations to search for config files that get merged into the main config;
// config files can be ConfigSlurper scripts, Java properties files, or classes
// in the classpath in ConfigSlurper format

// grails.config.locations = [ "classpath:${appName}-config.properties",
//                             "classpath:${appName}-config.groovy",
//                             "file:${userHome}/.grails/${appName}-config.properties",
//                             "file:${userHome}/.grails/${appName}-config.groovy"]

// if (System.properties["${appName}.config.location"]) {
//    grails.config.locations << "file:" + System.properties["${appName}.config.location"]
// }

//grails.plugin.springsecurity.ui.encodePassword = false

grails.project.groupId = appName // change this to alter the default package name and Maven publishing destination
grails.mime.file.extensions = true // enables the parsing of file extensions from URLs into the request format
grails.mime.use.accept.header = false
grails.mime.types = [
        all: '*/*',
        atom: 'application/atom+xml',
        css: 'text/css',
        csv: 'text/csv',
        form: 'application/x-www-form-urlencoded',
        html: ['text/html', 'application/xhtml+xml'],
        js: 'text/javascript',
        json: ['application/json', 'text/json'],
        multipartForm: 'multipart/form-data',
        rss: 'application/rss+xml',
        text: 'text/plain',
        xml: ['text/xml', 'application/xml']
]

// URL Mapping Cache Max Size, defaults to 5000
//grails.urlmapping.cache.maxsize = 1000

// What URL patterns should be processed by the resources plugin
//grails.resources.adhoc.patterns = ['/images/*', '/css/*', '/js/*', '/plugins/*']

// The default codec used to encode data with ${}
grails.views.default.codec = "none" // none, html, base64
grails.views.gsp.encoding = "UTF-8"
grails.converters.encoding = "UTF-8"
// enable Sitemesh preprocessing of GSP pages
grails.views.gsp.sitemesh.preprocess = true
// scaffolding templates configuration
grails.scaffolding.templates.domainSuffix = 'Instance'

// Set to false to use the new Grails 1.2 JSONBuilder in the render method
grails.json.legacy.builder = false
// enabled native2ascii conversion of i18n properties files
grails.enable.native2ascii = true
// packages to include in Spring bean scanning
grails.spring.bean.packages = []
// whether to disable processing of multi part requests
grails.web.disable.multipart = false

// request parameters to mask when logging exceptions
grails.exceptionresolver.params.exclude = ['password']

// configure auto-caching of queries by default (if false you can cache individual queries with 'cache: true')
grails.hibernate.cache.queries = false


environments {
    development {
        grails.logging.jul.usebridge = true

        grails.serverURL = "http://localhost:8080/${appName}"
    }
    production {
        grails.logging.jul.usebridge = false
        // TODO: grails.serverURL = "http://www.changeme.com"
    }
}

// log4j configuration
log4j = {
    error 'org.codehaus.groovy.grails.web.servlet',          // controllers
            'org.codehaus.groovy.grails.web.pages',          // GSP
            'org.codehaus.groovy.grails.web.sitemesh',       // layouts
            'org.codehaus.groovy.grails.web.mapping.filter', // URL mapping
            'org.codehaus.groovy.grails.web.mapping',        // URL mapping
            'org.codehaus.groovy.grails.commons',            // core / classloading
            'org.codehaus.groovy.grails.plugins',            // plugins
            'org.springframework',
            'org.codehaus.groovy.grails.orm.hibernate',
            'org.hibernate',
            'net.sf.ehcache.hibernate'

    debug 'org.springframework.security'
}

grails.config.defaults.locations = [KickstartResources]

grails.gorm.default.constraints = {
    '*'(nullable: true)
}

grails {
    mail {
        host = "smtp.gmail.com"
        port = 465
        username = "antonio.signore@gmail.com"
        password = "Nicholas1#"
        props = ["mail.smtp.auth": "true",
                "mail.smtp.socketFactory.port": "465",
                "mail.smtp.socketFactory.class": "javax.net.ssl.SSLSocketFactory",
                "mail.smtp.socketFactory.fallback": "false"]

    }
}

//grails.plugin.cloudfoundry.username = "<your_username>"
//grails.plugin.cloudfoundry.password = "<pass>"

// Uncomment and edit the following lines to start using Grails encoding & escaping improvements

/* remove this line 
// GSP settings
grails {
    views {
        gsp {
            encoding = 'UTF-8'
            htmlcodec = 'xml' // use xml escaping instead of HTML4 escaping
            codecs {
                expression = 'html' // escapes values inside null
                scriptlet = 'none' // escapes output from scriptlets in GSPs
                taglib = 'none' // escapes output from taglibs
                staticparts = 'none' // escapes output from static template parts
            }
        }
        // escapes all not-encoded output at final stage of outputting
        filteringCodecForContentType {
            //'text/html' = 'html'
        }
    }
}
remove this line */

grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.dtmc.club.Member'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.dtmc.security.SecUserSecRole'
grails.plugin.springsecurity.authority.className = 'com.dtmc.security.SecRole'
grails.plugin.springsecurity.password.algorithm = 'SHA-512'
grails.plugin.springsecurity.logout.postOnly = false
grails.plugin.springsecurity.rejectIfNoRule = true

grails.plugin.springsecurity.rememberMe.persistent = true


// Added by the JQuery Validation UI plugin:
jqueryValidationUi {
    errorClass = 'error'
    validClass = 'valid'
    onsubmit = true
    renderErrorsOnTop = true

    qTip {
        packed = true
        classes = 'ui-tooltip-red ui-tooltip-shadow ui-tooltip-rounded'
    }

    /*
      Grails constraints to JQuery Validation rules mapping for client side validation.
      Constraint not found in the ConstraintsMap will trigger remote AJAX validation.
    */
    StringConstraintsMap = [
            blank: 'required', // inverse: blank=false, required=true
            creditCard: 'creditcard',
            email: 'email',
            inList: 'inList',
            minSize: 'minlength',
            maxSize: 'maxlength',
            size: 'rangelength',
            matches: 'matches',
            notEqual: 'notEqual',
            url: 'url',
            nullable: 'required',
            unique: 'unique',
            validator: 'validator'
    ]

    // Long, Integer, Short, Float, Double, BigInteger, BigDecimal
    NumberConstraintsMap = [
            min: 'min',
            max: 'max',
            range: 'range',
            notEqual: 'notEqual',
            nullable: 'required',
            inList: 'inList',
            unique: 'unique',
            validator: 'validator'
    ]

    CollectionConstraintsMap = [
            minSize: 'minlength',
            maxSize: 'maxlength',
            size: 'rangelength',
            nullable: 'required',
            validator: 'validator'
    ]

    DateConstraintsMap = [
            min: 'minDate',
            max: 'maxDate',
            range: 'rangeDate',
            notEqual: 'notEqual',
            nullable: 'required',
            inList: 'inList',
            unique: 'unique',
            validator: 'validator'
    ]

    ObjectConstraintsMap = [
            nullable: 'required',
            validator: 'validator'
    ]

    CustomConstraintsMap = [
            phone: 'true', // International phone number validation
            phoneUS: 'true',
            alphanumeric: 'true',
            letterswithbasicpunc: 'true',
            lettersonly: 'true'
    ]
}

/*
API key LDdFsq60HIl8chtW3uM0Yl1A7
API secret pxJoW4n5Cqou9k3oE5ApEmJKexgvMzTvw0D249mkpJQV45oqD6
Access level Read, write, and direct messages (modify app permissions)
Owner signore
Owner ID 22603665

Your access token
This access token can be used to make API requests on your own account's behalf. Do not share your access token secret with anyone.
Access token 22603665-bgESXvwPCkI3RGCKT5l74M4XzgA9Jh8NC8pFVNgpn
Access token secret 0lkrNjktJKXcsFk7oYtJxy3CQnQ55CT5ZrzVCNC2AGcNC
Access level Read-only
Owner signore
Owner ID 22603665
 */

twitter {
//    disableTwitter4jController = true
    'default' {
        OAuthConsumerKey = 'LDdFsq60HIl8chtW3uM0Yl1A7'
        OAuthConsumerSecret = 'pxJoW4n5Cqou9k3oE5ApEmJKexgvMzTvw0D249mkpJQV45oqD6'
        OAuthAccessToken = '22603665-hXPuOfxsuLsa5znEEdM1RoAAmBk737Is6ojmG5moh'
        OAuthAccessTokenSecret = 'F8ctEhrrXvmAwUYYlRRv9LG7KTDsU6qIzS9Lr3t8CqyRy'
    }
}

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'

grails.plugin.springsecurity.interceptUrlMap = [
        '/':                  ['permitAll'],
        '/index':             ['permitAll'],
        '/index.html':        ['permitAll'],
        '/assets/**':         ['permitAll'],
        '/**/js/**':          ['permitAll'],
        '/**/css/**':         ['permitAll'],
        '/**/images/**':      ['permitAll'],
        '/**/favicon.ico':    ['permitAll'],
        '/app/**':            ['permitAll'],
        '/login/**':          ['permitAll'],
        '/logout/**':         ['permitAll'],
        '/home/**':           ['permitAll'],
        '/trade/**':          ['ROLE_ADMIN'],
        '/stock/**':          ['ROLE_ADMIN'],
        '/instrument/**':     ['ROLE_ADMIN'],
        '/portfolio/**':      ['ROLE_ADMIN'],
        '/portfolioEntry/**': ['ROLE_ADMIN'],
        '/partials/**':       ['permitAll'],
        '/rest/status':       ['permitAll'],
        '/**':                ['ROLE_ADMIN']
]

grails.plugin.springsecurity.useBasicAuth = true

grails.plugin.springsecurity.filterChain.chainMap = [
'/rest/**': 'statelessSecurityContextPersistenceFilter,logoutFilter,authenticationProcessingFilter,customBasicAuthenticationFilter,securityContextHolderAwareRequestFilter,rememberMeAuthenticationFilter,anonymousAuthenticationFilter,basicExceptionTranslationFilter,filterInvocationInterceptor',
]

cors.url.pattern = '/rest/*'
