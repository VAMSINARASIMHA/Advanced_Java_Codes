// Association means a relationship between two independent classes/objects.
// In simple words: One object is connected to another object, but both can exist independently.

/*
Definition :- Association is a relationship where one object uses or interacts with another object.

It is a "uses-a" relationship.
Both objects can exist independently.
There is no ownership.
*/

/*
Real-world example :-

A Teacher teaches a Student.
-->Teacher can exist without Student.
-->Student can exist without Teacher.
-->They are simply related to each other.

So: Teacher ↔ Student = Association.


Teacher knows Student.
Student knows nothing about Teacher.
Both can exist separately.

This is Called Association.

*/

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void study() {
        System.out.println(name + " is studying");
    }
}

class Teacher {
    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void teach(Student obj) {
        System.out.println(name + " is teaching Maths to " + obj.name);
    }
}

public class Association {
    public static void main(String[] args) {

        Student stu = new Student("Vamsi");
        Teacher guru = new Teacher("Maths Sir");

        guru.teach(stu);
        stu.study();
    }
}
