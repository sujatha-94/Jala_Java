

package AccessModifiers.pkg.pkg1;

public class B {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println("Public Field: " + objA.publicField);  // Accessing public field
        objA.publicMethod();  // Accessing public method
    }
}

