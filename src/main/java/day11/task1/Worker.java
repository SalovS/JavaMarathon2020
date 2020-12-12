package day11.task1;

public abstract class Worker {
    protected long salary;
    protected boolean isPayed;
    protected int wages;
    protected int cashPrise;
    protected Warehouse storage;

    public Worker(Warehouse storage) {
        this.storage = storage;
    }

    public long getSalary() {
        return salary;
    }

    public boolean getIsPayed() {
        return isPayed;
    }

    public String toString() {
        return "заработная плата : " + salary +
                "\tбыл выплачен бонус : " + (isPayed ? "ДА" : "НЕТ");
    }

    public abstract void doWork();

    public abstract void bonus();
}
