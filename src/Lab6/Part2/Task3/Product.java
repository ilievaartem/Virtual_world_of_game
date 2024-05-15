package Lab6.Part2.Task3;

public class Product {
    private String name;
    private double price;
    private Currency currency;

    public Product(String name, double price, Currency currency) {
        this.name = name;
        this.price = price;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrencyCode() {
        return currency.getCode();
    }
}
