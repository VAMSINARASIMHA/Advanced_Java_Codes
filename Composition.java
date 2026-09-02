// Composition is a strong Has-A relationship between two classes.

/*
The contained object strongly belongs to the container object.
If the whole object is destroyed, its parts should not exist independently in that relationship.
*/

// Real-world example: House and Room
// A House has Rooms.
// This is composition because the Room objects are strongly owned by the House.

class Room {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Room: " + name);
    }
}

class House {
    private Room r1;
    private Room r2;

    public House() {
        // House creates and owns its Rooms
        r1 = new Room("Bedroom");
        r2 = new Room("Kitchen");
        // Notice that the Room objects are created inside the House.
        // The House controls the creation and lifecycle of its Room objects.
    }

    public void display() {
        r1.show();
        r2.show();
    }
}

public class Composition {
    public static void main(String[] args) {
        House house = new House();
        house.display();
    }
}

// Note :- The easiest way to identify composition in Java is often :-
// One class creates and internally owns another object, controlling its
// lifecycle.

// In composition: One object owns another object, and the child object's
// lifecycle depends on the parent object.