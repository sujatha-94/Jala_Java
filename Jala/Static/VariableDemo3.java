package Static;

public class VariableDemo3 {
    
    // 2 Instance Variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // 2 Static Variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Static Method
    public static void staticMethod1(VariableDemo3 obj) {
        obj.instanceMethod1(); // Calling instance method in static method
    }

    // Instance Method
    public void instanceMethod1() {
        System.out.println("Instance Method 1: Instance Variable 1: " + instanceVar1);
    }

    public static void main(String[] args) {
        VariableDemo3 obj = new VariableDemo3();
        staticMethod1(obj); // Passing object to static method
    }
}
