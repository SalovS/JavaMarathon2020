package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player.info();
        Player player1 = new Player(random.nextInt(11) + 90);
        player1.getStamina();
        Player.info();
        Player player2 = new Player(random.nextInt(11) + 90);
        player2.getStamina();
        Player.info();
        Player player3 = new Player(random.nextInt(11) + 90);
        player3.getStamina();
        Player.info();
        Player player4 = new Player(random.nextInt(11) + 90);
        player4.getStamina();
        Player.info();
        Player player5 = new Player(random.nextInt(11) + 90);
        player5.getStamina();
        Player.info();
        Player player6 = new Player(random.nextInt(11) + 90);
        player6.getStamina();
        Player.info();
        Player player7 = new Player(random.nextInt(11) + 90);
        player7.getStamina();
        Player.info();
        Player player8 = new Player(random.nextInt(11) + 90);
        System.out.printf("игроков на поле %d\n",Player.getCountPlayers());
        Player.info();
        for(int i = 0; i < 101; i++){
            player1.run();
        }
        System.out.printf("игроков на поле %d\n",Player.getCountPlayers());
        Player.info();
    }
}
