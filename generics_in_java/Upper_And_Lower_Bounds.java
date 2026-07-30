package generics_in_java;

// 1) Upper Bound means :- "Accept this class or any of its subclasses".
// Syntax :- """<? extends ClassName>""".

import java.util.*;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}

public class Upper_And_Lower_Bounds {
    public static void display(List<? extends Animal> ani) {
        for (Animal obj : ani) {
            obj.eat();
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        display(dogs);

        display(cats);
    }
}

/*
 * // 2) Lower Bound means :- "Accept this class or any of its superclasses".
 * // Syntax :- """<? super ClassName>""".
 * 
 * 
 * 
 * import java.util.*;
 * class Animal {
 * }
 * 
 * class Dog extends Animal {
 * }
 * 
 * public class Upper_And_Lower_Bounds {
 * public static void insertDogs(List<? super Dog> list) {
 * list.add(new Dog());
 * list.add(new Dog());
 * System.out.println("Dogs Inserted");
 * }
 * public static void main(String[] args) {
 * List<Animal> animals = new ArrayList<>();
 * insertDogs(animals);
 * System.out.println(animals.size());
 * }
 * }
 * 
 */
