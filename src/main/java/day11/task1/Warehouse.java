package day11.task1;

public class Warehouse {
    private int countPickedOrders;
    private int countDeliveredOrders;

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

    public String toString() {
        return "количество собранных заказов : " + countPickedOrders +
                "\tколичество доставленных заказов : " + countDeliveredOrders;
    }
}
