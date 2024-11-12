package AccessModifiers;

public class B1 {
    public static void main(String[] args) {
        A1 objA = new A1();
        System.out.println("Default Field: " + objA.defaultField);  // Accessing default field
        objA.defaultMethod();  // Accessing default method
    }
}

