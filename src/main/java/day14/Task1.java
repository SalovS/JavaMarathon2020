package day14;

import java.io.File;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "src" + separator +
                "main" + separator +
                "java" + separator +
                "day14" + separator +
                "text.txt";
        File file = new File(path);
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            int count = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
                count++;
            }
            if (count == 10)
                System.out.println(sum);
            else
                System.out.println("Некорректный входной файл");
            scanner.close();
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }

    }
}
