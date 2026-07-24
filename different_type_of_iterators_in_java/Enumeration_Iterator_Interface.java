package different_type_of_iterators_in_java;

// Example Code 1 :-
// Enumeration was introduced in JDK 1.0
import java.util.*;

public class Enumeration_Iterator_Interface {
    public static void main(String[] args) {
        Vector<String> languages = new Vector<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");
        languages.add("C#");

        Enumeration<String> enr = languages.elements();

        while (enr.hasMoreElements()) {
            String str = enr.nextElement();
            System.out.println(str);
        }
    }
}

// Example Code 2 :- Using Hashtable.

// import java.util.*;

// public class Enumeration_Iterator_Interface {
// public static void main(String[] args) {

// Hashtable<String, Integer> ht = new Hashtable<>();

// ht.put("Java", 1);
// ht.put("Python", 2);
// ht.put("C++", 3);

// Enumeration<String> enr = ht.keys();

// while (enr.hasMoreElements()) {
// String key = enr.nextElement();
// System.out.println(key + " : " + ht.get(key));
// }
// }
// }

// Example code 3 :- Using Hashtable.

// import java.util.*;

// public class Enumeration_Iterator_Interface {
// public static void main(String[] args) {
// Hashtable<Integer, String> ht = new Hashtable<>();

// ht.put(1, "Java");
// ht.put(2, "Python");
// ht.put(3, "C++");

// Enumeration<Integer> enr = ht.keys();

// while (enr.hasMoreElements()) {
// Integer obj = enr.nextElement();
// System.out.println(obj + " -> " + ht.get(obj));
// }
// }
// }
