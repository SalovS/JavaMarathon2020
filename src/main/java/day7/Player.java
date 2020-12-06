package day7;

public class Player {
    private int stamina;
    private int MAX_STAMINA = 100;
    private int MIN_STAMINA = 0;
    boolean isEnergetic = true;
    private static final int MAX_PLAYERS = 6;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < MAX_PLAYERS)
            countPlayers++;
    }

    public void run() {
        if (stamina > MIN_STAMINA)
            stamina--;
        if (stamina <= MIN_STAMINA){
            if (isEnergetic) {
                countPlayers--;
                isEnergetic = false;
            }
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static void info() {
        if (countPlayers < MAX_PLAYERS)
            System.out.printf("Команды неполные. На поле еще есть %d %s\n",
                    MAX_PLAYERS - countPlayers, addGrammar(MAX_PLAYERS - countPlayers));
        else
            System.out.println("На поле нет свободных мест");
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
    private static String addGrammar(int count){
        switch (count){
            case 1: return "свободное место";
            case 2:
            case 3:
            case 4: return "свободных места";
            default: return "свободных мест";
        }
    }
}
