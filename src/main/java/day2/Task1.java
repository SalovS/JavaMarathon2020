package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFloors = scanner.nextInt();
        scanner.close();
        if (numberOfFloors < 1) {
            System.out.println("Ошибка ввода");
        } else if (numberOfFloors < 5) {
            System.out.println("Малоэтажный дом");
        } else if (numberOfFloors < 9) {
            System.out.println("Среднеэтажный дом");
        } else {
            System.out.println("Многоэтажный дом");
        }
    }
}
