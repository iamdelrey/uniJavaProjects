package pr9.num2;

public class Clothes implements Priceable {
    private String name;
    private double price;

    public Clothes(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}