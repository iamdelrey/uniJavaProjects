package pr14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Класс WaitList представляет собой реализацию интерфейса IWaitList, использующую ConcurrentLinkedQueue для управления элементами.
 *
 * @param <E> Тип элементов, которые будут храниться в этом списке.
 */
public class WaitList<E> implements IWaitList<E> {

    protected ConcurrentLinkedQueue<E> queue;

    /**
     * Создает новый экземпляр класса WaitList, инициализируя пустую очередь.
     */
    public WaitList() {
        // Инициализация пустой очереди
        queue = new ConcurrentLinkedQueue<>();
    }

    /**
     * Создает новый экземпляр класса WaitList с начальным содержимым из указанной коллекции.
     *
     * @param c Коллекция, из которой будут скопированы элементы в этот список.
     */
    public WaitList(Collection<E> c) {
        queue = new ConcurrentLinkedQueue<>(c);
    }

    /**
     * Добавляет элемент в конец списка.
     *
     * @param element Элемент, который будет добавлен в список.
     */
    @Override
    public void add(E element) {
        queue.add(element);
    }

    /**
     * Удаляет и возвращает элемент из начала списка.
     *
     * @return Удаленный элемент или null, если список пуст.
     */
    @Override
    public E remove() {
        return queue.poll();
    }

    /**
     * Проверяет, содержит ли список указанный элемент.
     *
     * @param element Элемент, который проверяется на наличие в списке.
     * @return true, если элемент найден, в противном случае - false.
     */
    @Override
    public boolean contains(E element) {
        return queue.contains(element);
    }

    /**
     * Проверяет, содержит ли список все элементы из указанной коллекции.
     *
     * @param c Коллекция элементов, которые проверяются на наличие в списке.
     * @return true, если все элементы найдены в списке, в противном случае - false.
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return queue.containsAll(c);
    }

    /**
     * Проверяет, является ли список пустым.
     *
     * @return true, если список пуст, в противном случае - false.
     */
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    /**
     * Возвращает строковое представление списка.
     *
     * @return Строковое представление списка, включая все его элементы.
     */
    @Override
    public String toString() {
        return queue.toString();
    }
}