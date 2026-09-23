// Definition :- A Singleton class is a class that allows only one object (one instance) of that class to be created throughout the application.
// In Simple Words :- Singleton = A class that has only one object, and provides a way to access that object.

/*

s1 ───────┐
          │
          ▼
      Student Object
          ▲
          │
s2 ───────┘

Both references point to the same object.
*/

/* 
There are 3 important steps to Create a Singleton Class :- 

Step 1: Make constructor private.
Step 2: Create one object inside the class.
Step 3: Provide a public method to access it

*/

class Rajesh {

    // Single object
    private static Rajesh obj = new Rajesh();

    // Private constructor
    private Rajesh() {
        System.out.println("Object Created For Rajesh");
    }

    // Method to access the object
    public static Rajesh getInstance() {
        return obj;
    }
}

public class Singleton_Class {

    public static void main(String[] args) {

        Rajesh s1 = Rajesh.getInstance();
        Rajesh s2 = Rajesh.getInstance();

        System.out.println(s1 == s2);
    }
}
