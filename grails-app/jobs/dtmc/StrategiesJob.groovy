package dtmc


class StrategiesJob {

    def dailyService

    static triggers = {
        simple repeatInterval: 5000l // execute job once in 5 seconds
    }

    def execute() {

//        println "Execute"
        //      dailyService.updateDailyDatabase()

    }
}
