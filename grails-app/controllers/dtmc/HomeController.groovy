package dtmc

import com.netnumeri.server.finance.finpojo.asset.Stock
import grails.converters.JSON

class HomeController {

    def index() {
        render(view: "index")
    }

    def ajaxStockFinder = {
        def stockFound = Stock.withCriteria {
            ilike 'name', params.term + '%'
        }
        render(stockFound?.name as JSON)
    }
}
