package dtmc

import com.dtmc.club.Member

class SiteinfoController {

    def springSecurityService

    public Member member(Long id) {
        def memberInstance
        if (!id) {
            def grailsuser = springSecurityService.principal
            memberInstance = Member.get(grailsuser.id)
        } else {
            memberInstance = Member.get(id)
        }
        return memberInstance
    }

    static allowedMethods = [
            about: "GET",
            blog: "GET",
            contact: "GET",
            terms: "GET",
            imprint: "GET",
            systeminfo: "GET"]

    def about(Long id) {
        [user: member(id)]
    }

    def systeminfo(Long id) {
        [user: member(id)]
    }

    def contact(Long id) {
        [user: member(id)]
    }

    def terms(Long id) {
        [user: member(id)]
    }

    def imprint(Long id) {
        [user: member(id)]
    }

}
