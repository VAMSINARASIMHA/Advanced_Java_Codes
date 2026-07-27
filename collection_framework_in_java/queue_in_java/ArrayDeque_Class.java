// ArrayDeque is a resizable-array implementation of the Deque interface in the Java Collections Framework. It allows insertion and deletion of elements from both the front and the rear of the queue. It can be used as both a Queue (FIFO) and a Stack (LIFO).
// ArrayDeque uses a resizable circular array internally.and It allows insertion and deletion from both ends. and it is Faster than Stack and LinkedList for queue operations.
// Allows duplicate elements, And it Doesn't allow "null" values. Not thread-safe, and Doesn't maintain sorted order and ArrayDeque maintains only "insertion order".
// ArrayDeque is not synchronized, so it is faster for single-threaded applications.
package collection_framework_in_java.queue_in_java;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_Class {
    public static void main(String[] args) {
        Deque<String> pq = new ArrayDeque<>();
        pq.add("Vamsi");
        pq.add("charan");
        pq.addFirst("Krishna");
        pq.offerFirst("vijay");
        pq.offer("viraj");
        pq.addLast("Ramesh");
        pq.offerLast("Ram");
        pq.push("Shoyeb");

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.peekFirst());
        System.out.println(pq.peekLast());

        System.out.println();
        System.out.println();

        System.out.println(pq.poll());
        System.out.println(pq.pollFirst());
        System.out.println(pq.pollLast());
        System.out.println(pq.pop());
        System.out.println(pq);
        System.out.println(pq.size());
        System.out.println(pq.getFirst());
        System.out.println(pq.getLast());
        pq.clear();
        System.out.println(pq);

    }
}
// Note :- The default capacity of ArrayDeque is "17".
/*
 * some in-built methods in ArrayDeque :-
 * 1) offer(), offerFirst(), offerLast(), add(), addFirst(), addLast(),
 * addAll(), push().
 * 
 * 2) peek(), peekFirst(), peekLast().
 * 
 * 3) poll(), pollFirst(), pollLast() And remove(), removeFirst(), removeLast(),
 * pop().
 * 
 * 4)getFirst(), getLast().
 */

// Note :- LinkedList is also do same operations as ArrayDeque.
// "Deque<String> pq = new LinkedList<>();".