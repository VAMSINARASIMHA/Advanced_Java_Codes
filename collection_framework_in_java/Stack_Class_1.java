//Defination :- A Stack in Java is a linear data structure that follows the LIFO (Last In, First Out) principle.
//Another Defination in a Simple Way :- Stack is a class in java which implements the list interface and extends the Vector class and also represents the LIFO principle. 

//LIFO means the last element inserted is the first element removed.
//Stack extends the Vector class, so it inherits all methods of Vector.
//In Stack also, it Will increases the Memory Capacity 100% wise like(10,20,40,80,....) so, It Allocates More Memory.
//In Stack also, the Default Capacity is """10""". And the Initial Capacity is """10""".





//Normal Methods in Stack.
package collection_framework_in_java;

import java.util.Stack;
public class Stack_Class_1 
{
    public static void main(String[] ar)
    {
        Stack<String> books = new Stack<>();  //Here, we cannot initialize or assign the initial capacity of (15,20,24,26... etc) for the Stack """Stack<String> stk = new Stack<>(24);""" .  In java, It always provides only a empty stack with a initial capacity "10". 
        System.out.println(books.capacity());


        System.out.println();


        books.add("Java Book"); //0-Index
        books.add("Mysql Book"); //1-Index
        books.add("Bash Book"); //4-Index
        books.add("Hibernate Book"); //5-Index
        books.add(2,"Spring Book"); //2-Index
        books.add(3,"SpringBoot Book"); //3-Index
        System.out.println(books.size());
        System.out.println(books);



        System.out.println();



        // books.remove(4);
        // System.out.println(books.size());
        // System.out.println(books);


        System.out.println();


        books.set(4, "Docker"); // if i want to replace "Docker" instead of "Bash Book", we use set() Method. 
        System.out.println(books);

        books.add(5,"Bash Book"); 
        System.out.println(books);

    }    
}


//Here, add() Returns a boolean value.
/* 
//Example :-
boolean result = books.add("Docker");
System.out.println(result);
*/




//But Here, push() Returns the element that was pushed. 
/*
//Example :- 
String book = books.push("Docker");
System.out.println(book);
*/



