//Defination of a Queue :- A Queue is an interface in the Java Collection Framework. And it will follows the FIFO(First In,First Out) order Principle.
// Defination of a PriorityQueue :- A PriorityQueue is a class in the Java Collections Framework that implements the Queue interface and stores elements according to their priority rather than their insertion order. Internally, it maintains a heap (not a fully sorted order). However, elements are removed in priority order using poll() , and by default, the smallest element has the highest priority.
// It stores elements according to their priority using a binary heap, and poll() retrieves them in priority order. and it not allow "null" values.
package collection_framework_in_java.queue_in_java;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(-27);
        pq.offer(-19);
        pq.offer(-2);
        pq.offer(799);
        pq.offer(1);
        pq.offer(5);
        pq.offer(99);
        pq.offer(10);

        pq.offer(-50); // Here, always this numbers is the most Priority Queue.(so "-50" is the first
                       // number to print it in the console.) and it is always called as "Head".

        pq.add(22);
        pq.offer(27);
        pq.offer(31);
        pq.offer(31);
        pq.offer(39);
        pq.offer(51);
        pq.size();

        System.out.println(pq);
        System.out.println(pq.peek()); // It always shows only the first element (Head). i.e,"-50".
        System.out.println(pq.poll()); // Now it removes the the first element (Head). i.e,"-50".
                                       // and next it changes the Head as "-27".
        System.out.println(pq.contains(39));
        System.out.println(pq);

        System.out.println();
        System.out.println();

        // It prints in Sorted order.
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " "); // Here we can use both poll() and remove() for the sorting order.
        }

    }
}
// 1)Note :- initial and Default capacity of Priority Queue is : """11""".
// Default initial capacity = Initial capacity = "11".
// newCapacity = oldCapacity + (oldCapacity + 2)
// newCapacity = 11 + (11 + 2) ====> "24".
// newCapacity = 24 + (24 + 2) ====> "50". And so on...........
// capacity will be increases like (11,24,50,102,206......)
// we can initialize the capacity like this
// """Queue<Integer> pq = new PriorityQueue<>(30);""" but
// pq.capacity(); // (❌) Doesn't exist.

// 2)Here add() and offer() are works like similarly.
/*
 * Both add() and offer() insert elements into the queue.
 * 
 * Difference:
 * add() throws an exception if the element cannot be inserted.
 * offer() returns false instead of throwing an exception.
 */

// 3)Difference Between poll() and remove() :-
// if we not adding any element then poll() will returns as "null"
// but remove() will returns an Exception.

// 4)remember that iterating or printing a PriorityQueue does not guarantee
// sorted order because internally it uses a heap. Only poll() and peek() always
// give the highest-priority element (Head).

// 5) PriorityQueue is not synchronized.It is not thread-safe.