package dtmc

import com.netnumeri.server.enums.ConfirmationTypeEnum
import com.netnumeri.server.enums.PatternTypeEnum
import com.netnumeri.server.enums.RelevanceTypeEnum
import com.netnumeri.server.enums.ReliabilityTypeEnum
import com.dtmc.candlestick.Pattern

class StrategiesJob {

    def dailyService

    static triggers = {

        // execute job once in 5 seconds
        simple repeatInterval: 5000

    }

    def execute() {

//       dailyService.updateDailyDatabase()

        if (Pattern.getAll() == null || Pattern.getAll().size() == 0) {

            new Pattern(code: 1001, name: "BULLISH THREE WHITE SOLDIERS",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend:RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "Bullish Three White Soldiers Pattern is indicative of a strong reversal in the market. It is characterized by three long candlesticks stepping upward like a staircase. The opening of each day is slightly lower than previous close rallying then to a short term high.",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see three consecutive long white candlesticks.\n" +
                            "3. Each candlestick closes at a new high. \n" +
                            "4. The opening of each candlestick is within the body of the previous day. \n" +
                            "5. Each consecutive day closes near or at its highs.")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1002, name: "BEARISH THREE BLACK CROWS",
                    patternType: PatternTypeEnum.Reversal, relevanceType:
                    RelevanceTypeEnum.Bearish,
                    priorTrend:RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bearish Three Black Crows Pattern is indicative of a strong reversal during an uptrend. It consists of three long black candlesticks, which look like a stair stepping downward. The opening price of each day is higher than the previous day's closing price suggesting a move to a new short term low.",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. Three consecutive long black candlesticks appear. \n" +
                            "3. Each day closes at a new low. \n" +
                            "4. Each day opens within the body of the previous day. \n" +
                            "5. Each day closes")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1003, name: "BEARISH EVENING STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested, noSticks: 3,
                    patternDefinition: "This is a major top reversal pattern formed by three candlesticks. The first candlestick is a long white body; the second one is a small real body that may be white. It is characteristically marked with a gap in higher direction thus forming a star. In fact, the first two candlesticks form a basic star pattern. Finally we see the black candlestick with a closing price well within first session’s white real body. This pattern clearly shows that the market now turned bearish.",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a small candlestick on the second day with a gap in the direction of the previous uptrend.\n" +
                            "4. Finally we see a black candlestick on the third day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1004, name: "BULLISH MORNING STAR",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "This is a major top reversal pattern formed by three candlesticks. The first candlestick is a long white body; the second one is a small real body that may be white. It is characteristically marked with a gap in higher direction thus forming a star. In fact, the first two candlesticks form a basic star pattern. Finally we see the black candlestick with a closing price well within first session’s white real body. This pattern clearly shows that the market now turned bearish.",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a small candlestick on the second day with a gap in the direction of the previous uptrend.\n" +
                            "4. Finally we see a black candlestick on the third day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1005, name: "BULLISH ENGULFING",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bullish Engulfing Pattern is a pattern characterized by a large white real body engulfing a preceding small black real body, which appears during a downtrend. The white body does not necessarily engulf the shadows of the black body but totally engulfs the body itself. The Bullish Engulfing Pattern is an important bottom reversal signal.",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. Then we see a small black body.\n" +
                            "3. Next day we see a white body that completely engulfs the black real body of the preceding day.")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1006, name: "BULLISH HAMMER",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 1,
                    patternDefinition: "The Bullish Hammer Pattern is a significant candlestick that occurs at the bottom of a trend or during a downtrend and it is called a hammer since it is hammering out a bottom. The Bullish Hammer Pattern is a single candlestick pattern and it has a strong similarity to the Bullish Dragonfly Doji Pattern. In the case of Bullish Dragonfly Doji Pattern, the opening and closing prices are identical whereas the Bullish Hammer Pattern has a small real body at the upper end of the trading range",
                    recognition: "1. The market is characterized by a prevailing downtrend.\n" +
                            "2. Then we see a small real body at the upper end of the trading range. Color of this body is not important.\n" +
                            "3. We would like to see the lower shadow at least twice as long as the real body.\n" +
                            "4. There is no (or almost no) upper shadow.")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1007, name: "BULLISH INVERTED HAMMER",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.DefinitelyRequired,
                    noSticks: 2,
                    patternDefinition: "Bullish Inverted Hammer Pattern is a candlestick characterized by a long upper shadow and a small real body preceded by a long black real body. It is similar in shape to the Bearish Shooting Star. The shooting star appears in a downtrend and thus it becomes a potentially bullish inverted hammer.",
                    recognition: "1. Market is currently characterized by downtrend.\n" +
                            "2. The first day of the pattern is a black candlestick formed at the lower end of the trading range.\n" +
                            "3. The second day of the pattern is a small real body and is formed at the lower end of the trading range. \n" +
                            "4. The color of the second real body is not important, however the color of the body is black in the first day.\n" +
                            "5. No gap down is required, as long as the pattern is seen after a downtrend.\n" +
                            "6. Upper shadow of the second small body should be at least twice as long as the real body.\n" +
                            "7. The second body does not have lower shadow or it has only a very little lower shadow.")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1008, name: "BULLISH ABANDONED BABY",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bullish Abandoned Baby Pattern is a very rare bottom reversal signal. It is composed of a Doji Star, which gaps away (including shadows) from the prior and following days’ candlesticks.",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We usually see a long black candlestick in the first day.\n" +
                            "3. Then a Doji appears on the second day whose shadows gap below the previous day's lower shadow and gaps in the direction of the previous downtrend.\n" +
                            "4. Then we see a white candlestick on the third day with a gap in the opposite direction with no overlapping shadows.")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1009, name: "BULLISH PIERCING LINE",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bullish Piercing Line Pattern is a bottom reversal pattern. A long black candlestick is followed by a gap lower during the next day while the market is in downtrend. The day ends up as a strong white candlestick, which closes more than halfway into the prior black candlestick’s real body.",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a long black candlestick.\n" +
                            "3. Then we see a long white candlestick whose opening price is below previous day’s low on the second day.\n" +
                            "4. The second day’s close is contained within the first day body and it is also above the midpoint of the first day’s body.\n" +
                            "5. The second day however fails to close above the body of the first day.")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1010, name: "BULLISH HARAMI",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.StronglySuggested,
                    noSticks: 2,
                    patternDefinition: "Bullish Harami Pattern is characterized by a small white real body contained within a prior relatively long black real body. “Harami” is an old Japanese word for “pregnant”. The long black candlestick is “the mother” and the small candlestick is “the baby”.",
                    recognition: "1. The market is in a bearish mood characterized by downtrend.\n" +
                            "2. Then we see a long black candlestick.\n" +
                            "3. We see a white candlestick on the following day where the small white real body is completely engulfed by the real body of the first day. The shadows (high/low) of the second candlestick are not necessarily contained within the first body, however it's preferable if they are.")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1011, name: "BULLISH UPSIDE GAP THREE METHODS",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks:3,
                    patternDefinition: "The pattern is characterized by two long white candlesticks with a gap upward between them during an uptrend. The third day is a black candlestick, which closes the gap between the first two. A support for uptrend may be forming caused by temporary profit taking.",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see two long white candlesticks with a gap between them.\n" +
                            "3. Then we see the black candlestick on the third day, which opens within the body of the second day.\n" +
                            "4. The third black candlestick fills the gap between the first two days.")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1012, name: "WHITE MARUBOZU",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 1,
                    patternDefinition: "The White Marubozu is a single candlestick pattern characterized with a long white body having no shadows on either end. It is an extremely strong bullish candlestick pattern.",
                    recognition: "1. A white Marubozu does not have upper or lower shadows.\n" +
                            "2. The day opens and prices continue to go up all day thus forming a long white day with no lower shadow.\n" +
                            "3. The day also closes at the high of the day and hence with no upper shadow")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1013, name: "BEARISH ENGULFING",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bearish Engulfing Pattern is a large black real body, which engulfs a small white real body in an uptrend (it need not engulf the shadows). The Bearish Engulfing Pattern is an important top reversal signal",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a white candlestick in the first day.\n" +
                            "3. Then we see a black candlestick that completely engulfs the real body of the first day.")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1014, name: "BEARISH HANGING MAN",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.DefinitelyRequired,
                    noSticks: 1,
                    patternDefinition: "The Bearish Hanging Man Pattern is a single candlestick and a top reversal pattern. It is very similar to the Bearish Dragonfly Doji Pattern. In case of the Bearish Dragonfly Doji Pattern, the opening and closing prices are identical whereas the Bearish Hanging Man Pattern has a small real body",
                    recognition: "1. We see it at a market top or during an uptrend.\n" +
                            "2. It is characterized by its small real body at the upper end of the trading range and it is located above the trend. The color of the body is unimportant.\n" +
                            "3. It has a lower shadow, which is at least twice the height of the real body.\n" +
                            "4. There is either no upper shadow or a very short upper shadow")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1015, name: "BEARISH SHOOTING STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.DefinitelyRequired,
                    noSticks: 2,
                    patternDefinition: "Bearish Shooting Star Pattern suggests that prices may be approaching to a top. It looks like its name, a shooting star. The shooting star is a small real body characterized by a long upper shadow, which gaps away from the prior real body",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a white candlestick in the first day.\n" +
                            "3. Prices then open with a gap creating a small real body at the lower end of the trading range on the second day.\n" +
                            "4. Upper shadow of the pattern on the second day is usually at least twice as long as the real body.\n" +
                            "5. However; second day pattern has no (or close to none) lower shadow")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1016, name: "BEARISH ABANDONED BABY",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bearish Abandoned Baby Pattern is a very rare top reversal signal. It is basically composed of a Doji Star, which shows gaps (including shadows) from the prior and following sessions’ candlesticks",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a doji on the second day whose shadows characteristically gap above the previous day's upper shadow and also gaps in the direction of the previous uptrend.\n" +
                            "4. Finally we see a black candlestick characterized with a gap in the opposite direction, with no overlapping shadows.")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1017, name: "BEARISH DARK CLOUD COVER",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bearish Dark Cloud Cover Pattern is a two-candlestick pattern signaling a top reversal after an uptrend or, at times, at the top of a congestion band. We see a strong white real body in the first day. The second day opens strongly above the previous day high (it is above the top of the upper shadow). However, market closes near the low of the day and well within the prior day’s white body at the end of the day",
                    recognition: "1. Market is characterized by an uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a black body characterized by an open above the high of the previous day on the second day.\n" +
                            "4. The second black candlestick closes within and below the midpoint of the previous white body")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1018, name: "BEARISH HARAMI",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.StronglySuggested,
                    noSticks: 2,
                    patternDefinition: "Bearish Harami Pattern is a two-candlestick pattern composed of a small black real body contained within a prior relatively long white real body. “Harami” is an old Japanese word for “pregnant”. The long white candlestick is “the mother” and the small candlestick is “the baby”",
                    recognition: "1. Market is characterized by an uptrend.\n" +
                            "2. We see a long white candlestick on the first day.\n" +
                            "3. Then we see a black candlestick on the second day whose real body is completely engulfed by the real body of the first day. The shadows (high/low) of the second candlestick do not have to be contained within the first body, though it's preferable if they are.")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1019, name: "BEARISH DOWNSIDE GAP THREE METHODS",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "Two long black candlesticks with a downward gap between them appear. They are followed on the third day with a white candlestick, which manages to close the gap between the first two. This should be seen as a support for the downward trend",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see two long black candlesticks with a gap between them in the first and second days.\n" +
                            "3. Then we see a white candlestick on the third day characterized with an opening within the body of the second day.\n" +
                            "4. The body of third day candlestick is white and it fills the gap between the first two days")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1020, name: "BLACK MARUBOZU",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 1,
                    patternDefinition: "The Black Marubozu is a single candlestick pattern characterized by a long black body. It does not have any shadows on either end. It is an extremely strong bearish candlestick pattern",
                    recognition: "1. A black Marubozu is characterized by not having upper or lower shadows and by its long black body.\n" +
                            "2. It shows that the prices moved down all day long after the opening thus forming the long black body.\n" +
                            "3. Then the day closes at its lowest level that explains the absence of the lower shadow")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1021, name: "BULLISH KICKING",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Needed,
                    noSticks: 2,
                    patternDefinition: "The Bullish Kicking Pattern is a White Marubozu following a Black Marubozu. After the Black Marubozu, market gaps sharply higher on the opening and it opens with a gap above the prior session’s opening thus forming a White Marubozu",
                    recognition: "1. Market direction is not important.\n" +
                            "2. We first see a Black Marubozu  pattern.\n" +
                            "3. Then we see a White Marubozu that gaps upward on the second day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1022, name: "BULLISH MORNING DOJI STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "This is also a three-candlestick formation signaling a major bottom reversal. It is composed of a long black candlestick followed by a doji, which characteristically gaps down to form a doji star. Then we have a third white candlestick whose closing is well into the first session’s black real body. This is a meaningful bottom pattern",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a long black candlestick in the first day.\n" +
                            "3. Then we see a Doji on the second day that gaps in the direction of the previous downtrend.\n" +
                            "4. The white candlestick on the third day confirms the reversal")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1023, name: "BULLISH THREE OUTSIDE UP",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bullish Three Outside Up Pattern is simply another name for the Confirmed Bullish Engulfing Pattern. The third day is confirmation of the bullish trend reversal",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a Bullish Engulfing Pattern in the first two days.\n" +
                            "3. The third day is a white candlestick with a higher close than the second day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1024, name: "BULLISH CONCEALING BABY SWALLOW",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 4,
                    patternDefinition: "This pattern is highlighted by two consecutive Black Marubozu. They are characterized by the fact that a gapping black candlestick trades into the body of the previous day and it is seen during a downtrend. Then there is another Black Marubozu on the third day showing sale of positions since it closes at a new low. However this may give incentive to the shorts to cover their positions implying that a bullish reversal is now possible",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see two consecutive Black Marubozu in the first and second days.\n" +
                            "3. Then we see a black candlestick on the third day opening with a downward gap but trading into the body of the second day and it is characterized by a long upper shadow. \n" +
                            "4. Finally we see another Black Marubozu on the fourth day that completely engulfs the candlestick of the third day including the shadow")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1025, name: "BEARISH KICKING",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Recommended,
                    noSticks: 2,
                    patternDefinition: "A White Marubozu is followed by a sharply lower gap when it opens during the second day. The second day opening is even below the prior session’s opening (forming a Black Marubozu). Such a pattern is called a Bearish Kicking Pattern",
                    recognition: "1. Market direction is not important.\n" +
                            "2. We see a White Marubozu in the first day.\n" +
                            "3. Then we see Black Marubozu day that gaps downward on the second day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1026, name: "BEARISH EVENING DOJI STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "This is a major top reversal pattern formed by three candlesticks. The first candlestick is a long white body; the second is a doji characterized by a higher gap thus forming a doji star. The third one is a black candlestick with a closing price, which is within the first day’s white real body. It is a meaningful top pattern",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a white candlestick in the first day.\n" +
                            "3. Then we see a Doji that gaps in the direction of the previous uptrend on the second day.\n" +
                            "4. Finally the third day is a black candlestick")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1027, name: "BEARISH THREE INSIDE DOWN",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bearish Three Inside Down Pattern is another name for the Confirmed Bearish Harami Pattern. The third day confirms the bearish trend reversal",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a Bearish Harami Pattern in the first two days.\n" +
                            "3. We then see a black candlestick on the third day with a lower close than the second day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1028, name: "BEARISH THREE OUTSIDE DOWN",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bearish Three Outside Down Pattern is another name for the Confirmed Bearish Engulfing Pattern. The third day confirms the bearish trend reversal",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a Bearish Engulfing Pattern in the first two days.\n" +
                            "3. Then we see a black candlestick on the third day with a lower close than the second day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1029, name: "BEARISH UPSIDE GAP TWO CROWS",
                    patternType: PatternTypeEnum.ReversalContinuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bearish Upside Gap Two Crows Pattern is a three-candlestick pattern and it signals a top reversal. The first candlestick is a long white candlestick followed by a real body that gaps higher. Then another black real body appears, which opens above the second day’s open and closes under the second day’s close, completing the pattern",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day that signals the continuation of uptrend.\n" +
                            "3. Then we see a black body with a gap up on second day.\n" +
                            "4. The third day is characterized by another black candlestick having an opening above the first black day and also closing below the body of the first black day. The body of third day engulfs the body of the first day.\n" +
                            "5. The close of the second black candlestick is still above the close of the first long white candlestick")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1030, name: "BULLISH THREE INSIDE UP",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bullish Three Inside Up Pattern is another name for the Confirmed Bullish Harami Pattern. The third day is confirmation of the bullish trend reversal",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a Bullish Harami Pattern in the first two days.\n" +
                            "3. Then we see a white candlestick on the third day with a higher close than the second day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1031, name: "BULLISH DRAGONFLY DOJI",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 1,
                    patternDefinition: "The Bullish Dragonfly Doji Pattern is a single candlestick pattern that occurs at the bottom of a trend or during a downtrend. The Bullish Dragonfly Doji Pattern is very similar to the Bullish Hammer Pattern mentioned above. The distinction between the two is if there is a body or not. In case of Bullish Dragonfly Doji Pattern, the opening and closing prices are identical and there is no body. On the other hand the Bullish Hammer Pattern has a small real body at the upper end of the trading range",
                    recognition: "1. There is an overall downtrend in the market.\n" +
                            "2. Then we see a Doji at the upper end of the trading range.\n" +
                            "3. The doji has an extremely long lower shadow.\n" +
                            "4. However the doji does not have any upper shadow")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1032, name: "BULLISH HARAMI CROSS",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Recommended,
                    noSticks: 2,
                    patternDefinition: "Bullish Harami Cross Pattern is a doji preceded by a long black real body. The Bullish Harami Cross Pattern is a major bullish reversal pattern. It is more significant than a regular Bullish Harami Pattern",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. Then we see a long black candlestick.\n" +
                            "3. Long black candlestick is followed by a doji completely engulfed by the real body of the first day. The shadows (high/low) of the doji may not be necessarily contained within the first black body, though it's preferable if they are")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1033, name: "BULLISH HOMING PIGEON",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bullish Homing Pigeon Pattern is a small black real body contained by a prior relatively long black real body",
                    recognition: "1. Market is in downtrend.\n" +
                            "2. We see a black body in the first day.\n" +
                            "3. Then we again see a black body in the second day where the real body of this second day is completely engulfed by the real body of the first day. It is not required that the shadows (high/low) of the second candlestick are contained within the first, though it's preferable if they are")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1034, name: "BULLISH MATCHING LOW",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bullish Matching Low Pattern occurs when two black days appear with equal closes in a downtrend. The pattern is suggestive of a short-term support, and it may cause a reversal on the next day of trading",
                    recognition: "1. The market moves in downtrend.\n" +
                            "2. We then see a long black candlestick on the first day.\n" +
                            "3. Second day follows with another black candlestick whose closing price is equal or extremely close to the closing price of the first day.")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1035, name: "BULLISH MEETING LINE",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "We sometimes see that market gaps sharply lower when it opens and then closes at the same level as the prior session’s close. This is seen following a black candlestick in a downtrend. Such an occurrence is called Bullish Meeting Lines Pattern that is a pattern reflecting a stalemate between bulls and bears",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a black candlestick on the first day.\n" +
                            "3. Then we see a long white candlestick on the second day. Its body is lower than the previous trend")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1036, name: "BULLISH STICK SANDWICH",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bullish Stick Sandwich Pattern is characterized by consecutive higher opens for three days, but results in an eventual close equal to the first day's close. It may warn that prices are now finding a support price. We may then see a reversal from this support level",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a Black Closing Marubozu in the first day.\n" +
                            "3. Then we see a white candlestick, which is above the close of the first day.\n" +
                            "4. Then we again see a Black Closing Marubozu characterized with a close equal to the close of the first day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1037, name: "BULLISH THREE STAR IN THE SOUTH",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "We see three consecutive black candlesticks during a downtrend. These candlesticks show that each day is consecutively weaker in a bearish sense and possibly some buying is occurring. Daily small rallies keep the market’s lows from reaching that of the first day. These indications suggest that tide is turning in a bullish direction",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a long Black Opening Marubozu in the first day characterized by a long lower shadow just like a Hammer.\n" +
                            "3. Then we see a Black Opening Marubozu on the second day similar to the first day however smaller in body with a low above the first day’s low.\n" +
                            "4. We finally see a small Black Marubozu on the third day that lies within the second day’s trading range")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1038, name: "BULLISH TRI STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bullish Tri Star Pattern is a very rare but significant bottom reversal pattern. Three Dojis form this pattern. The middle Doji is a Doji Star",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. Then we see three consecutive Doji.\n" +
                            "3. The second day Doji gaps below the first and third")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1039, name: "BULLISH UNIQUE THREE RIVER BOTTOM",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bullish Unique Three River Bottom Pattern is an extremely rare bottom reversal pattern. Its first candlestick is an extended black candlestick then followed by a second black real body closing higher than the first candlestick’s close, and the third candlestick is a white candlestick with a very small real body. The real white body shows that the market lost the selling pressure",
                    recognition: "1. Market is characterized by a downtrend.\n" +
                            "2. We see a long black candlestick in the first day.\n" +
                            "3. Then we see a Hammer-like black candlestick on the second day.\n" +
                            "4. The lower shadow of the second day sets a new low.\n" +
                            "5. Then we see a short white candlestick, which is below the second day candlestick")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1040, name: "BULLISH BREAKAWAY",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Recommended,
                    noSticks: 5,
                    patternDefinition: "There is a downtrend but we also see that the prices bottom out and level off now. The result is a long white candlestick that however does not close the initial downward gap of the first and second days. This suggests a short-term reversal",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a long black candlestick in the first day.\n" +
                            "3. Then we see a black candlestick on the second day with a gap below the first day.\n" +
                            "4. Bearish mood continues on the third and fourth days as evidenced by lower consecutive closes")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1041, name: "BULLISH LADDER BOTTOM",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 5,
                    patternDefinition: "The shorts may have a chance to close their positions and realize their profits by the fourth day of a considerable downtrend. Then we see an upward gap on the fifth day as a result of this. If the body of the fifth day is long, or the volume of trading is high, this may also imply a bullish reversal",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see three long black candlesticks characterized by consecutively lower opens and a closing sequence just like the Bearish Three Black Crows Pattern.\n" +
                            "3. Then we see a black candlestick on the fourth day with an upper shadow.\n" +
                            "4. Finally we see a white candlestick opening above the body of the fourth day on the fifth day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1042, name: "BULLISH BELT HOLD",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 1,
                    patternDefinition: "The Bullish Belt Hold Pattern is a single candlestick pattern. It is basically a White Opening Marubozu that occurs in a downtrend. As such; it opens on its low, then we see a rally during the day against the overall trend of the market, and then the day closes near its high but not necessarily at its high. If Belt Hold lines are characterized by longer bodies, then it means that they offer more resistance to the trend they are countering",
                    recognition: "1. There must be an overall downtrend in the market.\n" +
                            "2. The day gaps down, and the market opens at its low but then prices go up during the day and they close near to the day’s high.\n" +
                            "3. We see a white body that has no lower shadow that is a White Opening Marubozu")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1043, name: "BULLISH SIDE-BY-SIDE WHITE LINES",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "A white candlestick with an upward gap over another white candlestick is followed in the next day by another similar sized white candlestick. The second and the third days have the same opening price. Such a formation is called a Bullish Side By Side White Lines Pattern",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a white candlestick in the first day.\n" +
                            "3. Then we see another white candlestick on the second day with an upward gap.\n" +
                            "4. Finally, we see a white candlestick on the third day characterized by the same body length and whose closing price is equal to the close of the second day and a new high is established")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1044, name: "BULLISH MAT HOLD",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 5,
                    patternDefinition: "The Bullish Mat Hold Pattern is known as a strong continuation pattern. In this pattern, a long white candlestick appears during an uptrend, which then is followed by three consecutive small real bodies that constitute a short downtrend. Then bull ascendancy begins on the fifth day marked with a closing price that is a new high",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. We then see an upward gap and a black candlestick on the second day.\n" +
                            "4. We see a sequence of small real bodies constituting a brief downtrend however staying within the range of the first day on the second, third, and fourth days.\n" +
                            "5. Finally we see a white candlestick, which opens with a gap and closes with a new high on the fifth day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1045, name: "BULLISH RISING THREE METHODS",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 5,
                    patternDefinition: "The Bullish Rising Three Methods Pattern is a continuation pattern representing a pause during a trend without causing a reversal. The pattern is characterized by a long white candlestick followed by three small bodies in three consecutive days. The small bodies represent some resistance to previous uptrend and they may even trace a short downtrend. These three reaction days usually have black candlesticks but the bodies remain within the high and low range of the first day's white candlestick. The pattern is completed by a white candlestick on the fifth day, opening above the close of the previous day and closing at a new high. The small downtrend between the two long white candlesticks represents a break during the uptrend. The upward trend then resumes and continues.",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see small real bodies defining a brief downtrend but staying within the range of the first day on the second, third and fourth days.\n" +
                            "4. Finally we see a long white candlestick on the fifth day opening above the close of the previous day and also closing at a new high")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1046, name: "BULLISH UPSIDE GAP THREE METHODS",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The pattern is characterized by two long white candlesticks with a gap upward between them during an uptrend. The third day is a black candlestick, which closes the gap between the first two. A support for uptrend may be forming caused by temporary profit taking",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see two long white candlesticks with a gap between them.\n" +
                            "3. Then we see the black candlestick on the third day, which opens within the body of the second day.\n" +
                            "4. The third black candlestick fills the gap between the first two days")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1047, name: "BULLISH UPSIDE TASUKI GAP",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Recommended,
                    noSticks: 3,
                    patternDefinition: "The pattern is characterized by two long white candlesticks with a gap upward between them during an uptrend. However the pattern also shows a black candlestick on the third day partially closing the gap between the first two. The black candlestick is the result of temporary profit taking. We expect the trend to continue upward following the direction of the upward gap",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see two long white candlesticks with a gap between them.\n" +
                            "3. Then we see black candlestick on the third day that opens within the body of the second day.\n" +
                            "4. The third day candlestick closes into the gap but does not fully close the gap")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1048, name: "BULLISH SEPERATING LINES",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 2,
                    patternDefinition: "It is a White Opening Marubozu following a black body. During an uptrend, after we see a black candlestick in the first day, the market gaps up sharply higher when it opens with an opening price equal to the prior session’s opening and it also closes the day at a higher level",
                    recognition: "1. Market is characterized by an uptrend.\n" +
                            "2. We see a long black candlestick in the first day.\n" +
                            "3. Then we see that the second day has the same opening price as the first day, or extremely close to it.\n" +
                            "4. The second day pattern is a White Opening Marubozu")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1049, name: "BULLISH THREE LINE STRIKE",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.DefinitelyRequired,
                    noSticks: 4,
                    patternDefinition: "This pattern is formed by three adjacent white long candlesticks followed by a black candlestick driving prices back to the point where they were at the beginning of the pattern. If there was a strong bullish trend before the pattern, then it should continue",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see three consecutive long white candlesticks with consecutively higher closes.\n" +
                            "3. Then we see a black candlestick opening at a higher level and closing below the open of the pattern’s first day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1050, name: "BEARISH DRAGONFLY DOJI",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 1,
                    patternDefinition: "A Bearish Dragonfly Doji Pattern is a single candlestick pattern, which occurs at a market top or during an uptrend. The Bearish Dragonfly Doji Pattern is very similar to the Bearish Hanging Man Pattern as mentioned above. In the case of Bearish Dragonfly Doji Pattern, the opening and closing prices are identical whereas the Bearish Hanging Man Pattern is characterized by a small real body at the upper end of the trading range",
                    recognition: "1. The market is characterized by an overall uptrend.\n" +
                            "2. Then we see a Doji at the upper end of the trading range and it is located above the trend.\n" +
                            "3. Lower shadow of the Doji is extremely long.\n" +
                            "4. There is no upper shadow")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1051, name: "BEARISH HARAMI CROSS",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Recommended,
                    noSticks: 2,
                    patternDefinition: "Bearish Harami Cross Pattern is a doji preceded by a long white real body. The Bearish Harami Cross Pattern is a major reversal pattern and is more significant than a regular Bearish Harami Pattern",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a doji completely engulfed by the real body of the first day on the second day. The shadows (high/low) of this Doji do not have to be contained within the first, though it's preferable if they are")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1052, name: "BEARISH MEETING LINES",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Market may gap up sharply as it opens but it closes unchanged from the prior session’s close during an uptrend. Such a pattern is called Bearish Meeting Lines Pattern, which is a pattern that reflects a balance between the bulls and the bears",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a long black candlestick, which has a body that is also higher than the previous trend on the second day.\n" +
                            "4. The close of both days is same or almost same.\n" +
                            "5. Both of the candlesticks are long but second day candlestick may be shorter than the first")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1053, name: "BEARISH ADVANCE BLOCK",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "It is a pattern characterized by three long white candlesticks with consecutively higher closes during an uptrend. The Bearish Advance Block Pattern is similar to the Bullish Three White Soldiers Pattern. The difference is the fact that each successive day is weaker than the one preceding it. This may suggest that the rally is losing strength and a reversal is possible",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see three adjacent white candlesticks with consecutively higher closes.\n" +
                            "3. Each day opens within the previous day's body.\n" +
                            "4. Each day’s body is significantly smaller than the body of the previous day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1054, name: "BEARISH DELIBERATION",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bearish Deliberation Pattern is a derivative of the Bearish Three White Soldiers Pattern. This pattern also shows a weakness similar to the Bearish Advance Block Pattern since it becomes weaker in a short period of time. However here the weakness occurs all at once on the third day. The small third body of the pattern shows that the rally is losing strength and a reversal is possible",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see long white bodies in the first and second days.\n" +
                            "3. The second day has a higher close than the first day.\n" +
                            "4. Then the third day opens near the second day's close.\n" +
                            "5. The third day is typically a short white candlestick, a spinning top or a star that gaps above the second day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1055, name: "BEARISH TRI STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "The Bearish Tri Star Pattern is a very rare but significant top reversal pattern. It is formed by three Dojis. The middle Doji is a Doji Star",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see three Dojis on three consecutive days.\n" +
                            "3. The second day Doji has a gap above the first and third")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1056, name: "BEARISH TWO CROWS",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "During an uptrend we see the market closing lower after an opening gap. Then we see a black day that fills the gap creating the Bearish Two Crows Pattern. It suggests the erosion of the uptrend, and warns about a possible trend reversal",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a black candlestick on the second day characterized by a gap up.\n" +
                            "4. Finally we see a black candlestick whose opening price is inside the body of the second day and which closes inside the body of the first day")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1057, name: "BEARISH BREAKAWAY",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Recommended,
                    noSticks: 5,
                    patternDefinition: "We see this pattern during an uptrend marked with a bullish surge that eventually weakens. This weakening is illustrated by a long black candlestick that is unable to close the gap into the body of the first day. These events warn us about a short-term reversal",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a white candlestick with a gap above the first day on the second day.\n" +
                            "4. However the third and fourth days continue in the direction of the second day with higher consecutive closes.\n" +
                            "5. Finally we see a long black candlestick on the fifth day with a closing price inside the gap caused by the first and second days")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1058, name: "BEARISH BELT HOLD",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 1,
                    patternDefinition: "The Bearish Belt Hold Pattern is a single candlestick pattern and it is basically a Black Opening Marubozu that occurs in an uptrend. The pattern shows that the day opens on its high, it then rallies against the trend of the market, and then closes near its low but not necessarily at its low. Longer bodies for Belt Hold are indicative of more resistance to the trend they are countering",
                    recognition: "1. There is an overall uptrend in the market.\n" +
                            "2. The day gaps up and prices open on their high but then prices move down closing near its low for the day.\n" +
                            "3. We then see a black body characterized by the absence of upper shadow, which is called a Black Opening Marubozu")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1059, name: "BEARISH FALLING THREE METHODS",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.High,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 5,
                    patternDefinition: "The Bearish Falling Three Methods Pattern is a continuation pattern, which shows a temporary break in the trend of prices without causing a reversal. The pattern is characterized by a long black candlestick during a downtrend, which is then followed by small consecutive small bodies that look like a short uptrend. It is better if all the bodies of these three days are white however they can also be of mixed color. These small bodies however must all remain within the high-low range of the first day's black candlestick. The pattern is completed by a long black candlestick, closing at a new low and showing that bears are finally taking over. The small uptrend between two long black days simply shows a market break. After this temporary break, the downward trend continues",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a long black candlestick in the first day.\n" +
                            "3. We then see three small real bodies defining a brief uptrend on the second, third, and fourth days. However these bodies stay within the range of the first day.\n" +
                            "4. Finally we see a long black candlestick on the fifth day opening near the previous day’s close and also closing below the close of the initial day to define a new low")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1060, name: "BEARISH IN NECK",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bearish In Neck Pattern is characterized by a white candlestick that has a closing price slightly above the previous black candlestick’s low during a downtrend. If the white candlestick’s low is broken down, the downtrend continues",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a long black candlestick in the first day.\n" +
                            "3. Then we see a white candlestick on the second day with an opening price that is below the low of the previous day and whose closing price is barely above or equal to the closing price of the previous day")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1061, name: "BEARISH ON NECK",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bearish On Neck Pattern is a black candlestick followed by a small white candlestick, which is characterized by a closing price near the low of the black candlestick during a downtrend. If the low of white candlestick is broken down, market goes further down",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a long black candlestick in the first day.\n" +
                            "3. Then we see a white candlestick on the second day, which opens below the low of the previous day. This day does not need to be a long day or it might resemble the Bullish Meeting Line Pattern.\n" +
                            "4. The closing price of the second day is either the low price of the first day or almost same")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1062, name: "BEARISH DOWNSIDE TASUKI GAP",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Recommended,
                    noSticks: 3,
                    patternDefinition: "The pattern involves two long black candlesticks with a downward gap between them during a downtrend. Pattern is completed by a third day white candlestick partially closing the gap between the first two. The white candlestick may be the result of investors temporarily taking advantage of the low buying price. However we expect the trend to continue in the downward direction",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see two long black candlesticks with a gap between them in the first and second days.\n" +
                            "3. Then we see a white candlestick characterized with an opening within the body of the second day.\n" +
                            "4. The body of third day candlestick closes into the gap but does not fully close the gap")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1063, name: "BEARISH SIDE BY SIDE WHITE LINES",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Recommended,
                    noSticks: 3,
                    patternDefinition: "This pattern is formed by a black candlestick that is followed by two white candlesticks during a downtrend. Its particular feature is to display days that are gapped below the first day. This suggests that the shorts are covering their positions, and no reversal is expected soon. The downtrend is likely to remain intact for the near future",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a black candlestick in the first day.\n" +
                            "3. Then we see a white candlestick gapping down on second day.\n" +
                            "4. Finally we see a white candlestick, which is almost the same size and is also marked with an opening price at about the same price as the opening price of the second day").save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1064, name: "BEARISH SEPARATING LINES",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 2,
                    patternDefinition: "This pattern is characterized by a white candlestick in a downtrend, which is followed by a sharply lower gap when market opens next day and shows an opening price equal to the prior day’s opening price and also a lower closing price, which is a Black Opening Marubozu",
                    recognition: "1. The market is characterized by downtrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a black body, which has the same opening price as the first day, or extremely close to it.\n" +
                            "4. The second day candlestick is a Black Opening Marubozu")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1065, name: "BEARISH THRUSTING",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.Required,
                    noSticks: 2,
                    patternDefinition: "Bearish Thrusting Pattern is characterized by a white candlestick that closes in the prior black real body, however still under the middle of the prior session’s real body. Bearish Thrusting Pattern is a bearish signal in a downtrend",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a black candlestick in first day.\n" +
                            "3. Then we see a white candlestick, which opens considerably lower than the low of the first day.\n" +
                            "4. The second day candlestick closes well into the body of first black candlestick, but not above the midpoint")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1066, name: "BEARISH THREE LINE STRIKE",
                    patternType: PatternTypeEnum.Continuation,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Low,
                    confirmation: ConfirmationTypeEnum.DefinitelyRequired,
                    noSticks: 4,
                    patternDefinition: "This pattern is characterized by three adjacent black and long candlesticks terminated by a white candlestick driving prices back to the point where they were at the beginning of the pattern. If there was a strong bearish trend before the pattern, then it should continue",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see three long black candlesticks with consecutively lower closes.\n" +
                            "3. Then we see a white candlestick on the fourth day opening at a lower level and closing above the open of the pattern’s first day")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1067, name: "BEARISH DOJI STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "A short candlestick, a spinning top, a highwave or a doji following a white candlestick with an upside gap during an uptrend, is the Bearish (Doji) Star Pattern",
                    recognition: "1. Market is characterized by uptrend.\n" +
                            "2. We see a long white candlestick in the first day.\n" +
                            "3. Then we see a short candlestick, a spinning top, a highwave or a doji that gaps in the direction of the previous trend on the second day.\n" +
                            "4. The shadows of the short candlestick, spinning top, highwave or doji are not long")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1068, name: "BULLISH DOJI STAR",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "Bullish (Doji) Star Pattern is a short candlestick, a spinning top, a highwave or a doji, which gaps from a long black candlestick during a downtrend",
                    recognition: "1. Market is characterized by downtrend.\n" +
                            "2. We see a long black candlestick on the first day.\n" +
                            "3. Then we see a short candlestick, a spinning top, a highwave or a doji, that gaps in the direction of the previous trend on second day.\n" +
                            "4. The shadows of this short candlestick, spinning top, highwave or doji are not long")
                    .save(flush: true, insert: true, failOnError: true)


            new Pattern(code: 1069, name: "BEARISH TWEEZER TOP",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "The price action has trended upward then 2 consecutive days of equal highs",
                    recognition: "1st day consists of a long body candle.\n" +
                            "2nd day consists of a short body candle or a doji that has a high equal to the prior day's high.\n" +
                            "The color of each candle body is not considered in the matching of this pattern.")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1070, name: "BULLISH TWEEZER BOTTOM",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bullish,
                    priorTrend: RelevanceTypeEnum.Bearish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 2,
                    patternDefinition: "The price action has trended downward then 2 consecutive days of equal lows",
                    recognition: "1st day consists of a long body candle.\n" +
                            "2nd day consists of a short body candle or a doji that has a low equal to the prior day's low.\n" +
                            "The color of each candle body is not considered in the matching of this pattern.")
                    .save(flush: true, insert: true, failOnError: true)

            new Pattern(code: 1071, name: "BEARISH IDENTICAL THREE CROWS",
                    patternType: PatternTypeEnum.Reversal,
                    relevanceType: RelevanceTypeEnum.Bearish,
                    priorTrend: RelevanceTypeEnum.Bullish,
                    reliability: ReliabilityTypeEnum.Medium,
                    confirmation: ConfirmationTypeEnum.Suggested,
                    noSticks: 3,
                    patternDefinition: "Same as three black crows pattern, where each day opens at the previous day's close",
                    recognition: "Three consecutive long black days with lower closes each day.\n" +
                            "Each day opens at the previous day's close")
                    .save(flush: true, insert: true, failOnError: true)

        }

    }
}
