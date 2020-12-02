package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x;
        Double y;
        while (true) {
            x = scanner.nextDouble();
            y = scanner.nextDouble();
            if (y == 0) {
                scanner.close();
                break;
            }
            System.out.println(x / y);
        }
    }
}
