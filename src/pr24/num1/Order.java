package pr24.num1;

import pr23.num2.Item;

public interface Order {
    boolean addItem(Item item);
    boolean removeItem(String itemName);
    int removeAllItems(String itemName);
    int getTotalItemCount();
    Item[] getItems();
    double getTotalCost();
    int getItemCount(String itemName);
    String[] getOrderedItemNames();
    Item[] getSortedItemsByCostDesc();
}
