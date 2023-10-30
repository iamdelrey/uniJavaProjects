package pr21.num1;

public class Test {
    public static void main(String[] args) {
        // Тестирование ArrayQueueModule
        System.out.println("Тестирование ArrayQueueModule");

        ArrayQueueModule.enqueue("Anton"); // Добавляем "Anton" в очередь
        ArrayQueueModule.enqueue("b"); // Добавляем "b" в очередь
        ArrayQueueModule.enqueue(142); // Добавляем 142 в очередь


        System.out.println("Элемент в начале очереди: " + ArrayQueueModule.element()); // Ожидаем "Anton"
        System.out.println("Извлекаем элемент: " + ArrayQueueModule.dequeue()); // Ожидаем "Anton"
        System.out.println("Элемент в начале очереди: " + ArrayQueueModule.element()); // Ожидаем "b"
        System.out.println("Размер очереди: " + ArrayQueueModule.size()); // Ожидаем 2
        System.out.println("Очередь пуста? " + ArrayQueueModule.isEmpty()); // Ожидаем false
        ArrayQueueModule.clear(); // Очищаем очередь
        System.out.println("Очередь очищена");
        System.out.println("Очередь пуста? " + ArrayQueueModule.isEmpty()); // Ожидаем true

        // Тестирование ArrayQueueADT
        System.out.println("\nТестирование ArrayQueueADT");
        ArrayQueueADT queue = new ArrayQueueADT();

        ArrayQueueADT.enqueue(queue, 1535.51); // Добавляем 1535.51 в очередь
        ArrayQueueADT.enqueue(queue, true); // Добавляем true в очередь
        ArrayQueueADT.enqueue(queue, "Java"); // Добавляем "Java" в очередь
        ArrayQueueADT.enqueue(queue, 15); // Добавляем 15 в очередь

        System.out.println("Элемент в начале очереди: " + ArrayQueueADT.element(queue)); // Ожидаем 1535.51
        System.out.println("Извлекаем элемент: " + ArrayQueueADT.dequeue(queue)); // Ожидаем 1535.51
        System.out.println("Элемент в начале очереди: " + ArrayQueueADT.element(queue)); // Ожидаем "true"
        System.out.println("Размер очереди: " + ArrayQueueADT.size(queue)); // Ожидаем 3
        System.out.println("Очередь пуста? " + ArrayQueueADT.isEmpty(queue)); // Ожидаем false
        ArrayQueueADT.clear(queue); // Очищаем очередь
        System.out.println("Очередь очищена");
        System.out.println("Очередь пуста? " + ArrayQueueADT.isEmpty(queue)); // Ожидаем true

        // Тестирование ArrayQueue
        System.out.println("\nТестирование ArrayQueue");
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue(1); // Добавляем 1 в очередь

        System.out.println("Элемент в начале очереди: " + arrayQueue.element()); // Ожидаем 1
        System.out.println("Извлекаем элемент: " + arrayQueue.dequeue()); // Ожидаем 1
        System.out.println("Размер очереди: " + arrayQueue.size()); // Ожидаем 0
        System.out.println("Очередь пуста? " + arrayQueue.isEmpty()); // Ожидаем true
    }
}