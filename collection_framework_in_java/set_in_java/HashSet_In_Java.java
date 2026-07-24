// Defination of Set Interface :- The Set interface is part of the Java Collections Framework and is used to store a collection of unique elements. ""Common Set Methods are :- add(),remove(),contains(),size(),clear()"".

// Defination of HashSet class :- A HashSet is a class in the Java Collection Framework that implements the Set interface. It stores unique elements and does not maintain any insertion or Sorted order Internally, and the output is "no order guaranteed" for HashSet. In java:- HashSet uses a HashMap to store elements(Internally), making operations like insertion, deletion, and searching("obj.contains(44)") very fast. and it Does not allow duplicates in HashSet. and In HashSet we cannot use "index-based access"(".get()").
// The Default capacity of HashSet is "0" and initial capacity of HashSet is "16" and the capacity will be increases like (16 → 32 → 64 → 128 → ...).
// HashSet is not Synchronized. and it is not a Thread Safe.

package collection_framework_in_java.set_in_java;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class HashSet_In_Java {
    public static void main(String[] args) {
        Set<Integer> obj = new HashSet<Integer>();
        obj.add(20);
        obj.add(20); // No duplicates allowed in HashSet class.

        obj.add(2); // --->(1) Here in HashSet, all "add()" methods refers "keys" in HashMap.
                    // Here Example "2" is a key in this add() Method.
                    // --->(2)Here, all "values" in HashMap refers in HashSet as a default Object
                    // (or) a dummy Object Like this ===> ("""new Object();""").

        obj.add(32);
        obj.add(null); // HashSet will allows one "null" value.
        obj.add(44);
        obj.add(11);
        obj.add(68);
        obj.add(52);

        System.out.println(obj.size());
        System.out.println(obj.contains(44));
        System.out.println(obj);
        obj.remove(68);
        System.out.println(obj);

        System.out.println();

        /*
         * 1) To Sort the HashSet List :-
         * 
         * 2) Note:- Here we cannot use this "Collections.sort(li);" directly it doesn't
         * support in HashSet.
         * 
         * 3) so we can use this "List<Integer> li = new ArrayList<Integer>(obj);"
         * Externally. to Sort the HashSet List.
         */
        // List<Integer> li = new ArrayList<Integer>(obj);
        // Collections.sort(li);
        // System.out.println(li);
        // System.out.println();
        // System.out.println();
        // Collections.sort(li, Collections.reverseOrder());
        // System.out.println(li);

    }
}

// Rules of LinkedHashSet :-
// 1) LinkedHashSet will Maintain the Insertion Order.
// 2) LinkedHashSet uses a LinkedHashMap to store elements(Internally).
// 3) The Default and initial capacity of LinkedHashSet is "16".
// 4) In LinkedHashSet it will not allow Duplicates.
// 5) In LinkedHashSet it will allows only one "null" value.
// 6) In LinkedHashSet we cannot use "index-based access"(".get()").
// 7) LinkedHashSet is not Synchronized. and it is not a Thread Safe.

// Rules of TreeSet :-
// 1) TreeSet will Maintain the Sorted Order.
// 2) TreeSet uses a TreeMap to store elements(Internally).
// 3) In TreeSet it Provides these In-Built Methods :-
// [".first()" , ".last()" , ".pollFirst()" , ".pollLast()" ,
// ".subSet(10,50)" , ".descendingSet()"].
// 4) The Default and initial capacity of TreeSet is "0".
// 5) In TreeSet it will not allow Duplicates.
// 6) In TreeSet it will not allow "null" values.
// 7) In TreeSet we cannot use "index-based access"(".get()").
// 8) TreeSet is not Synchronized. and it is not a Thread Safe.