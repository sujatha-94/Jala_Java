package arrays;

public class ArrayOperations11 {
    public static int[] removeDuplicates(int[] arr) {
        int[] tempArr = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == tempArr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                tempArr[index++] = arr[i];
            }
        }
        int[] newArr = new int[index];
        System.arraycopy(tempArr, 0, newArr, 0, index);
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        int[] newArr = removeDuplicates(arr);
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
