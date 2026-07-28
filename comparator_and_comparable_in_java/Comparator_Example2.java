//Example code :- 1

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

                // if (n1.id > n2.id) {
                // return 1;
                // } else if (n1.id < n2.id) {
                // return -1;
                // } else {
                // return 0;
                // }

                // (or)

                return Integer.compare(n1.id, n2.id);
                // it is safer and avoids integer overflow.

            }
        };

        Collections.sort(obj, num);
        // Collections.sort(obj, num.reversed());

        for (Student stu : obj) {
            System.out.println(stu);
        }

    }
}

// Example code :- 2

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

// Example code :- 3

// Sorting according to the id Using "Lambda Expression" and "ternary Operator".

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

// Comparator<Student> num = (n1, n2) -> n1.id > n2.id ? 1 : -1;
// Collections.sort(obj, num);

// for (Student stu : obj) {
// System.out.println(stu);
// }

// }
// }

/*
 * // Example code :- 4
 * 
 * // Another Comparator Example.
 * 
 * import java.util.ArrayList;
 * import java.util.Collections;
 * import java.util.Comparator;
 * import java.util.List;
 * 
 * class Student {
 * String name;
 * int id;
 * 
 * public Student(String name, int id) {
 * this.name = name;
 * this.id = id;
 * }
 * 
 * public String toString() {
 * return "Student [name=" + name + ", Id=" + id + "]";
 * }
 * 
 * }
 * 
 * public class vvv {
 * public static void main(String[] args) {
 * 
 * List<Student> obj = new ArrayList<>();
 * obj.add(new Student("Vamsi", 31));
 * obj.add(new Student("Ram", 22));
 * obj.add(new Student("Ramesh", 15));
 * obj.add(new Student("Suresh", 50));
 * obj.add(new Student("Raju", 13));
 * obj.add(new Student("Sai", 49));
 * 
 * class Student_Data implements Comparator<Student> {
 * public int compare(Student s1, Student s2) {
 * return s1.id - s2.id;
 * }
 * }
 * 
 * Collections.sort(obj, new Student_Data());
 * 
 * for (Student stu : obj) {
 * System.out.println(stu);
 * }
 * 
 * }
 * }
 * 
 */