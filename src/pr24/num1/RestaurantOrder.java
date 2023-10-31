package pr24.num1;

import pr23.num3.Dish;

import java.util.ArrayList;
import java.util.List;

public class RestaurantOrder {
    private List<Dish> dishes = new ArrayList<>();
    private int size = 0;

    public boolean add(Dish dish) {
        dishes.add(dish);
        size++;
        return true;
    }

    public boolean remove(String dishName) {
        for (int i = size - 1; i >= 0; i--) {
            if (dishes.get(i).getName().equals(dishName)) {
                dishes.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String dishName) {
        int removedCount = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (dishes.get(i).getName().equals(dishName)) {
                dishes.remove(i);
                size--;
                removedCount++;
            }
        }
        return removedCount;
    }

    public int dishQuantity() {
        return size;
    }

    public int dishQuantity(String dishName) {
        int count = 0;
        for (Dish dish : dishes) {
            if (dish.getName().equals(dishName)) {
                count++;
            }
        }
        return count;
    }

    public Dish[] getDishes() {
        return dishes.toArray(new Dish[0]);
    }

    public double costTotal() {
        double totalCost = 0.0;
        for (Dish dish : dishes) {
            totalCost += dish.getCost();
        }
        return totalCost;
    }

    public String[] dishesNames() {
        List<String> dishNames = new ArrayList<>();
        for (Dish dish : dishes) {
            if (!dishNames.contains(dish.getName())) {
                dishNames.add(dish.getName());
            }
        }
        return dishNames.toArray(new String[0]);
    }

    public Dish[] sortedDishesByCostDesc() {
        dishes.sort((dish1, dish2) -> Double.compare(dish2.getCost(), dish1.getCost()));
        return dishes.toArray(new Dish[0]);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (Dish dish : dishes) {
            totalCost += dish.getCost();
        }
        return totalCost;
    }
}