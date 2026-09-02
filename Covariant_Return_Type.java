/*

Covariant Return Type means that when a subclass overrides a method, it can return a subclass type of the return type declared in the parent class.

In simple words:
Parent method → returns Parent type
Child overridden method → can return Child type 

*/
class Animal {

    Animal show() {
        System.out.println("Animal method");
        return new Animal();
    }
}

class Dog extends Animal {

    @Override
    Dog show() {
        System.out.println("Dog method");
        return new Dog();
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class Covariant_Return_Type {
    public static void main(String[] args) {
        Dog obj1 = new Dog();
        Dog obj2 = obj1.show();
        obj2.bark();
    }
}
