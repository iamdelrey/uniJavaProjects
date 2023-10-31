package pr23.num3;

import pr23.num2.Item;

public final class Dish implements Item {
    private double cost;
    private String name;
    private String description;

    public static final double DEFAULT_COST = 0.0;

    public Dish(String name, String description) {
        this( name, description, DEFAULT_COST);
    }

    public Dish(String name, String description, double cost) {
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

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}