package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= 350; i += 2) {
            if(i > 30 && i < 300)
                continue;
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
