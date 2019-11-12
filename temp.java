//import java.util.Scanner;
//class Stock
//{
//    String symbol;
//    String name;
//    double previousClosingPrice;
//    double currentPrice;
//    public Stock(String s,String n)
//    {
//        symbol=s;name=n;
//    }
//    public double changePercent()
//    {
//        return -(previousClosingPrice-currentPrice)/previousClosingPrice;
//    }
//}
//
//public class temp {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String symbol1=input.next();
//        String name1=input.next();
//        Stock stock = new Stock(symbol1, name1);
//
//        stock.previousClosingPrice = input.nextDouble();
//
//        // Input current price
//        stock.currentPrice = input.nextDouble();
//
//        // Display stock info
//        System.out.println(stock.name+"price changed: " + stock.changePercent() * 100 + "%");
//        input.close();
//    }
//}

public class temp {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        System.out.println(date.toString());
    }
}
