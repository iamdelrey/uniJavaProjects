package pr23.num2;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }
}