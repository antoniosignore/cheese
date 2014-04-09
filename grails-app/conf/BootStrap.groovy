import com.dtmc.club.Club
import com.dtmc.club.Member
import com.dtmc.security.SecRole
import com.dtmc.security.SecUserSecRole
import com.netnumeri.server.enums.*
import com.netnumeri.server.finance.candlestick.Pattern
import com.netnumeri.server.finance.finpojo.Portfolio
import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.finance.indicator.UserIndicators

class BootStrap {

    def portfolioService

    def init = { servletContext ->

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

        if (Pattern.getAll() == null || Pattern.getAll().size() == 0) {
            /* Integer code
    PatternTypeEnum patternType
    RelevanceTypeEnum relevanceType
    ReliabilityTypeEnum reliability
    ConfirmationTypeEnum confirmation
    Integer noSticks
    String definition
    String recognition
             */

            new Pattern(code: 1001, name: "BULLISH THREE WHITE SOLDIERS", patternType: PatternTypeEnum.Reversal, relevanceType: RelevanceTypeEnum.Bullish, reliability: ReliabilityTypeEnum.High, confirmation: ConfirmationTypeEnum.Suggested, noSticks: 3, definition: "Bullish Three White Soldiers Pattern is indicative of a strong reversal in the market. It is characterized by three long candlesticks stepping upward like a staircase. The opening of each day is slightly lower than previous close rallying then to a short term high.", recognition: "1. Market is characterized by downtrend.\n" +
                    "2. We see three consecutive long white candlesticks.\n" +
                    "3. Each candlestick closes at a new high. \n" +
                    "4. The opening of each candlestick is within the body of the previous day. \n" +
                    "5. Each consecutive day closes near or at its highs.").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1002, name: "BEARISH THREE BLACK CROWS",
                    patternType: PatternTypeEnum.Reversal, relevanceType:
                    RelevanceTypeEnum.Bearish,
                    priorTrend:RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    definition: "The Bearish Three Black Crows Pattern is indicative of a strong reversal during an uptrend. It consists of three long black candlesticks, which look like a stair stepping downward. The opening price of each day is higher than the previous day's closing price suggesting a move to a new short term low.",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. Three consecutive long black candlesticks appear. \n" +
                            "3. Each day closes at a new low. \n" +
                            "4. Each day opens within the body of the previous day. \n" +
                            "5. Each day closes").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1003, name: "BEARISH EVENING STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish.Bullish,
                    reliability: ReliabilityTypeEnum.High, confirmation: ConfirmationTypeEnum.Suggested, noSticks: 3,
                    definition: "This is a major top reversal pattern formed by three candlesticks. The first candlestick is a long white body; the second one is a small real body that may be white. It is characteristically marked with a gap in higher direction thus forming a star. In fact, the first two candlesticks form a basic star pattern. Finally we see the black candlestick with a closing price well within first session’s white real body. This pattern clearly shows that the market now turned bearish.",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a small candlestick on the second day with a gap in the direction of the previous uptrend.\n" +
                            "4. Finally we see a black candlestick on the third day").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1004, name: "BULLISH MORNING STAR",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    definition: "This is a major top reversal pattern formed by three candlesticks. The first candlestick is a long white body; the second one is a small real body that may be white. It is characteristically marked with a gap in higher direction thus forming a star. In fact, the first two candlesticks form a basic star pattern. Finally we see the black candlestick with a closing price well within first session’s white real body. This pattern clearly shows that the market now turned bearish.",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a small candlestick on the second day with a gap in the direction of the previous uptrend.\n" +
                            "4. Finally we see a black candlestick on the third day").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1005, name: "BULLISH ENGULFING",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "Bullish Engulfing Pattern is a pattern characterized by a large white real body engulfing a preceding small black real body, which appears during a downtrend. The white body does not necessarily engulf the shadows of the black body but totally engulfs the body itself. The Bullish Engulfing Pattern is an important bottom reversal signal.",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. Then we see a small black body.\n" +
                            "3. Next day we see a white body that completely engulfs the black real body of the preceding day.").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1006, name: "BULLISH HAMMER",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 1,
                    definition: "The Bullish Hammer Pattern is a significant candlestick that occurs at the bottom of a trend or during a downtrend and it is called a hammer since it is hammering out a bottom. The Bullish Hammer Pattern is a single candlestick pattern and it has a strong similarity to the Bullish Dragonfly Doji Pattern. In the case of Bullish Dragonfly Doji Pattern, the opening and closing prices are identical whereas the Bullish Hammer Pattern has a small real body at the upper end of the trading range",
                    recognition: "1. The market is characterized by a prevailing downtrend.\n" +
                            "2. Then we see a small real body at the upper end of the trading range. Color of this body is not important.\n" +
                            "3. We would like to see the lower shadow at least twice as long as the real body.\n" +
                            "4. There is no (or almost no) upper shadow.").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1007, name: "BULLISH INVERTED HAMMER",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1008, name: "BULLISH ABANDONED BABY", patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1009, name: "BULLISH PIERCING LINE",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1010, name: "BULLISH HARAMI",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1011, name: "BULLISH UPSIDE GAP THREE METHODS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1012, name: "WHITE MARUBOZU",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1013, name: "BEARISH ENGULFING",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1014, name: "BEARISH HANGING MAN",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1015, name: "BEARISH SHOOTING STAR",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1016, name: "BEARISH ABANDONED BABY",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1017, name: "BEARISH DARK CLOUD COVER",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1018, name: "BEARISH HARAMI",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1019, name: "BEARISH DOWNSIDE GAP THREE METHODS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1020, name: "BLACK MARUBOZU",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1021, name: "BULLISH KICKING",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1022, name: "BULLISH MORNING DOJI STAR",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1023, name: "BULLISH THREE OUTSIDE UP",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1024, name: "BULLISH CONCEALING BABY SWALLOW",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1025, name: "BEARISH KICKING",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1026, name: "BEARISH EVENING DOJI STAR",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1027, name: "BEARISH THREE INSIDE DOWN",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1028, name: "BEARISH THREE OUTSIDE DOWN",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1029, name: "BEARISH UPSIDE GAP TWO CROWS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1030, name: "BULLISH THREE INSIDE UP",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1031, name: "BULLISH DRAGONFLY DOJI",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1032, name: "BULLISH HARAMI CROSS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1033, name: "BULLISH HOMING PIGEON",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1034, name: "BULLISH MATCHING LOW",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1035, name: "BULLISH MEETING LINE",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1036, name: "BULLISH STICK SANDWICH",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1037, name: "BULLISH THREE STAR IN THE SOUTH",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1038, name: "BULLISH TRI STAR",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1039, name: "BULLISH UNIQUE THREE RIVER BOTTOM",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1040, name: "BULLISH BREAKAWAY",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1041, name: "BULLISH LADDER BOTTOM",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1042, name: "BULLISH BELT HOLD",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1043, name: "BULLISH SIDE-BY-SIDE WHITE LINES",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1044, name: "BULLISH MAT HOLD",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1045, name: "BULLISH RISING THREE METHODS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1046, name: "BULLISH UPSIDE GAP THREE METHODS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1047, name: "BULLISH UPSIDE TASUKI GAP",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1048, name: "BULLISH SEPERATING LINES",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1049, name: "BULLISH THREE LINE STRIKE",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1050, name: "BEARISH DRAGONFLY DOJI",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1051, name: "BEARISH HARAMI CROSS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1052, name: "BEARISH MEETING LINES",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1053, name: "BEARISH ADVANCE BLOCK",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1054, name: "BEARISH DELIBERATION",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1055, name: "BEARISH TRI STAR",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1056, name: "BEARISH TWO CROWS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1057, name: "BEARISH BREAKAWAY",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1058, name: "BEARISH BELT HOLD",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1059, name: "BEARISH FALLING THREE METHODS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1060, name: "BEARISH IN NECK",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1061, name: "BEARISH ON NECK",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1062, name: "BEARISH DOWNSIDE TASUKI GAP",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1063, name: "BEARISH SIDE BY SIDE WHITE LINES",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1064, name: "BEARISH SEPERATING LINES",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1065, name: "BEARISH THRUSTING",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1066, name: "BEARISH THREE LINE STRIKE",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1067, name: "BEARISH DOJI STAR"
                    ,
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1068, name: "BULLISH DOJI STAR",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1069, name: "BEARISH TWEEZER TOP",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1070, name: "BULLISH TWEEZER BOTTOM",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1071, name: "BEARISH IDENTICAL THREE CROWS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    definition: "",
                    recognition: "").save(flush: true, insert: true, failOnError: true)

        }

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

            Portfolio portfolio = new Portfolio("SMA crossing", "desc", 10000)
            portfolio.portfolioType = PortfolioTypeEnum.Main
            portfolio.user = adminUser
            portfolio.save(failOnError: true, insert: true, flush: true)

            println "portfolio.id = $portfolio.id"

            Stock aapl = new Stock("AAPL", "Apple Computers");
            aapl.save(flush: true)

            // portfolioService.buy(portfolio, stock, 100);
            portfolio.save(failOnError: true, insert: true, flush: true);

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