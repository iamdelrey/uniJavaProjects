package pr6.num3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
        List<Student> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        Collections.sort(mergedList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGPA(), s1.getGPA());
            }
        });

        return mergedList;
    }
}