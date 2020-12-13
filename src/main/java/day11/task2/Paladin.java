package day11.task2;

public class Paladin extends Hero implements Healer {
    private double healHimself = 25;
    private double healTeammate = 10;

    public Paladin() {
        physAtt = 15;
        physDef = 50;
        magicDef = 20;
    }

    @Override
    public void healHimself() {
        if (health + healHimself > MAX_HEALTH)
            health = MAX_HEALTH;
        else
            health += healHimself;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healTeammate > MAX_HEALTH)
            hero.health = MAX_HEALTH;
        else
            hero.health += healTeammate;
    }
}
