package day11.task2;

public class Magician extends Hero {
    private double magicAtt = 20;

    public Magician() {
        physAtt = 5;
        physDef = 0;
        magicDef = 80;
    }

    public void physicalAttack(Hero hero) {
        System.out.print(hero);
        hero.takePhysDamage(physAtt);
    }

    public void magicAttack(Hero hero) {
        System.out.print(hero);
        hero.takeMagicDamage(magicAtt);
    }

    public String toString() {
        return "Magician";
    }
}
