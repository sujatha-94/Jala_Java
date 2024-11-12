package Operators;

public class SmallerLarger {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 30;

        if (num1 > num2) {
            System.out.println("Larger number: " + num1);
            System.out.println("Smaller number: " + num2);
        } else if (num1 < num2) {
            System.out.println("Larger number: " + num2);
            System.out.println("Smaller number: " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}

