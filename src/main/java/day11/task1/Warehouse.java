package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;
    private int norm = 10000;

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public void addOrdering() {
        countPickedOrders++;
    }

    public void addDelivery() {
        countDeliveredOrders++;
    }

    public boolean getBonusForPicker() {
        if (countPickedOrders >= norm) {
            return true;
        }
        return false;
    }

    public boolean getBonusForCourier() {
        if (countDeliveredOrders >= norm) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "количество собранных заказов : " + countPickedOrders +
                "\tколичество доставленных заказов : " + countDeliveredOrders;
    }
}
