package inheritance;

public class Main1 {
    public static void main(String[] args) {
        // Creating objects for each class
        A1 objA = new A1();
        B1 objB = new B1();
        C1 objC = new C1();

        // Calling displayInstanceVar from class A using object of class A
        objA.displayInstanceVar();  // Output: Instance variable in class A

        // Calling displayInstanceVar from class B using object of class B
        objB.displayInstanceVar();  // Output: Instance variable in class B

        // Calling displayInstanceVar from class C using object of class C
        objC.displayInstanceVar();  // Output: Instance variable in class C

        // Calling displayInstanceVar with superclass reference
        A refB = new B();  // Reference of type A pointing to object of type B
        A refC = new C();  // Reference of type A pointing to object of type C

        refB.displayInstanceVar();  // Output: Instance variable in class B
        refC.displayInstanceVar();  // Output: Instance variable in class C
    }
}
