package AccessModifiers.pkg2;


import AccessModifiers.pkg1.A;

public class D {
    public static void main(String[] args) {
        A objA = new A();
        // Cannot access protected field or method without inheritance
        // System.out.println(objA.protectedField);  // Error: protectedField has protected access
        // objA.protectedMethod();  // Error: protectedMethod() has protected access
    }
}

