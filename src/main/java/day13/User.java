package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String name) {
        this.username = name;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        for (User nextUser : subscriptions) {
            if (nextUser == user)
                return true;
        }
        return false;
    }

    public String toString() {
        return username;
    }

    public boolean isFriend(User user) {
        for (User nextUser : subscriptions) {
            if (nextUser == user){
                for(User posibleFriend: user.getSubscriptions()){
                    if (posibleFriend == this)
                        return true;
                }
            }
        }
        return false;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }
}
