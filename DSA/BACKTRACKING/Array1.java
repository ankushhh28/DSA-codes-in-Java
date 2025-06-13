public class Array1 {

    // ! Time Complexity--> O(n), Space Complexity--> O(1)
    public static void changeArray(int nums[], int idx, int val) {

        // * Base case */
        if (idx == nums.length) {
            System.out.print("Before Backtracking: ");
            printArray(nums);
            return;
        }
        // * Recursion */
        nums[idx] = val;
        changeArray(nums, idx + 1, val + 1);

        // * Backtracking step-> it always written after fn call */
        nums[idx] = nums[idx] - 2;
    }

    public static void printArray(int nums[]) {
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        System.out.print("After Backtracking: ");
        printArray(arr);
    }
}