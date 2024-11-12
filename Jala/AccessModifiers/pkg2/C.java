
 package AccessModifiers.pkg2;

import AccessModifiers.pkg1.A;

class C extends A {
    public void accessProtected() {
        // Accessing protected fields and methods from parent class in a different package
        System.out.println("Protected Field from parent class: " + protectedField);
        protectedMethod();  // Calling protected method from parent class
    }

    public static void main(String[] args) {
        C objC = new C();
        objC.accessProtected();
    }
}
 
