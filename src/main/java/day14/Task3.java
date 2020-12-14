package day14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "src" + separator +
                "main" + separator +
                "java" + separator +
                "day14" + separator +
                "people.txt";
        File file = new File(path);
        System.out.println(Arrays.toString(parseFileToObjList(file).toArray()));
    }
    public static List<Person> parseFileToObjList(File file) {
        List<Person> data = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] text = line.split(" ");
                int age = Integer.parseInt(text[1]);
                if (age < 0)
                    try{
                        throw new IOException();
                    }catch (Exception e){
                        System.out.println("Некорректный входной файл");
                        return new ArrayList<>();
                    }
                data.add(new Person(text[0] ,age));
            }
        } catch (Exception e) {
            System.out.println("Файл не найден");
        }
        return data;
    }
}
