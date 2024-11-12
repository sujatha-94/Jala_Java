package inheritance;

class C extends B {
    // Specific method for class C
    public void methodC1() {
        System.out.println("Method C1 from class C");
    }

    // Specific method for class C
    public void methodC2() {
        System.out.println("Method C2 from class C");
    }

    // Overriding the method from class B
    @Override
    public void overriddenMethod() {
        System.out.println("Overridden method from class C");
    }
}

