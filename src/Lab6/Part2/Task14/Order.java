package Lab6.Part2.Task14;

public class Order {
    private IOrderState status;

    public Order() {
        this.status = new NewOrderState();
    }

    public IOrderState getStatus() {
        return status;
    }

    public void setStatus(IOrderState status) {
        this.status = status;
    }

    public void processOrder() {
        status.processOrder(this);
    }
}
