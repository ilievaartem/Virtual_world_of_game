package Lab6.Part2.Task12;

public class Product {
    private ProductType type;
    private String name;

    public Product(ProductType type, String name) {
        this.type = type;
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }
}


