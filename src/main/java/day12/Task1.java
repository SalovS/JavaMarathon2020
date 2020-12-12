package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Lada");
        cars.add("Tesla");
        cars.add("Mercedes");
        cars.add(cars.size() / 2, "UAZ");
        cars.remove(0);
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
