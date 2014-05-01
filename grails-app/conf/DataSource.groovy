dataSource {
    //ORACLE
    dbCreate = "create-drop"
    url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"
    pooled = true
    username = "dtmc"
    password = "dtmc"
    driverClassName = "oracle.jdbc.driver.OracleDriver"
    dialect = "org.hibernate.dialect.OracleDialect"

    properties {
        maxActive = -1
        minEvictableIdleTimeMillis = 1800000
        timeBetweenEvictionRunsMillis = 1800000
        numTestsPerEvictionRun = 3
        testOnBorrow = true
        testWhileIdle = true
        testOnReturn = true
        validationQuery = "SELECT 1 from dual"
    }
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "none"
            username = "dtmc_dev"
            password = "dtmc_dev"
        }
    }
    test {
        dataSource {
            dbCreate = "create-drop"
            username = "dtmc_test"
            password = "dtmc_test"
        }
    }
    production {
        dataSource {
            dbCreate = "none"
            username = "dtmc"
            password = "dtmc"
        }
    }
}
