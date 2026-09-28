package javabean_class_in_java;

import java.io.Serializable;

public class Employee implements Serializable {

    private int Id;
    private String Name;
    private double salary;

    public Employee() { // It's not mandatory, By Default java will provides this constructor.
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
