class UrlMappings {


    static mappings = {

        "/api/status"(controller:"status", action:"index", method:"GET")

        "/api/books"(resources:"book")

        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }

//        "/"(view:"/index")
        "500"(view:'/error')
    }

//    static mappings = {
//
//        "/phones/phones.json" {
//            controller = "phones"
//        }
//
//        "/phones/${phoneId}.json" {
//            controller = "phones"
//            action = "showPhone"
//        }
//
//        "/"(view:"/index")
//    }

//    static mappings = {
////
//
//
//        "/login/auth"{
//            controller = 'home'
//            action = { 'index' }
//            view = { 'index' }
//        }
//
//        "/timeline"(view: "/timeline/index")
//        /*
//         * Pages without controller
//         */
////        "/blog"(view: "/siteinfo/blog")
////        "/systeminfo"(view: "/siteinfo/systeminfo")
////        "/contact"(view: "/siteinfo/contact")
////        "/terms"(view: "/siteinfo/terms")
////        "/imprint"(view: "/siteinfo/imprint")
//
//        /*
//         * Pages with controller
//         * WARN: No domain/controller should be named "api" or "mobile" or "web"!
//         */
//        "/" {
//            controller = 'home'
//            action = { 'index' }
//            view = { 'index' }
//        }
//
//        "/$controller/$action?/$id?" {
//            constraints {
//                controller(matches: /^((?!(api|mobile|web)).*)$/)
//            }
//        }
//
//        /**
//         * Spring Security Controller Mappings
//         */
//        "/login/$action?"(controller: "login")
//        "/logout/$action?"(controller: "logout")
//
//        /*
//         * System Pages without controller
//         */
//        "403"(view: '/_errors/403')
//        "404"(view: '/_errors/404')
//        "500"(view: '/_errors/error')
//        "503"(view: '/_errors/503')
//    }
}
