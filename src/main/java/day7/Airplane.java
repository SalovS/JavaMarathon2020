package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %d, вес: %d, количество топлива в баке: %d\n",
                producer, year, length, weight, fuel);
    }

    public static void compareAirplanes(Airplane plain1, Airplane plain2) {
        if (plain1.length > plain2.length)
            System.out.println("Первый самолет длиннее");
        else if (plain1.length == plain2.length)
            System.out.println("Длины самолетов равны");
        else
            System.out.println("Второй самолет длиннее");
    }

    public int getFuel() {
        return fuel;
    }
}
