package Static;
public class VariableDemo1 {
    
    // 2 Instance Variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // 2 Static Variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Static Method
    public static void staticMethod1(VariableDemo1 obj) {
        // Printing instance variables inside static method
        System.out.println("Static Method 1: Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Static Method 1: Instance Variable 2: " + obj.instanceVar2);
    }

    public static void main(String[] args) {
        VariableDemo1 obj = new VariableDemo1();
        staticMethod1(obj); // Passing object to static method
    }
}

    
