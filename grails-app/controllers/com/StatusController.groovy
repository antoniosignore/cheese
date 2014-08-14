package com;

import grails.converters.JSON

import javax.servlet.http.HttpServletResponse

class StatusController {

    def springSecurityService
    def userCache

    def index() {
        if(springSecurityService.isLoggedIn()) {
            render([user:springSecurityService.currentUser] as JSON)
        }else {
            response.sendError HttpServletResponse.SC_UNAUTHORIZED
        }
    }

}
