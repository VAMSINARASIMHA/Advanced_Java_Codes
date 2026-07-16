package collection_framework_in_java;

import java.util.*;
//Defination:- Vector is a legacy class in the Java Collection Framework that implements the List interface
//Vector is a legacy class that implements the List interface and stores elements in a synchronized dynamic array. It maintains insertion order, allows duplicate and null elements, and is thread-safe.
//And it was Introduced in JDK 1.0 (before the Collection Framework).
public class Vector_Class
{
    public static void main(String[] args) 
    {
        Vector<Integer> nums = new Vector<Integer>();  
        nums.add(393);
        nums.add(1);
        nums.add(26);
        nums.add(1);
        nums.add(13);
        
        System.out.println(nums.capacity());
        System.out.println(nums.firstElement());
        System.out.println(nums.lastElement());
        
       
        System.out.println();
        System.out.println();
        
        
        for(int n:nums)
        {
            System.out.println(n);    //through this for loop.
        }
        System.out.println();
        System.out.println(nums);  // (Or) Directly prints the nums.
    }
}  


