package Static;

public class VariableDemo6 {

    // 2 Static Variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // 2 Instance Variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // Static Methods
    public static void staticMethod1() {
        System.out.println("Static Method 1: Static Variable 1: " + staticVar1);
    }

    public static void staticMethod2() {
        System.out.println("Static Method 2: Static Variable 2: " + staticVar2);
    }

    // Instance Methods
    public void instanceMethod1() {
        System.out.println("Instance Method 1: Instance Variable 1: " + instanceVar1);
    }

    public void instanceMethod2() {
        System.out.println("Instance Method 2: Instance Variable 2: " + instanceVar2);
    }

    public static void main(String[] args) {
        VariableDemo6 obj = new VariableDemo6();

        // Call static and instance methods in main
        staticMethod1();
        staticMethod2();
        
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}

