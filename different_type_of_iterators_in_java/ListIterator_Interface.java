// 1. hasNext(): Checks if there are more elements in the collection.
// 2. next(): Retrieves the next element in the collection.

//Example Code 1 :-

package different_type_of_iterators_in_java;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Interface {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Java");
        obj.add("Python");
        obj.add("Spring Boot");
        obj.add("C++");
        // ListIterator<String> itr = list.listIterator(2);
        // Starts iteration from index 2.
        ListIterator<String> itr = obj.listIterator();
        while (itr.hasNext()) {
            String str = itr.next();
            if (str.equals("Python")) {
                itr.add("SQL");
            }
            if (str == "C++") {
                itr.remove();
            }
        }
        System.out.println(obj);

        System.out.println();
        System.out.println();
        System.out.println();

        itr.add("JDBC"); // if we write this code :- ""obj.add("JDBC");"" Then it shows Error.
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
        System.out.println(obj);

    }
}

// Example Code 2 :-

// import java.util.ArrayList;
// import java.util.ListIterator;

// public class ListIterator_Interface {
// public static void main(String[] args) {

// ArrayList<String> list = new ArrayList<>();

// list.add("Java"); // Index 0
// list.add("Python"); // Index 1
// list.add("C++"); // Index 2
// list.add("SQL"); // Index 3
// list.add("Spring"); // Index 4

// ListIterator<String> itr = list.listIterator(2);

// while (itr.hasNext()) {
// System.out.println(itr.next());
// }
// }
// }
