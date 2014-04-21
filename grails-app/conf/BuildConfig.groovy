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

//        compile 'org.grails:grails-datastore-gorm:3.0.4.RELEASE'
//        compile 'org.grails:grails-datastore-core:3.0.4.RELEASE'
//        test 'org.grails:grails-datastore-simple:3.0.4.RELEASE'
    }

    plugins {

        runtime ":hibernate:3.6.10.2"
        build ":tomcat:7.0.42"

//        runtime ":jquery:1.10.2"
        runtime ":resources:1.1.6"

        runtime ':kickstart-with-bootstrap:0.9.6'
        runtime ':lesscss-resources:1.3.1'
        runtime ':font-awesome-resources:3.0'

        compile ':gson:1.1.4'

        runtime ":raphael:2.0.1"

        compile ':mail:1.0.1', {
            excludes 'spring-test'
        }
        compile ":cookie:0.4"
        compile ":cache-headers:1.1.5"
        compile ":rest:0.8"

        compile ':cache:1.0.1'

        compile ":scaffolding:1.0.0"

        compile ":spring-security-core:2.0-RC2"
        compile ":quartz:1.0.1"

//        compile ":mongodb:2.0.1"
    }
}
