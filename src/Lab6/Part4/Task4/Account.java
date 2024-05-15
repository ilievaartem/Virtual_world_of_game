package Lab6.Part4.Task4;

public class Account {
    private double balance;
    public double getBalance()
    {
        return balance;
    }

    public void calculateCommision()
    {
        double commissionRate = 0.05;
        balance -= balance * commissionRate;
    }
}
