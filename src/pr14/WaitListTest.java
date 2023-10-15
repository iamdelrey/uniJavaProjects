package pr14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaitListTest {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new WaitList<>();
        waitList.add(682);
        waitList.add(86262);
        waitList.add(38);
        System.out.println("Список ожидания:");
        System.out.println(waitList);

        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(2);
        boundedWaitList.add("A");
        boundedWaitList.add("B");
        System.out.println("\nBoundedWaitList:");
        System.out.println(boundedWaitList);

        boundedWaitList.add("C"); // Не должно добавиться из-за ограничения
        System.out.println(boundedWaitList);

        UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add('X');
        unfairWaitList.add('Y');
        unfairWaitList.add('Z');
        System.out.println("\nUnfairWaitList:");
        System.out.println(unfairWaitList);

        System.out.println("Содержит ли UnfairWaitList букву Z? " + unfairWaitList.contains('Z'));
        System.out.println("Содержит ли WaitList число 4? " + waitList.contains(4));

        List<Integer> checkList = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("Содержит ли WaitList все элементы из проверочного списка? " + waitList.containsAll(checkList));

        System.out.println("WaitList пустой? " + waitList.isEmpty());
    }
}
