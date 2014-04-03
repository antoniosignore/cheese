package com.netnumeri.server.utils;


import com.netnumeri.server.finance.beans.FinConstants
import com.netnumeri.server.finance.finpojo.asset.Stock
import com.netnumeri.server.finance.utils.DateUtils

public class StockUtilsTest {

    public static Stock getStock(String filePath, String ticker) throws Exception {

        Stock instrument = new Stock(ticker, "myass");
        Stack lines = new Stack();
        StringBuffer fileData = new StringBuffer(1000);
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            inputLine = inputLine.replaceAll("\"", "");
            if (inputLine.startsWith("Date")) continue;
            lines.push(inputLine);
        }
        reader.close();

        String date = null;
        double open = 0;
        double high = 0;
        double low = 0;
        double close = 0;
        double volume = 0;
        int i = 0;

        StringBuffer sb = new StringBuffer();
        while (!lines.isEmpty()) {
            String s3 = (String) lines.pop();
            sb.append(s3 + "\n");

            StringTokenizer stringtokenizer = new StringTokenizer(s3, ",");
            String token = stringtokenizer.nextToken();
            date = token;
            double d = 0;
            double d1 = 0;
            for (int j = 0; j < 4; j++) {
                token = stringtokenizer.nextToken();
                double dumm = Double.parseDouble(token);
                switch (j) {
                    case 0:
                        open = dumm;
                        break;
                    case 1:
                        high = dumm;
                        break;
                    case 2:
                        low = dumm;
                        break;
                    case 3:
                        close = dumm;
                        break;
                }
                d += dumm;
            }
            d1 = d / 4;
            double vol = Double.parseDouble(stringtokenizer.nextToken());
            volume = vol;
            instrument.addDaily(i++, DateUtils.toYahoo(date), high, low, open, close, (int) volume, 0, FinConstants.VALID);
        }
        return instrument;
    }


}
