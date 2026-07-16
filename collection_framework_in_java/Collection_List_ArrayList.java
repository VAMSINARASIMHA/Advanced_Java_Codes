package collection_framework_in_java;


//Defination of ArrayList:- ArrayList is a class in the Java Collection Framework that implements the List interface.
//Unlike arrays, ArrayList does not have a fixed size.
//List Interface: Implemented by classes such as ArrayList, LinkedList, and Vector. 

//Using List Interface And ArrayList Class.
// import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
public class Collection_List_ArrayList
{
    @SuppressWarnings("unused")
    public static void main(String[] args) 
    {
        // A List stores elements in insertion order.
        // Default Constructor with default Capacity of 0. after some insertion Default Constructor with Initial Capacity of 10.       
        List<Integer> nums = new ArrayList<Integer>(); // Here List can contain duplicate values. And List is an interface and ArrayList is a class which implements List interface. So we can create an object of ArrayList class and assign it to a List reference variable.
        //Constructor with Initial Capacity of 200. 
        List<Integer> nums1 = new ArrayList<Integer>(200); //here, we can initialize the initialCapacity of 200 within the paranthesis for an ArrayList class.  
        nums.add(23);
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(12);
        nums.add(26);
        nums.add(1);
        nums.add(13);
        nums.add(4);
        nums.set(8, 199);


        System.out.println(nums.get(4));
        System.out.println(nums.size());
        System.out.println(nums.contains(13));
        System.out.println(nums.contains(133));
        System.out.println(nums.indexOf(26)); // Here indexOf() method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(nums.indexOf(27));
        nums.remove(4);
        nums.add(4, 44);
        
        
        
        System.out.println();
        System.out.println();
        
        
        
        for(int n:nums)
        {
            System.out.println(n);
        }
                    //(Or)
        // System.out.println(nums);
                    //(Or) 
        // for(int i=0;i<nums.size();i++)
        // {
        //     System.out.println(nums.get(i));               
        // }



        System.out.println();
        System.out.println();
        System.out.println();


        nums.addAll(0, nums);
        System.out.println(nums + "  ");

        System.out.println();

        nums.removeAll(nums);          //(or) Here, we can use this also """nums.clear();"""
        System.out.println(nums);
        
        // Collections.synchronizedList(nums);  //now, it will be same as like Vector in Synchronization.
    }
}  
//Note :- Here, In this "ArrayList" capacity() Method is not available. But in "Vector" capacity() Method is available. 
//Reference = List              and                  Object Creation = ArrayList.










//converting an array into an ArrayList
// import java.util.*;
// public class Array_To_ArrayList 
// {
//     public static void main(String[] args)
//     {
//         Integer[] arr ={10,20,30};  // (or) Integer[] arr = new Integer[] {10,20,30}; is also good 
//         ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(arr));
//         ar.add(23);
//         System.out.println(ar);
//         System.out.println(ar.size());
//     }
// }










// Using Collection Interface And ArrayList Class.

// import java.util.ArrayList;
// import java.util.Collection;
// class vv
// {
//     public static void main(String[] args) 
//     {
//         Collection<Integer> num = new ArrayList<Integer>(); // Here Collection can contain duplicate values. And Collection is an interface and ArrayList is a class which implements Collection interface. So we can create an object of ArrayList class and assign it to a Collection reference variable.
//         num.add(23);
//         num.add(1);
//         num.add(3);
//         num.add(2);
//         num.add(12);
//         num.add(26);
//         num.add(1);
//         num.add(13);
//         num.add(4);
        
        
//         for(int n:num)
//         {
//             System.out.println(n);        // Here, we can Directly use """System.out.println(num);""". and also without using this for loop here it will works perfectly. 
//         }


//         System.out.println();
//         System.out.println();
//         System.out.println(num.size());
        



//         Collection<String> nums = new ArrayList<String>(); // here we can use List in place of Collection.
//         nums.add("vamsi");
//         nums.add("Ram");
//         nums.add("Ravi");
//         nums.add("Raju");
//         nums.add("Avinash");
//         nums.add("Krishna");
//         nums.add("vamsi");
//         nums.add("Charan");
//         nums.add("Shiva");

        

//         for(String n:nums)
//         {
//             System.out.println(n);
//         }
        
//         System.out.println(nums.size()); 
//     }
// }

//Here,      Reference = Collection                          and                        Object = ArrayList.   










//Note:-     """The Collection API was introduced in Java 1.2"""
// 1) In This ArrayList, Advantage:- it will increases the Memory capacity of 50% wise like(10,15,22,33....) Only so,It saves the memory, But In Vector ---> DisAdvantage:- it Will increases the Memory Capacity 100% wise like(10,20,40,80,....) so, It Allocates More Memory.
// 2) In This ArrayList, It is not synchronized (not thread-safe by default). But In Vector It is Synchronized(It is Thread-safe by default). 
// 3) In This ArrayList, it will allows Duplicates and null values. and also It maintains insertion order. and also It Provides fast random access using indexes.(starts from index 0).
// 4) In This ArrayList, It stores elements in a dynamic array, (or) It uses a dynamic (resizable) array internally.
// 5) In This ArrayList, the Default Capacity is """0""". And the Initial Capacity is """10""".
// 6) In This ArrayList, It maintains insertion order, But It will not Maintain in the Sorted order.
// 7) ArrayList is generally faster than Vector because it is not synchronized.
// 8) Performance of Vector is Slower.
// 9) ArrayList was Introduced in Java 1.2    And Vector was Introduced in Java 1.0
// 10) ArrayList is not a Legacy Class.
// 11) Vector is a Legacy Class.
// A Legacy Class is an older Java class that existed before the Collections Framework.


//Note:-
// 1) In This Vector, the Default Capacity is """10""". And the Initial Capacity is """10""".
// 2) In This Vector, it will allows Duplicates and null values. and also It maintains insertion order,But It will not Maintain in the Sorted order. and also It Provides fast random access using indexes.(starts from index 0).

//Note :- Here, ArrayList And Vector are Good for storing and retrieving the data.



