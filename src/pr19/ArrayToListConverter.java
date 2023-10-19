package pr19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {
    public static List<String> convertStringArrayToList(String[] stringArray) {
        List<String> stringList = Arrays.asList(stringArray);
        return stringList;
    }

    public static List<Integer> convertIntArrayToList(int[] intArray) {
        List<Integer> intList = new ArrayList<>();
        for (int num : intArray) {
            intList.add(num);
        }
        return intList;
    }

    public static void main(String[] args) {
        String[] stringArray = {"One", "Two", "Three"};
        List<String> stringList = convertStringArrayToList(stringArray);
        System.out.println("Список строк: " + stringList);

        int[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertIntArrayToList(intArray);
        System.out.println("Список чисел: " + intList);
    }
}