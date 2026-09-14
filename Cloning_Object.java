class Cloned_Object implements Cloneable {

    int id;
    String name;

    Cloned_Object(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Cloning_Object {

    public static void main(String[] args) throws CloneNotSupportedException {

        Cloned_Object obj1 = new Cloned_Object(101, "Vamsi");
        Cloned_Object obj2 = (Cloned_Object) obj1.clone();

        System.out.println("Original object:");
        System.out.println(obj1.id);
        System.out.println(obj1.name);

        System.out.println("\nCloned object:");
        System.out.println(obj2.id);
        System.out.println(obj2.name);
    }
}
