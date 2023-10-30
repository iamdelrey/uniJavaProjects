package pr21.num1;

import java.util.NoSuchElementException;

class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int front = 0;
    private static int rear = 0;

    public static void enqueue(Object element) {
        ensureCapacity();
        elements[rear] = element;
        rear = (rear + 1) % elements.length;
        size++;
    }

    public static Object element() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");
        return elements[front];
    }

    public static Object dequeue() {
        Object first = element();
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return first;
    }

    public static int size() {
        return size;
    }

    public static boolean isEmpty() {
        return size == 0;
    }

    public static void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
        front = 0;
        rear = 0;
    }

    private static void ensureCapacity() {
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