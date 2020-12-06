package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plain2 = new Airplane("Cessna", 1980, 8, 1293);
        Airplane plain1 = new Airplane("boeing", 1990, 20000, 60000);
        Airplane.compareAirplanes(plain1, plain2);
        Airplane.compareAirplanes(plain2, plain1);
        Airplane.compareAirplanes(plain2, plain2);
    }
}