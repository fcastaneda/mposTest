dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
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
             dbCreate = 'update' // one of 'create', 'create-drop', 'update', 'validate', ''
           // url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
			driverClassName = "org.postgresql.Driver"
			username = "postgres"
			password = "ancer22"
			url = "jdbc:postgresql://localhost/mposcloud"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
        }
    }
    production {
        dataSource {
             dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
           // url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
			driverClassName = "org.postgresql.Driver"
			username = "postgres"
			password = "chitopan22"
			url = "jdbc:postgresql://localhost/mposcloud"
        }
    }
}
