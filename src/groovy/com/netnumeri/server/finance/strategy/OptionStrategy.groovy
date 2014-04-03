package com.netnumeri.server.finance.strategy

import com.netnumeri.server.finance.finpojo.Forecast
import com.netnumeri.server.finance.finpojo.Bet
import com.netnumeri.server.finance.finpojo.asset.Stock

public interface OptionStrategy {
    public List<Bet> analyze(Forecast forecast, Stock stock);

    public String getImage();

    public boolean isUnlimited();

    public Double maximumLoss();

    public boolean isForRetail();

    public Double breakevenPoint();

    public Double profit();

    public ForecastType getType()
}
