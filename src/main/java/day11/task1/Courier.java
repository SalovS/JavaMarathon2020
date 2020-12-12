package day11.task1;

public class Courier extends Worker{
    public Courier(Warehouse storage) {
        super(storage);
        wages = 100;
        cashPrise = 50000;
    }

    public void doWork() {
        salary += wages;
        storage.addDelivery();
    }
    public void bonus(){
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (storage.getBonusForCourier())
            salary += cashPrise;
        else
            System.out.println("Бонус пока не доступен");
        isPayed = true;
    }
}
