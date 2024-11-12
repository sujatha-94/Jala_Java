package strings;
public class StringSubstring {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // Extracting substring
        String substr = str.substring(6, 11);  // From index 6 to index 11 (excluding 11)
        
        System.out.println("Substring: " + substr);  // Output: World
    }
}

