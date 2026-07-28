package comparator_and_comparable_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Example1 {
    public static void main(String[] args) {

        List<Integer> obj = new ArrayList<>();
        obj.add(44);
        obj.add(92);
        obj.add(83);
        obj.add(69);
        obj.add(21);
        obj.add(78);

        Comparator<Integer> num = new Comparator<Integer>() {
            public int compare(Integer n1, Integer n2) {
                if (n1 % 10 > n2 % 10) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };

        Collections.sort(obj);
        System.out.println(obj); // [21, 44, 69, 78, 83, 92]

        Collections.sort(obj, num); // It Sorted According to our own logic.
        System.out.println(obj); // [21, 92, 83, 44, 78, 69].

    }
}