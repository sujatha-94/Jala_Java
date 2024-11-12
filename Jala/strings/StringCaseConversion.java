package strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // Converting to uppercase
        String upper = str.toUpperCase();
        System.out.println("Uppercase: " + upper);  // Output: HELLO WORLD
        
        // Converting to lowercase
        String lower = str.toLowerCase();
        System.out.println("Lowercase: " + lower);  // Output: hello world
    }
}

