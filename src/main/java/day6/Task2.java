package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Cessna", 1980, 8, 1293);
        plane.fillUp(180);
        plane.fillUp(200);
        plane.info();
    }
}
