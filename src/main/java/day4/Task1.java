package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = scanner.nextInt();
        scanner.close();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(11);
        }
        int numbersMoreThan8 = 0;
        int numbersEqualTo1 = 0;
        int numberOfEvenNumbers = 0;
        int numberOfOddNumbers = 0;
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 8)
                numbersMoreThan8++;
            if (arr[i] == 1)
                numbersEqualTo1++;
            if (arr[i] % 2 == 0)
                numberOfEvenNumbers++;
            else
                numberOfOddNumbers++;
            sum += arr[i];
        }
        System.out.printf("Введено число %d. Сгенерирован следующий массив:\n", n);
        System.out.println(Arrays.toString(arr));
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + arr.length);
        System.out.println("Количество чисел больше 8: " + numbersMoreThan8);
        System.out.println("Количество чисел равных 1: " + numbersEqualTo1);
        System.out.println("Количество четных чисел: " + numberOfEvenNumbers);
        System.out.println("Количество нечетных чисел: " + numberOfOddNumbers);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
