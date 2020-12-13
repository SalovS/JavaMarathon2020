package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {
    private double healHimself = 50;
    private double healTeammate = 30;
    private double magicAtt = 15;

    public Shaman() {
        physAtt = 10;
        physDef = 20;
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

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = (magicAtt * (MAX_PERCENT - hero.magicDef)) / MAX_PERCENT;
        if (hero.health - attackScore < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else
            hero.health -= attackScore;
    }
}
