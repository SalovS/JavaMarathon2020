package day11.task2;

public class Shaman extends Hero {
    private double healHimself = 50;
    private double healTeammate = 30;
    private double magicAtt = 15;

    public Shaman() {
        physAtt = 10;
        physDef = 20;
        magicDef = 20;
    }

    public void physicalAttack(Hero hero) {
        System.out.print(hero);
        hero.takePhysDamage(physAtt);
    }

    public void healHimself() {
        System.out.print("Shaman");
        takeHealing(healHimself);
    }

    public void healTeammate(Hero hero) {
        System.out.print(hero);
        hero.takeHealing(healTeammate);
    }

    public void magicAttack(Hero hero) {
        System.out.print(hero);
        hero.takeMagicDamage(magicAtt);
    }

    public String toString() {
        return "Shaman";
    }
}
