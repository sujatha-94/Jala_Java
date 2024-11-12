

package AccessModifiers.pkg.pkg2;

import AccessModifiers.pkg.pkg1.A;

public class C {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println("Public Field: " + objA.publicField);  // Accessing public field from different package
        objA.publicMethod();  // Accessing public method from different package
    }
}

