package AccessModifiers.pkg1;


class B {
    public static void main(String[] args) {
        A objA = new A();
        System.out.println("Protected Field: " + objA.protectedField);  // Accessing protected field
        objA.protectedMethod();  // Accessing protected method
    }
}
