class UrlMappings {

    static mappings = {
//
        "/login/auth"{
            controller = 'home'
            action = { 'index' }
            view = { 'index' }
        }

        /*
         * Pages without controller
         */
//        "/blog"(view: "/siteinfo/blog")
//        "/systeminfo"(view: "/siteinfo/systeminfo")
//        "/contact"(view: "/siteinfo/contact")
//        "/terms"(view: "/siteinfo/terms")
//        "/imprint"(view: "/siteinfo/imprint")

        /*
         * Pages with controller
         * WARN: No domain/controller should be named "api" or "mobile" or "web"!
         */
        "/" {
            controller = 'home'
            action = { 'index' }
            view = { 'index' }
        }

        "/$controller/$action?/$id?" {
            constraints {
                controller(matches: /^((?!(api|mobile|web)).*)$/)
            }
        }

        /**
         * Spring Security Controller Mappings
         */
        "/login/$action?"(controller: "login")
        "/logout/$action?"(controller: "logout")

        /*
         * System Pages without controller
         */
        "403"(view: '/_errors/403')
        "404"(view: '/_errors/404')
        "500"(view: '/_errors/error')
        "503"(view: '/_errors/503')
    }
}
