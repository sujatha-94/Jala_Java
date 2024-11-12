package Operators;

public class IncrementDecrement {
    public static void incrementDecrement(int num) {
        System.out.println("Initial value: " + num);
        num++;
        System.out.println("After increment: " + num);
        num--;
        System.out.println("After decrement: " + num);
    }

    public static void main(String[] args) {
        incrementDecrement(10);
    }
}
