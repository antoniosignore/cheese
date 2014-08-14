class UrlMappings {


    static mappings = {

        "/rest/status"(controller:"status", action:"index", method:"GET")
        "/rest/stocks"(controller:"stock", action:"list", method:"GET")

        "/rest/$controller/$action?/$id?" {
            constraints {
                controller(matches: /^((?!(api|mobile|web)).*)$/)
            }
        }

        "500"(view:'/error')
    }

}
