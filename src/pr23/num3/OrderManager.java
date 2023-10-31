package pr23.num3;

public class OrderManager {
    private Order[] orders;
    private int[] tableNumbers;

    public OrderManager(int maxTables) {
        orders = new Order[maxTables];
        tableNumbers = new int[maxTables];
    }

    public void add(Order order, int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.length) {
            orders[tableNumber] = order;
            tableNumbers[tableNumber] = tableNumber;
        }
    }

    public Order getOrder(int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.length) {
            return orders[tableNumber];
        }
        return null;
    }

    public void addDish(Dish dish, int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.length && orders[tableNumber] != null) {
            orders[tableNumber].add(dish);
        }
    }

    public void removeOrder(int tableNumber) {
        if (tableNumber >= 0 && tableNumber < orders.length) {
            orders[tableNumber] = null;
            tableNumbers[tableNumber] = 0;
        }
    }

    public int freeTableNumber() {
        for (int i = 1; i < tableNumbers.length; i++) {
            if (tableNumbers[i] == 0) {
                return i;
            }
        }
        return -1; // No free tables
    }

    public int[] freeTableNumbers() {
        int[] freeTables = new int[tableNumbers.length];
        int count = 0;
        for (int i = 1; i < tableNumbers.length; i++) {
            if (tableNumbers[i] == 0) {
                freeTables[count] = i;
                count++;
            }
        }
        int[] result = new int[count];
        System.arraycopy(freeTables, 0, result, 0, count);
        return result;
    }

    public Order[] getOrders() {
        return orders;
    }

    public double ordersCostSummary() {
        double totalCost = 0.0;
        for (Order order : orders) {
            if (order != null) {
                totalCost += order.getTotalCost();
            }
        }
        return totalCost;
    }

    public int dishQuantity(String dishName) {
        int quantity = 0;
        for (Order order : orders) {
            if (order != null) {
                quantity += order.dishQuantity(dishName);
            }
        }
        return quantity;
    }
}