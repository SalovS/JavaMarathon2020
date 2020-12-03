package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int arr[] = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextInt(10000);
        }
        int max = arr[0];
        int min = arr[0];
        int numberOfelementsEnding0 = 0;
        long sumTheNumberOfElementsEndingIn0 = 0;
        for (int number : arr) {
            if (number > max)
                max = number;
            if (number < min)
                min = number;
            if (number % 10 == 0) {
                numberOfelementsEnding0++;
                sumTheNumberOfElementsEndingIn0 += number;
            }
        }
        System.out.println("Наибольший элемент массива : " + max);
        System.out.println("Наименьший элемент массива : " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0 : " + numberOfelementsEnding0);
        System.out.println("Сумму элементов массива, оканчивающихся на 0 : " + sumTheNumberOfElementsEndingIn0);
    }
}
