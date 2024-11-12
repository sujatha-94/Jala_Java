package arrays;

public class ArrayOperations15 {
    public static int findMissingNumber(int[] arr) {
        int expectedSum = 100 * (100 + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10}; // Missing 7
        System.out.println("Missing number: " + findMissingNumber(arr));
    }
}
