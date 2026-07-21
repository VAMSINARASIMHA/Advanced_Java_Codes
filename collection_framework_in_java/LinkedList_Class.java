//Defination :-
//LinkedList is a class in the Java Collection Framework that implements the List and Deque interfaces. It stores elements as a doubly linked list, where each element (node) contains the data and references to both the previous and next nodes.
//  It is a class, not an interface.
//  It belongs to the java.util package.
//  It implements the List and Deque interfaces.
//  It uses a doubly linked list internally.
//  It maintains insertion order.
//  It allows duplicate elements.
//  It allows null values.
//  It provides efficient insertion and deletion of elements, especially in the middle or at the ends.

package collection_framework_in_java;

import java.util.LinkedList;

public class LinkedList_Class {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add(null);
        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }
}

// Note :-
// 1) In ArrayList :- """Random access (get(index))""" ---> Fast.
// 2) and also it is good for ""You frequently access elements by index"".
// 3) and also it is good for ""If You want better memory efficiency.""

// BUT

// 1) In LinkedList :- """Random access (get(index))""" ---> Slow.
// 2) In LinkedList it is good for """You frequently insert or remove elements
// (especially at the beginning or middle)."""
