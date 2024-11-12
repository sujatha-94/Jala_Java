package Static;
public class VariableDemo2 {
    
    // 2 Static Variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // 2 Instance Variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // Instance Method
    public void instanceMethod1() {
        // Printing static variables inside instance method
        System.out.println("Instance Method 1: Static Variable 1: " + staticVar1);
        System.out.println("Instance Method 1: Static Variable 2: " + staticVar2);
    }

    public static void main(String[] args) {
        VariableDemo2 obj = new VariableDemo2();
        obj.instanceMethod1(); // Calling instance method
    }
}


