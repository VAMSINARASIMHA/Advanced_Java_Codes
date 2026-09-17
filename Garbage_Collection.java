// Defination :- Garbage Collection is the automatic process in Java that removes objects from memory (Heap) that are no longer reachable or useful.
// In Simple Words :- Garbage Collection = automatic cleanup of unused objects from Heap memory.
// In Garbage Collection :- Un-used Objects, Un-Referenced Objects, Annonimous Objects. and Garbage Collection Objects can be removed through MSC(Mark,Sweep,Compact) wise.
// Note :- we can call Garbage Collection in two ways i.e, ""System.gc();"" And ""Runtime.getRuntime().gc();"".

public class Garbage_Collection {

    public void finalized() {

        System.out.println("Finalized Method Is Called.");

    }

    public static void main(String[] args) {

        Garbage_Collection obj1 = new Garbage_Collection();
        Garbage_Collection obj2 = new Garbage_Collection();
        Garbage_Collection obj3 = new Garbage_Collection();

        obj1.finalized();
        obj1 = null; // Un-used Object.

        obj2 = obj3; // Un-Referenced Object.
        obj2.finalized();

        new Garbage_Collection(); // Annonimous Object.
        obj3.finalized();

        System.gc();
        // Runtime.getRuntime().gc();

    }
}

/*
 * 
 * public class vvv {
 * 
 * public void finalized() {
 * System.out.println("Finalized Method Is Called.");
 * }
 * 
 * public static void main(String[] args) {
 * 
 * Main obj1 = new Main();
 * obj1.finalized();
 * obj1 = null;
 * 
 * System.gc();
 * 
 * System.out.println("GC requested.");
 * }
 * }
 * 
 * 
 */
