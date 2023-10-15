package pr14;

import java.util.Collection;

/**
 * Класс BoundedWaitList представляет собой подкласс WaitList с ограниченной вместимостью.
 *
 * @param <E> Тип элементов, которые будут храниться в этом списке.
 */
class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    /**
     * Создает список ожидания с указанной вместимостью.
     *
     * @param capacity Вместимость списка ожидания.
     */
    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    /**
     * Создает список ожидания с указанной вместимостью на основе указанной коллекции элементов.
     *
     * @param capacity Вместимость списка ожидания.
     * @param c Коллекция элементов для инициализации списка ожидания.
     */
    public BoundedWaitList(int capacity, Collection<E> c) {
        super(c);
        this.capacity = capacity;
    }

    /**
     * Получает вместимость списка ожидания.
     *
     * @return Вместимость списка ожидания.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Добавляет элемент в конец списка ожидания, если вместимость позволяет.
     * В противном случае, выводит сообщение об ошибке.
     *
     * @param element Элемент, который будет добавлен в список ожидания.
     */
    @Override
    public void add(E element) {
        if (queue.size() < capacity) {
            super.add(element);
        } else {
            System.out.println("The waitlist is already at its capacity. Element cannot be added.");
        }
    }

    /**
     * Возвращает строковое представление списка ожидания с указанием вместимости и его содержимого.
     *
     * @return Строковое представление списка ожидания, включая вместимость и элементы.
     */
    @Override
    public String toString() {
        return "BoundedWaitList [capacity=" + capacity + ", list=" + queue + "]";
    }
}