// A record in Java is a special type of class designed to hold immutable data with less boilerplate code.

// It is especially useful for objects that mainly exist to store data, such as Student, Employee, Product, User, etc.

// Note :- Records are Immutable, And A record cannot extend another class, And A Record can Implement an Interface. And we can initialize a static variables in the record class.

// A Simple Defination :- 
// A record is a special kind of Java class introduced in Java 17 that provides a concise way to create immutable data-carrying classes while automatically generating a constructor, accessors, equals(), hashCode(), and toString().

/* 


class Alien {
    private final int id;
    private final String name;

    public Alien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alien other = (Alien) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}


*/

// Note :- Instead of this entire above commented code we can use this below "record" class for the best code efficiency and redability.

record Alien(int id, String name) {

}

record ram() {
    public void show() {
        System.out.println("this is show method");
    }
}

public class Record_Class {

    public static void main(String[] args) {
        Alien obj = new Alien(1, "vamsi");
        Alien obj1 = new Alien(1, "vamsi");

        System.out.println(obj.id());
        System.out.println(obj.name());
        System.out.println(obj.equals(obj1));
        System.out.println(obj);

        ram ooo = new ram();
        ooo.show();
    }

}

// The Meaning of “Java is verbose”, it means:
// Java often requires more lines of code and more explicit code to do something
// compared with some other languages.

// In Simple Words :-
// when someone says “Java is verbose” they generally mean “Java sometimes
// requires more code to express the same idea.”