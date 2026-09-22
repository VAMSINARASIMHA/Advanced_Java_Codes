
// Defination :- A sealed class in Java is a class that restricts which classes can extend it using the permits clause. Its permitted subclasses must be declared as final, sealed, or non-sealed. 
// In Simple Words :- A sealed class is a class that controls which classes are allowed to extend it.

// sealed :- Only specified classes can extend it.
// final :- Nobody can extend it.
// non-sealed :- Anyone can extend it.

/* 

// Sealed Class Syntax Example For Interfaces :-

sealed interface X permits Y {

}

non-sealed interface Y extends X {

}

*/

sealed class A permits B, C {

}

final class B extends A { // Here, we can use "final" (or) "non-sealed" keywords.

}

non-sealed class C extends A { // Here, we can use "final" (or) "non-sealed" keywords.

}

class D {

}

public class Sealed_Class {
    public static void main(String[] args) {

    }
}
