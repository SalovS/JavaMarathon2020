package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getMessage() {
        return text;
    }

    public String toString() {
        return "FROM: " + sender +
                "\nTO: " + receiver +
                "\nON: " + date.toString() +
                "\n" + text + "\n";
    }
}
