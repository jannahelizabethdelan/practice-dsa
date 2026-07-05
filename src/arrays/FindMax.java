package arrays;

public class FindMax {

    // ? Returns the maximum value in the given array.

    // ? Time complexity: O(n) — every element is visited exactly once.
    // ? Space complexity: O(1) — no additional data structure is used.

    // # @param arr the input array assumed non-null and non-empty
    // # @return max the largest value found in arr

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {8, 4, 10, 1, 5, 9, 2, 6, 3, 7};
        System.out.println(findMax(numbers));
    }
}