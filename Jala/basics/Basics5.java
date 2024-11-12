package basics;
public class Basics5 {
  
        // Global variable
        static int number = 100;
    
        public static void main(String[] args) {
            // Local variable with the same name as the global variable
            int number = 50;
    
            System.out.println("Local variable: " + number); // Prints local variable
            System.out.println("Global variable: " + Basics5.number); // Prints global variable
        }
    }
    
