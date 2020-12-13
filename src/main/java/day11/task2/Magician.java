package day11.task2;

public class Magician extends Hero implements MagicAttack {
    private double magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 80;
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
