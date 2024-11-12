package inheritance;

class B1 extends A1 {
    // Instance variable for class B
    public String instanceVar = "Instance variable in class B";

    @Override
    public void displayInstanceVar() {
        System.out.println(instanceVar);
    }
}
