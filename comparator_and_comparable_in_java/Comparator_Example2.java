package comparator_and_comparable_in_java;

//Sorting according to the id.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "Student [name=" + name + ", Id=" + id + "]";
    }

}

public class Comparator_Example2 {
    public static void main(String[] args) {

        List<Student> obj = new ArrayList<>();
        obj.add(new Student("Vamsi", 31));
        obj.add(new Student("Ram", 22));
        obj.add(new Student("Ramesh", 15));
        obj.add(new Student("Suresh", 50));
        obj.add(new Student("Raju", 13));
        obj.add(new Student("Sai", 49));

        Comparator<Student> num = new Comparator<Student>() {
            public int compare(Student n1, Student n2) {

                if (n1.id > n2.id) {
                    return 1;
                }

                else {
                    return -1;
                }

            }
        };

        Collections.sort(obj, num);

        for (Student stu : obj) {
            System.out.println(stu);
        }

    }
}

// Sorting according to the name.

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// class Student {
// String name;
// int id;

// public Student(String name, int id) {
// this.name = name;
// this.id = id;
// }

// public String toString() {
// return "Student [name=" + name + ", Id=" + id + "]";
// }

// }

// public class Comparator_Example2 {
// public static void main(String[] args) {

// List<Student> obj = new ArrayList<>();
// obj.add(new Student("Vamsi", 31));
// obj.add(new Student("Ram", 22));
// obj.add(new Student("Ramesh", 15));
// obj.add(new Student("Suresh", 50));
// obj.add(new Student("Raju", 13));
// obj.add(new Student("Sai", 49));

// Comparator<Student> num = new Comparator<Student>() {
// public int compare(Student n1, Student n2) {
// return n1.name.compareTo(n2.name);
// }
// };

// Collections.sort(obj, num);

// for (Student stu : obj) {
// System.out.println(stu);
// }

// }
// }
