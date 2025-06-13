public class MergeSort {

    // ! function for printing the array
    public static void printArray(int nums[]) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void mergeSort(int nums[], int si, int ei) {

        // * base case
        if (si >= ei)
            return;

        // * kaam
        int mid = si + (ei - si) / 2; // same on (si+ei)/2

        mergeSort(nums, si, mid); //* left part */
        mergeSort(nums, mid + 1, ei); //* right part */
        merge(nums, si, mid, ei);
    }

    public static void merge(int nums[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // * iterator for left part
        int j = mid + 1; // * iterator for right part
        int k = 0; // * iterator for temp array

        while (i <= mid && j <= ei) {
            if (nums[i] < nums[j]) {
                temp[k] = nums[i];
                i++;
                k++;
            } else {
                temp[k] = nums[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= ei) {
            temp[k++] = nums[j++];
        }

        for (k = 0, i = si; k < temp.length; i++, k++) {
            nums[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}