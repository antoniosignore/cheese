
<g:if test="${stockInstance.snapshot}">
    <table class="table table-striped table-bordered table-condensed table-hover">
        <tr><td>Last Price</td><td>${stockInstance.snapshot.lastPrice}</td></tr>
        <tr><td>Symbol</td><td>${stockInstance.snapshot.symbol}</td></tr>
        <tr><td>Company Name</td><td>${stockInstance.snapshot.companyName}</td></tr>
        <tr><td>Last Price</td><td>${stockInstance.snapshot.lastPrice}</td></tr>
        <tr><td>Last Trade Date</td><td>${stockInstance.snapshot.lastTradeDate}</td></tr>
        <tr><td>Last Trade Time</td><td>${stockInstance.snapshot.lastTradeTime}</td></tr>
        <tr><td>Change</td><td>${stockInstance.snapshot.change}</td></tr>
        <tr><td>Percent Change</td><td>${stockInstance.snapshot.percentChange}</td></tr>
        <tr><td>Volume</td><td>${stockInstance.snapshot.volume}</td></tr>
        <tr><td>Average Daily Vol</td><td>${stockInstance.snapshot.averageDailyVol}</td></tr>
        <tr><td>Bid</td><td>${stockInstance.snapshot.bid}</td></tr>
        <tr><td>Ask</td><td>${stockInstance.snapshot.ask}</td></tr>
        <tr><td>Previous Close</td><td>${stockInstance.snapshot.previousClose}</td></tr>
        <tr><td>Todays Open</td><td>${stockInstance.snapshot.todaysOpen}</td></tr>
        <tr><td>Days Range</td><td>${stockInstance.snapshot.daysRange}</td></tr>
        <tr><td>Year Week Range</td><td>${stockInstance.snapshot.yearWeekRange}</td></tr>
        <tr><td>Earnings x Share</td><td>${stockInstance.snapshot.earningsperShare}</td></tr>
        <tr><td>PE Ratio</td><td>${stockInstance.snapshot.PERatio}</td></tr>
        <tr><td>Dividend Pay Date</td><td>${stockInstance.snapshot.dividendPayDate}</td></tr>
        <tr><td>Dividend x Share</td><td>${stockInstance.snapshot.dividendperShare}</td></tr>
        <tr><td>Dividend Yield</td><td>${stockInstance.snapshot.dividendYield}</td></tr>
        <tr><td>Market Capitalization</td><td>${stockInstance.snapshot.marketCapitalization}</td></tr>
        <tr><td>Stock Exchange</td><td>${stockInstance.snapshot.stockExchange}</td></tr>
    </table>
</g:if>
