package pr24.num3;

public class Drink extends MenuItem implements Alcoholable {

    private final double alcoholVol;
    private final DrinkTypeEnum type;

    public Drink(int cost, String name, String description, double alcoholVol, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    public DrinkTypeEnum getType() { return type; }

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0.9;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
