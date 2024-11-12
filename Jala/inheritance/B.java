package inheritance;

class B extends A {
    // Specific method for class B
    public void methodB1() {
        System.out.println("Method B1 from class B");
    }

    // Specific method for class B
    public void methodB2() {
        System.out.println("Method B2 from class B");
    }

    // Overriding the method from class A
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method from class B");
    }
}
