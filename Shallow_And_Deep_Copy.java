class vam
{
    int a;
    int b;
}
public class Shallow_And_Deep_Copy
{
    public static void main(String[] args) 
    {
        /* 
        //step:-1 shallow copy
        vam obj = new vam();
        obj.a=1;
        obj.b=2;

        vam obj1 = obj;
        obj1.a=10;
        */

        //step:-2 deep copy
        vam obj = new vam();
        obj.a=1;
        obj.b=2;

        vam obj1 = new vam();
        obj1.a=obj.a;
        obj1.b=obj.b;
        obj1.a=101;


        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj1.a);
        System.out.println(obj1.b);
    }
}