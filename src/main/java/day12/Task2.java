package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i <= 350; i += 2) {
            numbers.add(i);
            if(i == 30)
                i = 298;
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
