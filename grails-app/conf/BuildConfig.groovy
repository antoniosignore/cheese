grails.servlet.version = "2.5" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"
grails.project.dependency.resolver = "maven"

// uncomment (and adjust settings) to fork the JVM to isolate classpaths
//grails.project.fork = [
//   run: [maxMemory:1024, minMemory:64, debug:false, maxPerm:256]
//]

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false
    // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()

        mavenRepo "http://snapshots.repository.codehaus.org"
        mavenRepo "http://repository.codehaus.org"
        mavenRepo "http://download.java.net/maven/2/"
        mavenRepo "http://repository.jboss.com/maven2/"
        mavenRepo "http://maven.springframework.org/milestone/"
        mavenRepo 'http://repo.spring.io/milestone'
        mavenRepo 'http://xuggle.googlecode.com/svn/trunk/repo/share/java/'

    }

    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.

        build "gov.nist.math:jama:1.0.2"

        //  build "xuggle:xuggle-xuggler:5.4"

        runtime 'com.oracle.jdbc:com.springsource.oracle.jdbc:10.2.0.2'

        compile 'jfree:jfreechart:1.0.13'


	compile "com.google.guava:guava:13.0"

        runtime group:"org.twitter4j", name:"twitter4j-core", version:"4.0.1"
        runtime group:"org.twitter4j", name:"twitter4j-async", version:"4.0.1"
        runtime group:"org.twitter4j", name:"twitter4j-stream", version:"4.0.1"


//        compile 'org.grails:grails-datastore-gorm:3.0.4.RELEASE'
//        compile 'org.grails:grails-datastore-core:3.0.4.RELEASE'
//        test 'org.grails:grails-datastore-simple:3.0.4.RELEASE'

//        runtime ":angularjs-resources:<plugin-version>"
    }

    plugins {

        build ":tomcat:7.0.52.1"

        // plugins for the compile step
//        compile ":scaffolding:2.0.2"
        compile ":scaffolding:2.0.2"
        compile ':cache:1.1.1'

        // plugins needed at runtime but not for compilation
        runtime ":hibernate:3.6.10.9" // or ":hibernate4:4.3.4"
        runtime ":database-migration:1.3.8"
        runtime ":jquery:1.11.0.2"
        runtime ":resources:1.2.7"
        // Uncomment these (or add new ones) to enable additional resources capabilities
        //runtime ":zipped-resources:1.0.1"
        //runtime ":cached-resources:1.1"
        //runtime ":yui-minify-resources:0.1.5"

        // An alternative to the default resources plugin is the asset-pipeline plugin
        //compile ":asset-pipeline:1.6.1"

        // Uncomment these to enable additional asset-pipeline capabilities
        //compile ":sass-asset-pipeline:1.5.5"
        //compile ":less-asset-pipeline:1.5.3"
        //compile ":coffee-asset-pipeline:1.5.0"
        //compile ":handlebars-asset-pipeline:1.3.0.1"

        compile ":gson:1.1.4"


        runtime ':kickstart-with-bootstrap:0.9.6'
//        runtime ':lesscss-resources:1.3.1'
//        runtime ':font-awesome-resources:3.0'


        runtime ":raphael:2.0.1"

        compile ':mail:1.0.1', {
            excludes 'spring-test'
        }
        compile ":cookie:0.4"
        compile ":cache-headers:1.1.5"
        compile ":rest:0.8"

        compile ':cache:1.0.1'

//        compile ":scaffolding:1.0.0"

        compile ":spring-security-core:2.0-RC2"
        compile ":quartz:1.0.1"

//        compile ":mongodb:2.0.1"

        compile ':feeds:1.6'
//        compile ':form-helper:0.2.8'
        compile ":taggable:1.0.1"

//        compile ":tooltip:0.8"

//        compile(":twitter4j:0.3.2") {
//            excludes "twitter4j-core", "twitter4j-async", "twitter4j-stream"
//        }

//        compile ":twitter-checker:0.2"

//        compile ':asset-pipeline:1.8.3'
//        compile ":spring-security-rest:1.4.0.M2"

//        compile ":angularjs-resources:1.2.16"

//        compile ":searchable:0.6.5"
//        runtime ":cors:1.1.4"

    }
}
