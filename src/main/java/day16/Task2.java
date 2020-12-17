package day16;

import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String separator = File.separator;
        String path = "src" + separator +
                "file1.txt";
        File file = new File(path);
        createFile(file);
        printResult(file);
    }

    public static void createFile(File file) {
        Random random = new Random();
        try {
            PrintWriter printWriterf1 = new PrintWriter(file);
            PrintWriter printWriterf2 = new PrintWriter("src/file2.txt");
            double sum = 0;
            for (int i = 1; i < 1001; i++) {
                int number = random.nextInt(101);
                printWriterf1.printf("%d ", number);
                sum += number;
                if (i % 20 == 0) {
                    printWriterf2.printf("%f ", sum / 20);
                    sum = 0;
                }
            }
            printWriterf1.close();
            printWriterf2.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            String line = scanner.nextLine();
            String[] arr = line.split(" ");
            for (String n : arr) {
                double number = Double.parseDouble(n);
                sum += number;
            }
            scanner.close();
            System.out.println((int) sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
