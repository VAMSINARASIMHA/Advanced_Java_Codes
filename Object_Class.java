// Object is a class in java.lang Package.
// It is the superclass of all Java classes.
// Used when you want a method/variable to accept any type of object.
// Gives common methods (toString, equals, etc.) that every class inherits.

/*
 * 
 * 
 * In Java, Object is a class defined in java.lang package.
 * It is the root (superclass) of all classes in Java.
 * This means: Every class in Java either directly or indirectly inherits from
 * Object.
 * You can assign any class type to a reference of type Object.
 * 
 * 
 */

// Object Keyword is important for :- 1) Used for generic programming (e.g.,
// collections like ArrayList<Object> can store any type).
// 2) finalize() :- Called by Garbage Collector before object is destroyed.

public class Object_Class {
    public static void main(String[] args) {
        Object obj1 = "Hello"; // String stored in Object
        Object obj2 = 123; // int auto-boxed into Integer, stored in Object
        Object obj3 = new Object_Class(); // Custom class object stored in Object

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }

    @Override
    public String toString() {
        return "This is Main object";
    }
}

// public class Object_Class {
// public static void main(String[] args) {
// Object obj1 = new String("Hello");
// Object obj2 = Integer.valueOf(10);

// System.out.println(obj1); // Prints: Hello
// System.out.println(obj2); // Prints: 10
// }
// }

/*
 * 
 * public class Object_Class {
 * public static void myMethod(Object o) {
 * System.out.println("Object method: " + o);
 * }
 * 
 * public static void main(String[] args) {
 * myMethod("Hello"); // Passing a String
 * myMethod(123); // Passing an Integer
 * myMethod(45.67); // Passing a Double
 * myMethod(new Object_Class()); // Passing custom class object
 * }
 * 
 * @Override
 * public String toString() {
 * return "This is Main object";
 * }
 * }
 * 
 */

/*
 * import java.util.ArrayList;
 * 
 * public class Object_Class {
 * public static void main(String[] ar) {
 * 
 * ArrayList<Object> list = new ArrayList<>();
 * list.add("Hello");
 * list.add(123);
 * list.add(45.6);
 * 
 * for (Object o : list) {
 * System.out.println(o);
 * }
 * }
 * }
 * 
 */