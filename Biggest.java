public class Biggest {

    // Method to find the largest element in an array
    public static int largest(int[] arr) {
        int max = arr[0];  // Initialize max to the first element

        // Traverse array elements from the second element
        // and compare every element with the current max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if a larger element is found
            }
        }

        return max;  // Return the largest element
    }

    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 9808,567654567};  // Array of integers
        System.out.println(largest(arr));  // Print the largest element in the array
    }
}


