package pr21.num1;

import java.util.NoSuchElementException;

class ArrayQueue {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    public void enqueue(Object element) {
        ensureCapacity();
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public Object element() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");
        return elements[front];
    }

    // Удалить и вернуть первый элемент в очереди
    public Object dequeue() {
        Object first = element();
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return first;
    }

    // Получить текущий размер очереди
    public int size() {
        return size;
    }

    // Проверить, является ли очередь пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Очистить очередь
    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
        front = 0;
        rear = 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(front + i) % elements.length];
            }
            elements = newElements;
            front = 0;
            rear = size;
        }
    }
}