/*
Generics allow you to write classes, interfaces, and methods that work with different data types while maintaining type safety.

Without Generics, Java stores objects as Object, requiring explicit casting.

With Generics, Java knows the exact type.







Without Generics :-

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Java");
        list.add(100);
        String name = (String) list.get(0);
        System.out.println(name);
        String value = (String) list.get(1); // Runtime Error
    }
}


Output :- Java Exception in thread "main"
          ClassCastException

Disadvantages :-
                No type safety
                Manual casting
                Runtime errors




With Generics :-

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        // list.add(100);  // Compile-time Error
        String name = list.get(0);
        System.out.println(name);            // Output :- Java.
    }
}

Advantages:-
            Compile-time checking
            No casting
            Cleaner code
            Reusable code
*/

//Generic Class Example :-
package generics_in_java;

import java.util.ArrayList;

class Boy<P, Q> {
    P id;
    Q name;

    public Boy(P id, Q name) {
        super();
        this.id = id;
        this.name = name;
    }

    public P getId() {
        return id;
    }

    public void setId(P id) {
        this.id = id;
    }

    public Q getName() {
        return name;
    }

    public void setName(Q name) {
        this.name = name;
    }

    public String toString() {
        return "[id=" + id + ", name=" + name + "]";
    }

}

public class Generic_Classes {
    public static void main(String[] args) {
        ArrayList<Boy<Integer, String>> obj = new ArrayList<>();
        obj.add(new Boy<>(1, "Ram"));
        obj.add(new Boy<>(2, "Rajesh"));
        System.out.println(obj);
    }
}

// class Girl<Q> {
// Q value;

// public Girl(Q value) {
// this.value = value;
// }

// public Q getValue() {
// return value;
// }
// }

// public class Generic_Classes {
// public static void main(String[] args) {

// Girl<Integer> b1 = new Girl<>(1995);
// Girl<String> b2 = new Girl<>("Java");

// System.out.print(b1.getValue() + " : ");
// System.out.println(b2.getValue());
// }
// }

/*
 * 1. Generic Method with void Return Type :-
 * 
 * 
 * class Demo {
 * public <T> void print(T value) {
 * System.out.println(value);
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Demo d = new Demo();
 * 
 * d.print(10);
 * d.print("Java");
 * d.print(3.14);
 * }
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 2. Generic Method with Multiple Type Parameters :-
 * 
 * class Demo {
 * public <T, U> void display(T id, U name) {
 * System.out.println(id);
 * System.out.println(name);
 * }
 * }
 * 
 * public class Main {
 * public static void main(String[] args) {
 * Demo d = new Demo();
 * d.display(1, "Ram");
 * d.display(2, "Rajesh");
 * }
 * }
 * 
 * 
 * 
 * 
 * 3. Generic with Static Method :-
 * 
 * 
 * public class Main{
 * public static <T> void print(T value){
 * System.out.println(value);
 * }
 * public static void main(String[] args){
 * print(100);
 * print("Java");
 * print(25.5);
 * }
 * }
 * 
 */