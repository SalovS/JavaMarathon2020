package day16;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "src" + separator +
                "main" + separator +
                "java" + separator +
                "day16" + separator +
                "text.txt";
        File file = new File(path);
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            int count = 0;
            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            }
            scanner.close();
            double answer = sum / count;
            String num = String.format(Locale.ENGLISH,"%.15f", answer);
            System.out.printf("%s --> %.3f", num, answer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

