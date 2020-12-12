package day11.task2;

public abstract class Hero {
    protected static final double MAX_HEALTH = 100;
    protected static final double MIN_HEALTH = 0;
    protected double health = 100;
    protected double physAtt;
    protected double physDef;
    protected double magicDef;

    public abstract void physicalAttack(Hero hero);

    public abstract String toString();

    protected void takePhysDamage(double damage) {
        if (health - (damage * (100 - physDef) / 100) < MIN_HEALTH)
            health = MIN_HEALTH;
        else health -= damage * ((100 - physDef) / 100);
        printHealth(health);
    }

    protected void takeMagicDamage(double damage) {
        if (health - (damage * (100 - magicDef) / 100) < MIN_HEALTH)
            health = MIN_HEALTH;
        else health -= damage * ((100 - magicDef) / 100);
        printHealth(health);
    }

    protected void takeHealing(double healing) {
        if (health + healing > MAX_HEALTH)
            health = MAX_HEALTH;
        else health += healing;
        printHealth(health);
    }
    private void printHealth(double hitpoints){
        System.out.printf("{health=%.0f}\n", hitpoints);
    }
}
