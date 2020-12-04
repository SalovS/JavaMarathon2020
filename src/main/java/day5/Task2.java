package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2019, "color", "Honda Africa Twin");
        System.out.printf("Model : %s\nCase color : %s\nYear of maufacture : %d\n",
                motorbike.getModel(), motorbike.getColor(), motorbike.getYear());
    }
}
