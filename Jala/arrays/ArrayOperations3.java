package arrays;

public class ArrayOperations3 {
    public static boolean containsValue(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Contains 3? " + containsValue(arr, 3));
    }
}

