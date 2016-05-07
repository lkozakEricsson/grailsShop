class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/grails"(view:"/grails")
        "/"(view:"/index")
        "500"(view:'/error')

        "/user"(resources: 'user', version: "1.0")
	}
}
