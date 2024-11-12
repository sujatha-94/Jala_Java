package arrays;

public class ArrayOperations4 {
    public static int[] removeElement(int[] arr, int target) {
        int[] result = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != target) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = removeElement(arr, 3);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

