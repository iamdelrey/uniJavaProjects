package pr24.num3;

import java.util.HashMap;
import java.util.Map;

public class InternetOrder implements Order {

    private Customer customer;
    private int size;
    private ListNode head;
    private ListNode tail;

    public InternetOrder() {
        customer = new Customer(18);
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public boolean add(MenuItem item) {
        ListNode newNode = new ListNode(item);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        Map<String, Integer> map = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            if (!map.containsKey(current.getValue().getName()))
                map.put(current.getValue().getName(), 1);
            current = current.getNext();
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
        ListNode current = head;
        while (current != null) {
            if (current.getValue().getName().equals(itemName))
                quantity++;
            current = current.getNext();
        }
        return quantity;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int quantity = 0;
        ListNode current = head;
        while (current != null) {
            if (current.getValue() == item)
                quantity++;
            current = current.getNext();
        }
        return quantity;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] itemArray = new MenuItem[size];
        ListNode current = head;
        int index = 0;
        while (current != null) {
            itemArray[index] = current.getValue();
            current = current.getNext();
            index++;
        }
        return itemArray;
    }

    @Override
    public boolean remove(String itemName) {
        boolean removed = false;

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            if (current.getValue().getName().equals(itemName)) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                removed = true;
                break;
            }
            previous = current;
            current = current.getNext();
        }
        if (current == tail)
            tail = previous;
        return removed;
    }

    @Override
    public boolean remove(MenuItem item) {
        boolean removed = false;
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            if (current.getValue() == item) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                removed = true;
                break;
            }
            previous = current;
            current = current.getNext();
        }
        if (current == tail)
            tail = previous;
        return removed;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        ListNode previous = null;
        ListNode current = head;
        while (current != null) {
            if (current.getValue().getName().equals(itemName)) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                count++;
            } else {
                previous = current;
            }
            current = current.getNext();
        }
        if (tail == null) {
            tail = previous;
        }
        return count;
    }

    @Override
    public int removeAll(MenuItem item) {
        int count = 0;
        ListNode previous = null;
        ListNode current = head;

        while (current != null) {
            if (current.getValue() == item) {
                if (previous == null) {
                    head = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                }
                size--;
                count++;
            } else {
                previous = current;
            }
            current = current.getNext();
        }
        if (current == tail)
            tail = previous;
        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] sortedItems = getItems();
        ListNode current = head;

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
        ListNode current = head;
        while (current != null) {
            totalCost += current.getValue().getCost();
            current = current.getNext();
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
