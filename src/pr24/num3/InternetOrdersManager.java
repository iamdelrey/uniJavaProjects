package pr24.num3;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head;
    private QueueNode tail;
    private int size;

    public InternetOrdersManager() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode current = head;
        while (current != null) {
            count += current.getValue().itemsQuantity(itemName);
            current = current.getNext();
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QueueNode current = head;
        while (current != null) {
            count += current.getValue().itemsQuantity(item);
            current = current.getNext();
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode current = head;
        int count = 0;
        while (current != null) {
            orders[count] = current.getValue();
            current = current.getNext();
            count++;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int total = 0;
        QueueNode current = head;
        while (current != null) {
            total += current.getValue().costTotal();
            current = current.getNext();
        }
        return total;
    }

    @Override
    public int ordersQuantity() {
        int sum = 0;
        QueueNode current = head;
        while (current != null) {
            sum += 1;
            current = current.getNext();
        }
        return sum;
    }

    public boolean add(Order order) {
        QueueNode newNode = new QueueNode(null, null, order);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
        }
        tail = newNode;
        size++;
        return true;
    }

    public Order remove() {
        QueueNode del = head;
        head = head.getNext();
        return del.getValue();
    }

    public Order order() {
        return head.getValue();
    }

    public void show() {
        for (Order order: getOrders()) {
            if (order != null) {
                System.out.println("Заказ - " + order.getCustomer().getFirstName() + " " + order.getCustomer().getSecondName() + ":");
                for (String names : order.itemsNames()) {
                    System.out.println(names);
                }
                System.out.println();
            }
        }
    }
}
