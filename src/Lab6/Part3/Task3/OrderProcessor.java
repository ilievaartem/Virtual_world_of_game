package Lab6.Part3.Task3;

public class OrderProcessor {
    public void processOrder(int quantity, double price) {
        if (quantity > 10 || price > 1000) {
            applyDiscount();
        }

    }

    public void applyDiscount() {

    }
}
