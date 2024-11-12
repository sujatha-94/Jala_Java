package inheritance;

public class Main {
    public static void main(String[] args) {
        // Creating objects for each class
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Calling methods from class A using object of class A
        objA.methodA1();
        objA.methodA2();
        objA.overriddenMethod();  // Calls method from class A

        // Calling methods from class B using object of class B
        objB.methodB1();
        objB.methodB2();
        objB.overriddenMethod();  // Calls overridden method from class B

        // Calling methods from class C using object of class C
        objC.methodC1();
        objC.methodC2();
        objC.overriddenMethod();  // Calls overridden method from class C

        // Calling overridden methods with superclass reference
        A refB = new B();  // Reference of type A pointing to object of type B
        A refC = new C();  // Reference of type A pointing to object of type C

        refB.overriddenMethod();  // Calls overridden method in class B
        refC.overriddenMethod();  // Calls overridden method in class C
    }
}

