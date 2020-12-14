package day14;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "src" + separator +
                "main" + separator +
                "java" + separator +
                "day14" + separator +
                "people.txt";
        File file = new File(path);
        System.out.println(parseFileToStringList(file));
    }

    public static List<String> parseFileToStringList(File file) {
        List<String> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] text = line.split(" ");
                int age = Integer.parseInt(text[1]);
                try {
                    if (age < 0)
                        throw new FileException("Некорректный входной файл");
                } catch (FileException e) {
                    System.out.println(e.getMessage());
                    return new ArrayList<>();
                }
                data.add(text[0] + " " + age);
            }
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
        return data;
    }
}
