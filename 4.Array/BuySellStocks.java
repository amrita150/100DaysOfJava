import java.util.Scanner;

public class BuySellStocks {
    
    public static int BuyAndSell(int data[]) {
        int buyStock = data[0];
        int sellStock;
        int profit = 0;

        for (int i = 1; i < data.length; i++) {
            sellStock = data[i];
            int currentProfit = sellStock - buyStock;

            if (currentProfit > profit) {
                profit = currentProfit;
            }

            if (buyStock > sellStock) {
                buyStock = sellStock;
            }
        }
        
        return profit;
    }
    
    public static void main(String args[]) {
        System.out.println("Enter data of stocks: ");
        int arr[] = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = BuyAndSell(arr);
        System.out.println("The maximum profit you can get from this data is: " + result);

        sc.close();
    }
}
