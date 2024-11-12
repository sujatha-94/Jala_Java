package Operators;
public class EqualityCheck {
    public static void checkEquality(int x, int y) {
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
    }

    public static void main(String[] args) {
        checkEquality(15, 20);
    }
}

