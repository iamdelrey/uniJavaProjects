package pr23.num2;

public final class Drink implements Item {
    private final double cost;
    private final String name;
    private final String description;

    public static final double DEFAULT_COST = 0.0;

    public Drink(String name, String description) {
        this(DEFAULT_COST, name, description);
    }

    public Drink(double cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}