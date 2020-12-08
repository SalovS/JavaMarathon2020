package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Human human = new Human("andrey");
        human.printInfo();
        Student student = new Student("Slava",
                "programming");
        Teacher teacher = new Teacher("Neil Alishev", "programming");
        student.printInfo();
        teacher.printInfo();
    }
}
