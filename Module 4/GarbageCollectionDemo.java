public class GarbageCollectionDemo {
    public static void main(String[] args) {
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();
        obj1 = null;
        obj2 = null;
        System.gc();
        System.out.println("Garbage Collection Requested");
    }
    protected void finalize() {
        System.out.println("Object Garbage Collected");
    }
}