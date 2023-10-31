package pr24.num3;

import java.util.HashMap;

public class TableOrder implements Order {
    private Customer customer;
    private int size;
    private MenuItem[] items;

    public TableOrder() {
        customer = new Customer(18);
        items = new MenuItem[10];
    }


    @Override
    public boolean add(MenuItem item) {
        if (size == items.length) {
            MenuItem[] newItems = new MenuItem[size * 2];
            System.arraycopy(items, 0, newItems, 0, size);
            items = newItems;
        }
        if (item instanceof Drink && ((Drink)item).isAlcoholicDrink()) {
            if (customer.getAge() >= 18) {
                items[size] = item;
                size++;
            }
        } else {
            items[size] = item;
            size++;
        }
        return true;
    }

    @Override
    public String[] itemsNames() {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if (!map.containsKey(items[i].getName())) {
                map.put(items[i].getName(), 1);
            }
        }
        return map.keySet().toArray(new String[0]);
    }


    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int quantity = 0;

        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                quantity++;
            }
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        int quantity = 0;

        for (MenuItem item : items) {
            if (item == itemName) {
                quantity++;
            }
        }
        return quantity;
    }


    @Override
    public MenuItem[] getItems() {
        return items;
    }


    @Override
    public boolean remove(String itemName) {
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].getName().equals(itemName)) {
                items[i] = null;
                System.arraycopy(items, i + 1, items, i, size - i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].equals(item)) {
                items[i] = null;
                System.arraycopy(items, i + 1, items, i, size - i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].getName().equals(itemName)) {
                items[i] = null;
                System.arraycopy(items, i + 1, items, i, size - i);
                count++;
            }
        }
        size -= count;
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (items[i].equals(item)) {
                items[i] = null;
                System.arraycopy(items, i + 1, items, i, size - i);
                count++;
            }
        }
        size -= count;
        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] sortedItems = new MenuItem[size];
        System.arraycopy(items, 0, sortedItems, 0, size);

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (sortedItems[j].getCost() > sortedItems[i].getCost()) {
                    MenuItem temp = sortedItems[i];
                    sortedItems[i] = sortedItems[j];
                    sortedItems[j] = temp;
                }
            }
        }
        return sortedItems;
    }

    @Override
    public int costTotal() {
        int totalCost = 0;

        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
