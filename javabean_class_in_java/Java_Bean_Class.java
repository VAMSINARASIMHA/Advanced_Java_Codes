// Defination :- A JavaBean is a Java class that follows a few standard rules so that its objects can be easily used by Java frameworks and tools.
// In Simple Words :- JavaBean Class is an Extended veersion of a POJO class. And It is also reffered as a Serializable POJO class.

/*

// Rules to follow for the JavaBean Class :- 
1) It should implement Serializable interface. (It is mandatory)
2) It should have a no-args constructor. (It is mandatory)
3) All properties(Instance variables) should be private. (It is mandatory)
4) It should have Getters and Setters(Public) in order to access the properties. (It is mandatory)

*/
package javabean_class_in_java;

public class Java_Bean_Class {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Ravi");
        emp.setSalary(56000.00);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}
