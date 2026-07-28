// Defination :- The Collections class is a utility class that contains static methods for performing operations on collection Interfaces like: "List", "Set", "Queue", "Map".
// (or)
// Another Simple Defination :- The Collections class is a utility class in java.util that provides static methods to perform operations such as sorting, searching, reversing, shuffling, and synchronizing on collection objects like List, Set, and Queue. It also provides utility methods for working with Map objects. And utility class provides methods such as synchronizedMap(), unmodifiableMap(), and checkedMap() specifically for Map objects.
package collection_framework_in_java.collections_class_in_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Different_Types_Of_Collections_Class_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(40);
        nums.add(10);
        nums.add(70);
        nums.add(20);

        System.out.println(nums); // 1

        System.out.println();

        Collections.swap(nums, 0, 2);
        System.out.println(nums); // 2

        System.out.println();

        Collections.sort(nums);
        System.out.println(nums); // 3

        System.out.println();

        // Important Note :- The list must be sorted before calling binarySearch().
        int index = Collections.binarySearch(nums, 70);
        System.out.println(index); // 4

        System.out.println();

        Collections.reverse(nums);
        System.out.println(nums); // 5

        System.out.println();

        Collections.shuffle(nums);
        System.out.println(nums); // 6

        System.out.println();

        System.out.println(Collections.max(nums)); // 7
        System.out.println(Collections.min(nums)); // 8

        System.out.println();
        /*
         * 1) frequency() :- Counts occurrences.
         * 
         * ArrayList<Integer> list = new ArrayList<>();
         * list.add(10);
         * list.add(20);
         * list.add(10);
         * list.add(30);
         * list.add(10);
         * System.out.println(Collections.frequency(list,10)); // Output is :- "3".
         * 
         */

        /*
         * 
         * 2) fill() :- Replaces every element with the given value.
         * 
         * ArrayList<Integer> list = new ArrayList<>();
         * list.add(10);
         * list.add(20);
         * list.add(30);
         * Collections.fill(list,100);
         * System.out.println(list); // Output is :- "[100,100,100]".
         * 
         */

        /*
         * 
         * 3) copy() :- Copies one list into another.
         * 
         * List<String> source = Arrays.asList("A","B","C");
         * List<String> destination = Arrays.asList("","","");
         * Collections.copy(destination,source);
         * System.out.println(destination); // Output is :- "[A, B, C]".
         * 
         * 
         * // Important Note :- Destination must already have at least the same size as
         * the source list.
         */

        /*
         * 
         * 4) replaceAll() :- Replaces all occurrences.
         * 
         * ArrayList<String> list = new ArrayList<>();
         * list.add("Java");
         * list.add("Python");
         * list.add("Java");
         * Collections.replaceAll(list,"Java","Spring");
         * System.out.println(list); // Output is :- "[Spring, Python, Spring]".
         * 
         */

        /*
         * 
         * 5) rotate() :- It Rotates elements.
         * 
         * ArrayList<Integer> list = new ArrayList<>();
         * list.add(1);
         * list.add(2);
         * list.add(3);
         * list.add(4);
         * Collections.rotate(list,2);
         * System.out.println(list); // Output is :- "[3,4,1,2]".
         * 
         */

        /*
         * 
         * 6) disjoint() :- Checks whether two collections have no common elements.
         * 
         * List<Integer> a = Arrays.asList(1,2,3);
         * List<Integer> b = Arrays.asList(4,5,6);
         * System.out.println(Collections.disjoint(a,b)); // Output is :- "true".
         * 
         */

        /*
         * 
         * 7) addAll() :- Adds multiple elements at once.
         * 
         * ArrayList<Integer> list = new ArrayList<>();
         * Collections.addAll(list,10,20,30,40);
         * System.out.println(list); // Output is :- "[10,20,30,40]".
         */

        /*
         * 
         * 8) nCopies() :- Creates an immutable list containing multiple copies of the
         * same element.
         * 
         * 
         * List<String> list = Collections.nCopies(5,"Java");
         * System.out.println(list); // Output is :- "[Java, Java, Java, Java, Java]".
         * 
         */

        /*
         * 
         * 9) emptyList(), emptySet(), emptyMap() :- Return immutable empty collections.
         * 
         * List<String> list = Collections.emptyList();
         * System.out.println(list); // Output is :- "[]".
         * 
         */

        /*
         * 
         * 10) synchronization in list,set,map :- Creates a thread-safe list.
         * Collections.synchronizedList(nums); // for List Interface.
         * Collections.synchronizedSet(nums); // for Set Interfacce.
         * Collections.synchronizedMap(nums); // for Map Interface.
         *
         * // It will be Useful in multithreaded applications.
         * 
         */

        /*
        
        */

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // singleton() :- Creates an immutable collection with exactly one element.
        Set<String> obj = Collections.singleton("Hello Vamsi");
        System.out.println(obj);

        System.out.println();
        System.out.println();
        System.out.println();

        // unmodifiableList() :- Creates a read-only view.
        List<Integer> li1 = new ArrayList<>();
        li1.add(10);
        li1.add(20);
        List<Integer> readOnly = Collections.unmodifiableList(li1);
        li1.add(30);
        System.out.println(readOnly);
        // readOnly.add(55); it shows Error because it is unmodifiableList.

        /*
         * 
         * 11) Collections.reverse(nums) :- It simply reverses the current order of the
         * elements. It does not sort the list.
         * 
         * //But
         * 
         * 12) Collections.sort(nums, Collections.reverseOrder()) :- This sorts the list
         * in descending order.
         * 
         */
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

    }
}
// Note :-
// 1) we can't create an object for Collections class
// [ "Collections c = new Collections();" ].
// It is impossible because the constructor of Collections class is "private".
