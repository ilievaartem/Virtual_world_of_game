package Lab5.Task2;

import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;

    public Order(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
    }

    public void processOrder() {
        OrderProcessor orderProcessor = new OrderProcessor(items);
        orderProcessor.processOrder();
    }
}
