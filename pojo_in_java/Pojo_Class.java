// POJO :- Plain Old Java Object.
// Defination :- A POJO is simply a normal Java class used to represent data without requiring it to extend or implement some special framework class.
// In Simple Words :- It is a simple java object, which is not bound by any special restriction.

/*
* // Rules to follow for the POJO class :-
* // +ve Rules to follow :-
* 1) Class Must be Public.
* 2) It is recommended to make the properties("Instance Variables") as "private" for the better Security purpose.
* 3) It can have Getters and Setters in order to access the properties.
* 
* // -ve Rules to follow :-
* 1) It Shouldn't Extend any classes.
* 2) It Shouldn't implement any interfaces.
* 3) It Shouldn't have any annotations specified.
* 
*/

package pojo_in_java;

public class Pojo_Class {

    public static void main(String[] args) {

        Employee obj = new Employee(101, "Vamsi", 65000);

        System.out.println(obj.getId());
        System.out.println(obj.name);
        System.out.println(obj.getSalary());
    }
}