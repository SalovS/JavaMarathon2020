package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPayed;
    private Warehouse storage;
    protected static final int WAGES = 100;
    protected static final int CASHPRISE = 50000;
    protected static final int NORM = 10000;

    public Courier(Warehouse storage) {
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
        storage.addDelivery();
    }

    @Override
    public void bonus() {
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (storage.getCountDeliveredOrders() >= NORM) {
            salary += CASHPRISE;
            isPayed = true;
        } else
            System.out.println("Бонус пока не доступен");
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
}
