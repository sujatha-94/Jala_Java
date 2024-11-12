package basics;
public class Basics1 {
    // Class definition
    public static class Animal {
        String name;
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.setName("Lion");
        System.out.println("The animal's name is: " + myAnimal.getName());
    }
}
