// Aggregation is a special type of Association where one class contains another class as a member.
// It represents a "has-a" relationship.
// The contained object can exist independently.

/*
Real-life Example :-
Department has Employees.
Library has Books.
Team has Players.

If the department is closed, employees still exist.
*/

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String departmentName;
    Employee emp;

    Department(String departmentName, Employee emp) {
        this.departmentName = departmentName;
        this.emp = emp;
    }

    void display() {
        System.out.println(emp.name + " works in " + departmentName);
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Vamsi");
        Department obj2 = new Department("An IT Company.", obj1);
        obj2.display();
    }
}

/*
 * Department has an Employee.
 * Employee exists independently.
 * The same employee could belong to another department later.
 * 
 * This is Called Aggregation.
 */

// Note :- Aggregation is a specialized form of Association. Every aggregation
// is an association, but not every association is an aggregation.
