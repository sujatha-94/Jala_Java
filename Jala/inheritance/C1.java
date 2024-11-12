package inheritance;

class C1 extends B1 {
    // Instance variable for class C
    public String instanceVar = "Instance variable in class C";

    @Override
    public void displayInstanceVar() {
        System.out.println(instanceVar);
    }
}

