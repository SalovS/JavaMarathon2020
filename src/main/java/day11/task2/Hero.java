package day11.task2;

public abstract class Hero implements PhysAttack {
    protected static final double MAX_HEALTH = 100;
    protected static final double MAX_PERCENT = 100;
    protected static final double MIN_HEALTH = 0;
    protected double health;
    protected double physAtt;
    protected double physDef;
    protected double magicDef;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physAttack(Hero hero) {
        double attackScore = (physAtt * (MAX_PERCENT - hero.physDef)) / MAX_PERCENT;
        if (hero.health - attackScore < MIN_HEALTH)
            hero.health = MIN_HEALTH;
        else
            hero.health -= attackScore;
    }

    @Override
    public String toString() {
        return String.format("%s{health=%.0f}", this.getClass().getSimpleName(), health);
    }
}
