package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("user1");
        User u2 = new User("user2");
        User u3 = new User("user3");

        u1.sendMessage(u2, "text 1");
        u1.sendMessage(u2, "text 2");

        u2.sendMessage(u1, "text 3");
        u2.sendMessage(u1, "text 4");
        u2.sendMessage(u1, "text 5");

        u3.sendMessage(u1, "text 6");
        u3.sendMessage(u1, "text 7");
        u3.sendMessage(u1, "text 8");

        u1.sendMessage(u3, "text 9");
        u1.sendMessage(u3, "text 10");
        u1.sendMessage(u3, "text 11");

        u3.sendMessage(u1, "text 12");

        MessageDatabase.showDialog(u1, u3);
    }
}
