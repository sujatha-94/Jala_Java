package strings;

public class StringReplace {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // Replacing 'o' with 'a'
        String replaced = str.replace('o', 'a');
        
        System.out.println("Replaced string: " + replaced);  // Output: Hella Warld
    }
}

