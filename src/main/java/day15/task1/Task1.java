package day15.task1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String pathRead = "src" + separator +
                "main" + separator +
                "resources" + separator +
                "shoes.csv";
        String pathWrite = "src" + separator +
                "main" + separator +
                "resources" + separator +
                "missing_shoes.txt";
        File fileRead = new File(pathRead);
        File fileWrite = new File(pathWrite);
        convertFile(fileRead, fileWrite);
    }

    public static void convertFile(File fileRead, File fileWrite){
        List<String> data = new ArrayList<>();
        try {
            if(!fileRead.exists())
                throw new FileNotFoundException("Файл не найден");
            Scanner scanner = new Scanner(fileRead);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] text = line.split(";");
                data.add(text[0] + ", " + text[1] + ", " + text[2]);
            }
            scanner.close();
            PrintWriter printWriter = new PrintWriter(fileWrite);
            if(!fileWrite.exists())
                throw new FileNotFoundException("Не удалось создать файл");
            for (int i = 0; i < data.size(); i++) {
                printWriter.println(data.get(i));
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
