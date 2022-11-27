import java.util.Scanner;

public class StockReport {
    public static void main(String[] args) {
        do {
            System.out.println("Enter:1-Display Stock Details:\n"+
                    "Enter:2-To Add Stock Details:");
            Scanner value = new Scanner(System.in);
            int input = value.nextInt();
            switch (input) {
                case 1 -> StockCal.printShare();
                case 2 -> StockCal.addStock();
                default ->
                    System.out.println("Invalid Entry Please Try again");
            }
        } while (true);
    }
}