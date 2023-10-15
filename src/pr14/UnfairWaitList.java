package pr14;

import java.util.Collection;

/**
 * Класс UnfairWaitList представляет собой расширение класса WaitList с дополнительными операциями.
 *
 * @param <E> Тип элементов в списке ожидания.
 */
class UnfairWaitList<E> extends WaitList<E> {
    /**
     * Создает пустой список ожидания без дополнительных операций.
     */
    public UnfairWaitList() {
        super();
    }

    /**
     * Создает список ожидания на основе указанной коллекции элементов без дополнительных операций.
     *
     * @param c Коллекция элементов для инициализации списка ожидания.
     */
    public UnfairWaitList(Collection<E> c) {
        super(c);
    }

    /**
     * Удаляет элемент из списка ожидания, если он присутствует.
     *
     * @param element Элемент, который должен быть удален.
     */
    public void remove(E element) {
        queue.remove(element);
    }

    /**
     * Перемещает элемент в конец списка ожидания, если он присутствует.
     *
     * @param element Элемент, который должен быть перемещен в конец списка.
     */
    public void moveToBack(E element) {
        if (queue.contains(element)) {
            queue.remove(element);
            queue.add(element);
        }
    }

    /**
     * Возвращает строковое представление списка ожидания без указания дополнительных операций.
     *
     * @return Строковое представление списка ожидания, включая его элементы.
     */
    @Override
    public String toString() {
        return "UnfairWaitList [list=" + queue + "]";
    }
}