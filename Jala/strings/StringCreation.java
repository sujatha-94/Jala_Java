package strings;

public class StringCreation {
    public static void main(String[] args) {
        // Using string literal
        String str1 = "Hello World";
        
        // Using new keyword
        String str2 = new String("Hello World");
        
        // Using char array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}

