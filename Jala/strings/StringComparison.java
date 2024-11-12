package strings;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        
        // equals
        System.out.println("Equals: " + str1.equals(str2));  // Output: false
        
        // equalsIgnoreCase
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));  // Output: true
        
        // startsWith
        System.out.println("Starts with 'Hello': " + str1.startsWith("Hello"));  // Output: true
        
        // endsWith
        System.out.println("Ends with 'World': " + str1.endsWith("World"));  // Output: true
        
        // compareTo
        System.out.println("Compare To: " + str1.compareTo(str2));  // Output: Positive number (because 'H' > 'h')
    }
}

