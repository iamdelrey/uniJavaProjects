package pr21.num1;

import java.util.NoSuchElementException;

class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int front = 0;
    private int rear = 0;

    // Добавить элемент в очередь
    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue);
        queue.elements[queue.rear] = element;
        queue.rear = (queue.rear + 1) % queue.elements.length;
        queue.size++;
    }

    // Получить первый элемент в очереди
    public static Object element(ArrayQueueADT queue) {
        if (isEmpty(queue))
            throw new NoSuchElementException("Queue is empty");
        return queue.elements[queue.front];
    }

    // Удалить и вернуть первый элемент в очереди
    public static Object dequeue(ArrayQueueADT queue) {
        Object first = element(queue);
        queue.elements[queue.front] = null;
        queue.front = (queue.front + 1) % queue.elements.length;
        queue.size--;
        return first;
    }

    // Получить текущий размер очереди
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Проверить, является ли очередь пустой
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Очистить очередь
    public static void clear(ArrayQueueADT queue) {
        for (int i = 0; i < queue.elements.length; i++) {
            queue.elements[i] = null;
        }
        queue.size = 0;
        queue.front = 0;
        queue.rear = 0;
    }

    // Убедиться в достаточной емкости массива
    private static void ensureCapacity(ArrayQueueADT queue) {
        if (queue.size == queue.elements.length) {
            Object[] newElements = new Object[2 * queue.elements.length];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.front + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.front = 0;
            queue.rear = queue.size;
        }
    }
}