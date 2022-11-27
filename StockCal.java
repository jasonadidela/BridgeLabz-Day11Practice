import java.util.ArrayList;
import java.util.Scanner;

public class StockCal {
    static ArrayList<StockDetails> list = new ArrayList<>();
    public static void addStock() {
        Scanner s = new Scanner(System.in);
        StockDetails stockDetails = new StockDetails();

        System.out.println("Enter the Stock name:");
        String stockName = s.next();
        stockDetails.setStockName(stockName);

        System.out.println("Enter the Number of Shares:");
        int numShares= s.nextInt();
        stockDetails.setNumShares(numShares);

        System.out.println("Enter the Price of Share:");
        int sharePrice = s.nextInt();
        stockDetails.setSharesPrice(sharePrice);

        int totalValue = numShares * sharePrice;
        stockDetails.setTotalValue(totalValue);
        list.add(stockDetails);
    }
    public static void printShare() {
        for (StockDetails stockDetails : list) {
            System.out.println("**********************************************"+
                    "\nStock Name:\s"+ stockDetails.getStockName()+
                    "\nNumber of Shares:\s"+stockDetails.getNumShares()+
                    "\nPrice of Share:\s"+stockDetails.getSharesPrice()+
                    "\nTotal value:\s"+stockDetails.getTotalValue()+
                    "\n**********************************************");
        }
    }
}