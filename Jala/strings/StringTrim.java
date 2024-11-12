package strings;

public class StringTrim {
    public static void main(String[] args) {
        String str = "   Hello World   ";
        
        // Removing leading and trailing spaces
        String trimmed = str.trim();
        
        System.out.println("Trimmed string: '" + trimmed + "'");  // Output: 'Hello World'
    }
}

