import java.util.Scanner;

public class LaddusDistribution {

    public static int maxLaddus(int[] weights) {
        int n = weights.length;
        int left = 0, right = n - 1;
        int riya = 0, rohan = 0;
        int maxLaddus = 0;

        while (left <= right) {
            if (riya < rohan) {
                riya += weights[left];
                left++;
            } else {
                rohan += weights[right];
                right--;
            }

            if (riya == rohan) {
                maxLaddus = Math.max(maxLaddus, left + (n - 1 - right));
            }
        }

        return maxLaddus;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        int result = maxLaddus(weights);
        System.out.println(result);
    }
}
