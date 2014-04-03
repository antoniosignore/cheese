package com.netnumeri.server.finance.indicator.candles

import com.netnumeri.server.finance.beans.TimeSeries;

import com.netnumeri.server.finance.indicator.utils.CandlestickUtils;

/**
 * Bullish Morning Star
 */
public class BearishDojiStar {


    public static double calculate(TimeSeries qh, Date date, int periodLength) {

        // Estrela da noite (Bearish Evening Star)

        CandlestickUtils candle = new CandlestickUtils(qh);

        double result = 0;

        double CorpoCandle1 = candle.getCandleSize(0, 1, 0);
        double SombraSup1 = candle.getCandleSize(0, 2, 1);
        double SombraInf1 = candle.getCandleSize(0, 2, 2);

        double CorpoCandle2 = candle.getCandleSize(1, 1, 0);
        double SombraSup2 = candle.getCandleSize(1, 2, 1);
        double SombraInf2 = candle.getCandleSize(1, 2, 2);

        double TendenciaUltimosCandles = candle.getTendencia(2, 3);

        boolean SegundoCandleAlta = (candle.Open(0) > candle.Close(0)
                && CorpoCandle2 > CorpoCandle1
                && CorpoCandle2 > SombraSup2 + SombraInf2);
        boolean CandleDoji = candle.Doji(0);
        boolean PrimeiroCandleGAP = (CandleDoji
                && (candle.Open(1) > candle.Close(1)
                && candle.Open(0) > candle.Open(1) || candle.Open(1) < candle
                .Close(1)
                && candle.Open(0) > candle.Close(1))
                && candle.Low(0) > candle.Low(1));

        boolean DojiEstrela = (SegundoCandleAlta && PrimeiroCandleGAP
                && TendenciaUltimosCandles == 1);

        if (DojiEstrela) {
            result = -7;
        }

        return result;
    }
}
