package stacksandqueues.stockspan;

public class Main {
    public static void main(String[] args) {
        StockSpan stock = new StockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = stock.calculateSpan(prices);

        // Output the span values
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

