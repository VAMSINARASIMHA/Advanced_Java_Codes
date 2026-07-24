package different_type_of_iterators_in_java;

//Example Code 1 :-
//Iterator Example
import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Interface {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("Java");
        obj.add("Mysql");
        obj.add("Python");
        obj.add("C++");
        Iterator<String> itr = obj.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            if (str.equals("C++")) {
                itr.remove();
            }
        }
        System.out.println(obj);
    }
}

// Example Code 2 :-
// Iterator using HashMap.
// import java.util.*;

// public class Iterator_Interface {
// public static void main(String[] args) {

// Map<String, Integer> map = new HashMap<>();

// map.put("Java", 1);
// map.put("Python", 2);
// map.put("C++", 3);

// Iterator<String> itr = map.keySet().iterator();

// while (itr.hasNext()) {
// String str = itr.next();
// System.out.println(str);
// }
// }
// }