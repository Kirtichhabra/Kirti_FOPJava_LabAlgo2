package transaction;

import java.util.Scanner;

public class PayMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the transaction array:");
        int n = scanner.nextInt();

        System.out.println("Enter the values of the array:");
        int[] transactions = new int[n];
        for (int i = 0; i < n; i++) {
            transactions[i] = scanner.nextInt();
        }

        System.out.println("Enter the total number of targets that need to be achieved:");
        int numTargets = scanner.nextInt();

        for (int t = 0; t < numTargets; t++) {
            System.out.println("Enter the value of target:");
            int target = scanner.nextInt();

            int sum = 0;
            int transactionsNeeded = 0;
            boolean targetAchieved = false;

            for (int i = 0; i < n; i++) {
                sum += transactions[i];
                transactionsNeeded++;

                if (sum >= target) {
                    targetAchieved = true;
                    break;
                }
            }

            if (targetAchieved) {
                System.out.println("Target achieved after " + transactionsNeeded + " transactions");
            } else {
                System.out.println("Given target is not achieved");
            }
        }
    }
}



