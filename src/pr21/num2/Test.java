package pr21.num2;

public class Test {
    public static void main(String[] args) {
        Queue<Float> queue = new LinkedQueue<>();

        System.out.println("Добавляем элементы в очередь:");
        for (float i = 15; i <= 25; i+=1.51352) {
            queue.enqueue(i);
            System.out.println("Добавлен: " + i);
        }

        System.out.println("\nРазмер очереди: " + queue.size());
        System.out.println("Первый элемент в очереди: " + queue.element());

        System.out.println("\nИзвлекаем элементы из очереди:");
        while (!queue.isEmpty()) {
            float element = queue.dequeue();
            System.out.println("Извлечен: " + element);
        }

        System.out.println("\nРазмер очереди после извлечения: " + queue.size());
        System.out.println("Очередь пуста? " + queue.isEmpty());

        System.out.println("\nДобавляем элементы в очередь снова:");
        for (float i = 156; i <= 164; i++) {
            queue.enqueue(i);
            System.out.println("Добавлен: " + i);
        }

        System.out.println("\nОчищаем очередь:");
        queue.clear();
        System.out.println("Размер очереди после очистки: " + queue.size());
        System.out.println("Очередь пуста после очистки? " + queue.isEmpty());
    }
}