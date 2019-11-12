public class course9_2 {
    public static void main(String[] args) {
        Stock newStock = new Stock(34.5 , 34.35 , "ORCL" , "Oracle Corporation");

        System.out.print("股票股价涨跌: ");
        System.out.printf("%.4f",newStock.getChangePercent());
        System.out.println("%");
    }
}


class Stock {
    double previousClosingPrice;
    double currentPrice;
    String symbol;
    String name;

    Stock() {
    }

    Stock(double newPreviousClosingPrice , double newCurrentPrice , String newSymbol , String newName) {
        previousClosingPrice = newPreviousClosingPrice;
        currentPrice = newCurrentPrice;
        symbol = newSymbol;
        name = newName;
    }

    double getChangePercent() {
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }
}
