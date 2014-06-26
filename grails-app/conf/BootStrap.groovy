import com.dtmc.club.Club
import com.dtmc.club.Member
import com.dtmc.security.SecRole
import com.dtmc.security.SecUserSecRole
import com.netnumeri.server.enums.*
import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.finance.indicator.UserIndicators
import com.phonecat.Android
import com.phonecat.Battery
import com.phonecat.Camera
import com.phonecat.Connectivity
import com.phonecat.Display
import com.phonecat.Hardware
import com.phonecat.Phone
import com.phonecat.PhoneDetail
import com.phonecat.SizeAndWeight
import com.phonecat.Storage
import grails.converters.JSON

class BootStrap {

    def portfolioService
    def grailsApplication


    def init = { servletContext ->


        JSON.registerObjectMarshaller( Phone ) { Phone phone ->
            return [
                    age : phone.age,
                    id : phone.phoneId,
                    imageUrl : phone.imageUrl,
                    name : phone.name,
                    snippet : phone.snippet
            ]
        }

        JSON.registerObjectMarshaller( PhoneDetail ) { PhoneDetail phoneDetail ->
            return [
                    additionalFeatures: phoneDetail.additionalFeatures,
                    android: phoneDetail.android,
                    availability: phoneDetail.availability,
                    battery: phoneDetail.battery,
                    camera: phoneDetail.camera,
                    connectivity: phoneDetail.connectivity,
                    description: phoneDetail.description,
                    display: phoneDetail.display,
                    hardware: phoneDetail.hardware,
                    id: phoneDetail.phoneId,
                    images: phoneDetail.images,
                    name: phoneDetail.name,
                    sizeAndWeight: phoneDetail.sizeAndWeight,
                    storage: phoneDetail.storage
            ]
        }

        JSON.registerObjectMarshaller( Camera ) { Camera camera ->
            return [
                    primary : camera.primaryCamera,
                    features : camera.features,
            ]
        }

        File phonesFolder = grailsApplication.mainContext.getResource("/phonesJson").file

        phonesFolder.listFiles().each { File file ->

            if(file.name.equals("phones.json")){

                def jsonPhones = grails.converters.JSON.parse(file.text)
                jsonPhones.each {
                    Phone phone = new Phone(it)
                    phone.phoneId = it.id
                    phone.save(flush:true, failOnError:true)
                }

            } else {

                def jsonPhoneDetail = grails.converters.JSON.parse(file.text)

                PhoneDetail phoneDetail = new PhoneDetail(jsonPhoneDetail)
                phoneDetail.phoneId = jsonPhoneDetail.id

                phoneDetail.setAndroid(new Android(jsonPhoneDetail.android))
                phoneDetail.setBattery(new Battery(jsonPhoneDetail.battery))

                Camera camera = new Camera(jsonPhoneDetail.camera)
                camera.primaryCamera = jsonPhoneDetail.camera.primary
                phoneDetail.setCamera(camera)

                phoneDetail.setConnectivity(new Connectivity(jsonPhoneDetail.connectivity))
                phoneDetail.setDisplay(new Display(jsonPhoneDetail.display))
                phoneDetail.setHardware(new Hardware(jsonPhoneDetail.hardware))
                phoneDetail.setSizeAndWeight(new SizeAndWeight(jsonPhoneDetail.sizeAndWeight))
                phoneDetail.setStorage(new Storage(jsonPhoneDetail.storage))

                phoneDetail.save(flush:true, failOnError:true)

            }
        }


        //createTickers()

        createData()


    }

    def createTickers() {

        if (Stock.getAll() == null || Stock.getAll().size() == 0) {
            String str = "";
            InputStream is = this.class.classLoader.getResourceAsStream('companylist.csv')
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            if (is != null) {
                while ((str = reader.readLine()) != null) {
                    String[] splits = str.split(";")
                    println "splits 0 " + splits[0]
                    if (splits[0] == null || splits[0].length() == 0)
                        break;
                    Stock stock = new Stock(splits[0], splits[1]);
                    stock.save(failOnError: true, insert: true, flush: true)
                }
            }
            is.close();
        }
    }

    def destroy = {
    }

    private static void createData() {


        if (Club.getAll() == null || Club.getAll().size() == 0) {

            Club club = new Club(name: 'mioclub').save(flush: true)

            def superuserRole = new SecRole(authority: 'ROLE_SUPERUSER').save(flush: true)
            def adminRole = new SecRole(authority: 'ROLE_ADMIN').save(flush: true)
            def userRole = new SecRole(authority: 'ROLE_USER').save(flush: true)

            def superUser = new Member(username: 'superuser', enabled: true, password: 'cheese')
            superUser.save(flush: true, failOnError: true)

            SecUserSecRole.create superUser, superuserRole, true

            def adminUser = new Member(username: 'admin', enabled: true, password: 'cheese')
            adminUser.save(flush: true, failOnError: true)
            adminUser.club = club
            SecUserSecRole.create adminUser, adminRole, true

            def user = new Member(username: 'user', enabled: true, password: 'cheese')
            user.club = club
            user.save(flush: true, failOnError: true)
            SecUserSecRole.create user, userRole, true

            assert Member.count() == 3
            assert SecRole.count() == 3
            assert SecUserSecRole.count() == 3

//            Portfolio portfolio = new Portfolio("SMA crossing", "desc", 10000)
//            portfolio.portfolioType = PortfolioTypeEnum.Main
//            portfolio.user = adminUser
//            portfolio.save(failOnError: true, insert: true, flush: true)
//
//            println "portfolio.id = $portfolio.id"
//
//            Stock aapl = new Stock("AAPL", "Apple Computers");
//            aapl.save(flush: true)
//
//            // portfolioService.buy(portfolio, stock, 100);
//            portfolio.save(failOnError: true, insert: true, flush: true);

            if (UserIndicators.getAll() == null || UserIndicators.getAll().size() == 0) {

                UserIndicators userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.Normalized, name: "normalized");
                userIndicators.save(flush: true, failOnError: true)

                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SingularSpectrumFirstComponent, name: "ssa0", integer1: 50);
                userIndicators.save(flush: true, failOnError: true)

                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SingularSpectrumSecondComponent, name: "ssa1", integer1: 50);
                userIndicators.save(flush: true, failOnError: true)

                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SingularSpectrumThirdComponent, name: "ssa2", integer1: 50);
                userIndicators.save(flush: true, failOnError: true)

                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SingularSpectrumSecondThirdComponent, name: "ssa23", integer1: 50);
                userIndicators.save(flush: true, failOnError: true)

//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SingularSpectrumPrediction, name: "ssa predict", integer1: 50);
//                userIndicators.save(flush: true, failOnError: true)

                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SimpleMovingAverage, name: "sma 10", integer1: 10);
                userIndicators.save(flush: true, failOnError: true)

                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SimpleMovingAverage, name: "sma 50", integer1: 50);
                userIndicators.save(flush: true, failOnError: true)

                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.WeightedMovingAverage, name: "wma 50", integer1: 50);
                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SingularSpectrumFirstSecondComponent, name: "ssa01", integer1: 50);
//                userIndicators.save(flush: true, failOnError: true)

//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.PriceChannelUpper, name: "PC Upper", integer1: 10, double2: 50);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.PriceChannelLower, name: "PC Lower", integer1: 10, double2: 50);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.UpperBollingerBand, name: "BB Upper", integer1: 10, double1: 2);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.LowerBollingerBand, name: "BB Lower", integer1: 10, double1: 2);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.SimpleMovingVariance, name: "Simple Moving variance", integer1: 10);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.Momentum, name: "Momentum", integer1: 10);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.MACD, name: "MACD", integer1: 13, integer2: 26);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.MACDSignal, name: "MACD-Signal", integer1: 13, integer2: 26, integer3: 5);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.RelativeStrengthIndex, name: "Relative Strength Index", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.RelativeStrengthIndex2, name: "Relative Strength Index 2", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.CommodityChannelIndexOverPeriod, name: "Commodity Channel Index Over Period", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.CommodityChannelIndicator, name: "Commodity Channel", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.MoneyFlowOverPeriod, name: "MoneyFlow Over Period", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.ChaikinMoneyFlowOverPeriod, name: "Chaikin MoneyFlow Over Period", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.ChaikinOscillatorOverPeriod, name: "Chaikin Oscillator Over Period", integer1: 1);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.AroonOscillatorOverPeriod, name: "Aroon Oscillator Over Period", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.AroonDownOverPeriod, name: "Aaron Down Over Period", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.AroonUpOverPeriod, name: "Aaron Up Over Period", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.TrueRangePeriod, name: "True Range Over Period");
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.kFastStochasticPeriod, name: "K Fast Stochastic", integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.dStochastic, name: "D Stochastic Indicator", integer1: 1, integer2: 14, integer3: 10);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.DStochasticSmoothed, name: "D Stochastic Smoothed", integer1: 10, smoothing1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.ChaikinVolatility, name: "Chaikin Volatility", smoothing1: 10, integer1: 14);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.PlusDirectionalMovementPeriod, name: "Plus DMI Indicator");
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.RateOfChangePeriod, name: "Rate of Change Over Period", integer1: 10);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.Kairi, name: "Kairi Indicator", smoothing1: 10);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.MomentumPctPeriod, name: "Momentum Pct Period Indicator", integer1: 10);
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.MarketFacilitationIndexOverPeriod, name: "Market Facilitation Index");
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.BalanceOfPowerOverPeriod, name: "Balance of Power");
//                userIndicators.save(flush: true, failOnError: true)
//
//                userIndicators = new UserIndicators(user: adminUser, type: IndicatorEnum.PriceActionOverPeriod, name: "Price action over period");
//                userIndicators.save(flush: true, failOnError: true)

            }
        }
    }
}