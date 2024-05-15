package Lab6.Part3.Task2;

public class PaymentProcessor {
    public void processPayment(double amount, boolean isMember, boolean isDiscountAvailable) {
        if (check(amount, isMember, isDiscountAvailable)) {
            applyDiscount();
        }
    }

    private boolean check(double amount, boolean isMember, boolean isDiscountAvailable) {
        return (amount > 100 && isMember) || (amount > 200 && isDiscountAvailable);
    }

    private void applyDiscount() {

    }
}
