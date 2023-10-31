package pr23.num3;

import pr23.num2.Item;
import java.util.LinkedList;

class InternetOrder {
    private LinkedList<Item> orderList;

    public InternetOrder() {
        orderList = new LinkedList<>();
    }

    public InternetOrder(Item[] items) {
        orderList = new LinkedList<>();
        for (Item item : items) {
            addPosition(item);
        }
    }

    public boolean addPosition(Item item) {
        return orderList.add(item);
    }

    public boolean removePositionByName(String name) {
        boolean removed = false;
        for (int i = orderList.size() - 1; i >= 0; i--) {
            if (orderList.get(i).getName().equals(name)) {
                orderList.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public int removePositionsByName(String name) {
        int removedCount = 0;
        for (int i = orderList.size() - 1; i >= 0; i--) {
            if (orderList.get(i).getName().equals(name)) {
                orderList.remove(i);
                removedCount++;
            }
        }
        return removedCount;
    }

    public int getTotalPositionCount() {
        return orderList.size();
    }

    public Item[] getOrderedItems() {
        Item[] items = new Item[orderList.size()];
        for (int i = 0; i < orderList.size(); i++) {
            items[i] = orderList.get(i);
        }
        return items;
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Item item : orderList) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public int getPositionCountByName(String name) {
        int count = 0;
        for (Item item : orderList) {
            if (item.getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public String[] getOrderedItemNames() {
        LinkedList<String> itemNames = new LinkedList<>();
        for (Item item : orderList) {
            if (!itemNames.contains(item.getName())) {
                itemNames.add(item.getName());
            }
        }
        return itemNames.toArray(new String[0]);
    }

    public Item[] getSortedItemsByPrice() {
        orderList.sort((item1, item2) -> Double.compare(item2.getCost(), item1.getCost()));
        return getOrderedItems();
    }
}