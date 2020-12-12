package day11.task2;

public class Paladin extends Hero {
    private double healHimself = 25;
    private double healTeammate = 10;

    public Paladin() {
        physAtt = 15;
        physDef = 50;
        magicDef = 20;
    }

    public void physicalAttack(Hero hero) {
        System.out.print(hero);
        hero.takePhysDamage(physAtt);
    }

    public void healHimself() {
        System.out.print("Paladin");
        takeHealing(healHimself);
    }

    public void healTeammate(Hero hero) {
        System.out.print(hero);
        hero.takeHealing(healTeammate);
    }

    public String toString() {
        return "Paladin";
    }
}
