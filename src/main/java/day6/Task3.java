package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Serge Burlakov", "programming");
        Student student1 = new Student("Salov");
        teacher.evaluate(student1);
    }
}
