package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse storage;
    protected static final int WAGES = 80;
    protected static final int CASHPRISE = 70000;
    protected static final int NORM = 10000;

    public Picker(Warehouse storage) {
        this.storage = storage;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        salary += WAGES;
        storage.addOrdering();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (storage.getCountPickedOrders() >= NORM) {
            salary += CASHPRISE;
            isPayed = true;
        } else
            System.out.println("Бонус пока не доступен");
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
