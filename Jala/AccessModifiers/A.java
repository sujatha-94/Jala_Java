package AccessModifiers;


class A {
    // Private field
    private int privateField = 10;

    // Private method
    private void privateMethod() {
        System.out.println("Private method called");
    }

    public void printDetails() {
        System.out.println("Private Field: " + privateField);
        privateMethod();
    }

    public static void main(String[] args) {
        A objA = new A();
        objA.printDetails();  // This can access private fields and methods

        // Direct access to private field and method will cause errors
        // System.out.println(objA.privateField);  // Error: privateField has private access
        // objA.privateMethod();  // Error: privateMethod() has private access
    }
}

