package arrays;


public class ArrayOperations1 {
    // Method to calculate the sum of the array
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the average of the array
    public static double averageArray(int[] arr) {
        int sum = sumArray(arr);  // Call the sumArray method
        return sum / (double) arr.length;  // Compute the average
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Average: " + averageArray(arr));  // Output the average
    }
}
