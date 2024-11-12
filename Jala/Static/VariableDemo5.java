package Static;

public class VariableDemo5 {

    // 2 Static Variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // 2 Instance Variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void main(String[] args) {
        VariableDemo5 obj = new VariableDemo5();
        
        // Print all static and instance variables
        System.out.println("Main Method: Static Variable 1: " + staticVar1);
        System.out.println("Main Method: Static Variable 2: " + staticVar2);
        System.out.println("Main Method: Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Main Method: Instance Variable 2: " + obj.instanceVar2);
    }
}
