package generics_in_java;

class India<I> {
    I val;

    India(I val) {
        this.val = val;
    }

    public void display() {
        System.out.println("Type of data Passed Here 'I' is : " + val.getClass().getName());
    }

    public I getObj() {
        return val;
    }

    // @Override
    public String toString() {
        return "[val=" + val + "]";
    }

}

public class Generic_Classes_Code2 {
    public static void main(String[] args) {
        India<Integer> obj1 = new India<>(21);
        System.out.println(obj1);
        obj1.display();
        System.out.println(obj1.getObj());

        System.out.println();
        System.out.println();

        India<String> obj2 = new India<>("Vamsi");
        System.out.println(obj2);
        obj2.display();
        System.out.println(obj2.getObj());

    }
}
