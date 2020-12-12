package day11.task2;

public class Warrior extends Hero {
    public Warrior() {
        physAtt = 30;
        physDef = 80;
        magicDef = 0;
    }

    public void physicalAttack(Hero hero) {
        System.out.print(hero);
        hero.takePhysDamage(physAtt);
    }

    public String toString() {
        return "Warrior";
    }
}
