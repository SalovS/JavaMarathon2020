package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[100];
        int sum = 0;
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(10000);
        }
        for (int i = 0; i < 97; i++) {
            sum = arr[i] + arr[i + 1] + arr[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println(maxSum);
        System.out.println(index);
    }
}
