package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2018);
        car.setColor("black");
        car.setModel("BMW X7");
        System.out.printf("Model : %s\nCase color : %s\nYear of maufacture : %d\n",
                car.getModel(), car.getColor(), car.getYear());
    }
}