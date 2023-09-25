package pr6.num3;

import java.util.ArrayList;
import java.util.List;

public class MergeSortStudents {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Антон", 4.83));
        list1.add(new Student("Борис", 3.51));
        list1.add(new Student("Владимир", 4.08));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Георгий", 4.29));
        list2.add(new Student("Дмитрий", 3.9));
        list2.add(new Student("Егор", 3.71));

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("Отсортированный список студентов:");
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getGPA() > student2.getGPA()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
