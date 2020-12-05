package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.",
                name.toUpperCase(), student.getName().toUpperCase(), subject.toUpperCase(), getRating().toUpperCase());
    }

    private String getRating() {
        String rating[] = {"неудовлетворительно", "удовлетворительно", "хорошо", "отлично"};
        return rating[random.nextInt(4)];
    }

}
