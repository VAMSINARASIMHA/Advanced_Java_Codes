package collection_framework_in_java;
//Special Methods in Stack.
import java.util.Stack;
public class Stack_Class_2 
{
    public static void main(String[] ar)
    {
        Stack<String> obj = new Stack<>();
        obj.push("Python Book");       // Index :- 0
        obj.push("Pandas Book");       // Index :- 1
        obj.push("Numpy Book");        // Index :- 2
        obj.push("Matplotlib Book");   // Index :- 3
        obj.push("Git Commands Book"); // Index :- 4
        //Note:- Here push method will pushes the books from Bottom to Top.

        for (String i : obj)
        {
            System.out.println(i); 
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(obj.peek()); // Here, peek() Method will shows the last Book in a stack. 
        
        System.out.println();

        System.out.println(obj.pop()); // Here, pop() Method will removes and print the last Book in a stack.

        System.out.println();

        System.out.println(obj);

        System.out.println();

        System.out.println(obj.peek()); 

        System.out.println();

        System.out.println(obj.search("Python Book"));       // 4
        System.out.println(obj.search("Pandas Book"));       // 3
        System.out.println(obj.search("Numpy Book"));        // 2
        System.out.println(obj.search("Matplotlib Book"));   // 1 
        System.out.println(obj.search("Git Commands Book")); // Here it is removed using pop() Method so it returns "-1".

        // for(int i=0; i<obj.size();i++)
        // {
        //     System.out.println("Index : "+i+"--->"+obj.get(i));
        // }
    }    
}
//Note :- The Behaviour or Functionality of add() Method and push() Method are same.
//add() and push() store the elements in the same order. and both follows same index order.
//the storage order is the same for add() and push(). But, The difference is that stack operations (push, pop, peek, search) treat the last element as the top of the stack.



//Stack was introduced in Java 1.0 version. and it is a legacy class.
// In Stack, it allows null values and duplicate values and it will follows the insertion order and it will not follows the sorted order. and it is synchronized.