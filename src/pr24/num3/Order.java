package pr24.num3;

public interface Order {

    boolean add(MenuItem item);
    String[] itemsNames();

    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem itemName);

    MenuItem[] getItems();

    boolean remove(String itemName);
    boolean remove(MenuItem item);

    int removeAll(String itemName);
    int removeAll(MenuItem item);

    MenuItem[] sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}
