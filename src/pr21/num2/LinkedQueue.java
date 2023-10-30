package pr21.num2;

import java.util.NoSuchElementException;

class LinkedQueue<E> extends AbstractQueue<E> {
    private Node<E> front;
    private Node<E> rear;

    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }
    }

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element, null);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");
        E removedElement = front.value;
        front = front.next;
        size--;
        if (isEmpty())
            rear = null;
        return removedElement;
    }

    @Override
    public E element() {
        if (isEmpty())
            throw new NoSuchElementException("Queue is empty");
        return front.value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }
}