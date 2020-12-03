package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[][] = new int[12][8];
        int sum = 0;
        int maxSum = 0;
        int line = 0;
        for (int m = 0; m < 12; m++) {
            for (int n = 0; n < 8; n++) {
                arr[m][n] = random.nextInt(50);
                sum += arr[m][n];
            }
            if (sum > maxSum) {
                maxSum = sum;
                line = m;
            }
            sum = 0;
        }
        System.out.println("Индекс строки : " + line);
        System.out.println("Cумма чисел : " + maxSum);
    }
}
