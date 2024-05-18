package Lab5.Task2;

import java.util.List;

public class OrderProcessor {
    private List<Item> items;

    public OrderProcessor(List<Item> items) {
        this.items = items;
    }

    public void processOrder() {
        displayOrderDetails();
    }

    private void displayOrderDetails() {
        for (Item item : items) {
            System.out.println("Processing item: " + item.getItemName() + ", Price: " + item.getPrice());
        }
        double totalPrice = calculateTotalPrice();
        System.out.println("Total price: " + totalPrice);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += calculateItemPrice(item);
        }
        return totalPrice;
    }

    private double calculateItemPrice(Item item) {
        return item.getPrice();
    }
}
