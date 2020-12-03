package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10000];
        int sum = 0;
        int maxSum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }
        for (int i = 4; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                sum += arr[i - j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                index = i - 4;
            }
            sum = 0;
        }
        System.out.println(maxSum);
        System.out.println(index);
    }
}
