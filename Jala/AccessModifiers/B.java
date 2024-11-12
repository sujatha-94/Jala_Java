package AccessModifiers;



class B extends A {
    public void tryAccessPrivate() {
        // Cannot access private fields or methods from class A directly in class B
        // System.out.println(privateField);  // Error: privateField has private access
        // privateMethod();  // Error: privateMethod() has private access
    }
}

