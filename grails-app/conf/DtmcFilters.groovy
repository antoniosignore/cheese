import com.dtmc.club.Member

class DtmcFilters {

    def springSecurityService
    def filters = {

        all(controller: '*', action: '*') {
            before = {

            }

            after = { Map model ->

            }
            afterView = { Exception e ->

            }
        }

    }
}
