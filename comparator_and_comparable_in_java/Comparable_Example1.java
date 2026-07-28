package comparator_and_comparable_in_java;

// Comparable Example
// Defination :- Comparable is an interface in the java.lang package that is used to define the natural (default) ordering of objects. It allows objects of a class to be compared with one another.
//If we want to sort a list of students by "id" every time,Then we can make the Student class implement Comparable. This defines the default (natural) ordering for Student objects. 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Student [name=" + name + ", Id=" + id + "]";
    }

    public int compareTo(Student vari) {

        // if (this.id > vari.id) {
        // return 1;
        // }
        // else {
        // return -1;
        // }

        // (or)

        // return this.id % 10 > vari.id % 10 ? 1 : -1;

        // (or)

        return this.id - vari.id; // It will sort through "id".
        // return this.name.compareTo(vari.name); // It will sort through "name".

        // Note :- 1) Students are sorted in ascending order of id, which is the natural
        // ordering defined in compareTo().
    }

}

public class Comparable_Example1 {
    public static void main(String[] args) {

        List<Student> obj = new ArrayList<>();
        obj.add(new Student("Vamsi", 31));
        obj.add(new Student("Ram", 22));
        obj.add(new Student("Ramesh", 15));
        obj.add(new Student("Suresh", 50));
        obj.add(new Student("Raju", 13));
        obj.add(new Student("Sai", 49));

        Collections.sort(obj);
        for (Student stu : obj) {
            System.out.println(stu);
        }
    }
}
/*
 * // Note :-
 * 1) Use Comparable when your class has one natural sorting order (for example,
 * Student objects are always sorted by ID).
 * 
 * 2) Use Comparator when you need different sorting orders for the same class
 * (for example, sort Student objects by ID, Name, or Marks depending on the
 * situation).
 */
