package strings;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello World Java";
        
        // Splitting string by space
        String[] words = str.split(" ");
        
        // Printing all words
        for (String word : words) {
            System.out.println(word);
        }
    }
}

