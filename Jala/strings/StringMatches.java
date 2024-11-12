package strings;

public class StringMatches {
    public static void main(String[] args) {
        String str = "Hello123";
        
        // Matching against a regular expression
        boolean isMatch = str.matches("[A-Za-z]+[0-9]+");
        
        System.out.println("Does the string match the pattern? " + isMatch);  // Output: true
    }
}
