package generics_in_java;

//Defination :- A Wildcard in Java is a special symbol (?) used with Generics to represent an unknown type.

import java.util.*;

class ram {
    public void show() {
        System.out.println("in Show");
    }
}

class ravi extends ram {
    public void display() {
        System.out.println("in display");
    }
}

public class WildCard_In_Generics {
    public static void main(String[] args) {
        ram obj = new ram();
        ravi obj1 = new ravi();
        obj = obj1;

        ArrayList<?> li1 = new ArrayList<>(); /* here it shows error --->for this 'ram' so we use this ('?') wildcard */
        ArrayList<ravi> li2 = new ArrayList<>();
        li1 = li2;

        ArrayList<ram> li3 = new ArrayList<>(); // here i replaced ("?") instead of 'ram'.
                                                // and also here it doesn't shows any error ---> for this 'ram'.
                                                // here we can use both 'ram' and "?".
        li1 = li3;

        System.out.println("This code is about Understanding the WildCard Concept as a Theoretically in java");

    }
}
