import java.util.Scanner;

class Stocks {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of days");
        n = in.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter the prices on different days");
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextInt();
        }

        int maxprofit = 0;
        for (int i = 1; i < n; i++) {
            for (int k = i; k >= 0; k--) {
                int profit = prices[i] - prices[k];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }

        System.out.println("Maximum Profit: " + maxprofit);
    }
}
