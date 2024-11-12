package arrays;

public class ArrayOperations6 {
    public static int[] insertElement(int[] arr, int element, int position) {
        int[] result = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == position) {
                result[j++] = element;
            }
            result[j] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = insertElement(arr, 99, 2);
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}