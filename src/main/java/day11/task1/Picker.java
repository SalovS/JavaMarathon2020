package day11.task1;

public class Picker extends Worker {
    public Picker(Warehouse storage) {
        super(storage);
        wages = 80;
        cashPrise = 70000;
    }

    public void doWork() {
        salary += wages;
        storage.addOrdering();
    }
    public void bonus(){
        if (isPayed) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (storage.getBonusForPicker())
            salary += cashPrise;
        else
            System.out.println("Бонус пока не доступен");
        isPayed = true;
    }
}
