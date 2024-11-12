package Static;

public class VariableDemo4 {
    
    // 2 Instance Variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // 2 Static Variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Instance Method
    public void instanceMethod1() {
        staticMethod1(); // Calling static method in instance method
    }

    // Static Method
    public static void staticMethod1() {
        System.out.println("Static Method 1: Static Variable 1: " + staticVar1);
    }

    public static void main(String[] args) {
        VariableDemo4 obj = new VariableDemo4();
        obj.instanceMethod1(); // Calling instance method that calls static method
    }
}

