package transaction;
import java.util.HashMap;
import java.util.Scanner;

public class CurrencyPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of currency denominations:");
        int n = scanner.nextInt();

        System.out.println("Enter the currency denominations value:");
        int[] denominations = new int[n];
        for (int i = 0; i < n; i++) {
            denominations[i] = scanner.nextInt();
        }

        System.out.println("Enter the amount you want to pay:");
        int amount = scanner.nextInt();

        HashMap<Integer, Integer> paymentApproach = new HashMap<>();

        for (int i = n - 1; i >= 0; i--) {
            if (amount == 0) {
                break;
            }

            int numNotes = amount / denominations[i];
            if (numNotes > 0) {
                paymentApproach.put(denominations[i], numNotes);
                amount %= denominations[i];
            }
        }

        System.out.println("Your payment approach in order to give the min number of notes will be:");
        for (int denomination : paymentApproach.keySet()) {
            int numNotes = paymentApproach.get(denomination);
            System.out.println(denomination + ":" + numNotes);
        }
    }
}



