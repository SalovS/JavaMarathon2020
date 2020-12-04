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

class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
