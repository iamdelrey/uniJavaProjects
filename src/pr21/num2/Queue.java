package pr21.num2;

public interface Queue<E> {
    void enqueue(E element);

    E dequeue();

    E element();

    int size();

    boolean isEmpty();

    void clear();
}