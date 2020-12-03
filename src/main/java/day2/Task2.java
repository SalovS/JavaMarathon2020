package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        if (a >= b) {
            System.out.println("Некорректный ввод");
            return;
        }
        int i = (a > 0) ? a + 5 - (a % 5) : a - (a % 5);
        for (; i < b; i += 5) {
            if (i % 10 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
