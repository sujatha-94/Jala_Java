package arrays;

public class ArrayOperations5 {
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copiedArr = copyArray(arr);
        for (int num : copiedArr) {
            System.out.print(num + " ");
        }
    }
}

