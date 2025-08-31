public class InsversionCount {

    // ! BRUTE FORCE APPROACH
    /*
     * public static int countInversionCount(int arr[]) {
     *  int count = 0;
     *  for (int i = 0; i < arr.length; i++) {
     *      for (int j = i + 1; j < arr.length; j++) {
     *          if (arr[i] > arr[j])
     *          count++;
     *      }
     *  }
     *  return count;
     * }
     */

    // Function to print the sorted array after merge sort
    public static void printArray(int nums[]) {
        System.out.print("Sorted array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // Function to count inversions in the array using modified merge sort
    public static int modifiedInversionCount(int arr[], int si, int ei) {
        // Base case: if subarray has 0 or 1 element, no inversions
        if (si >= ei)
            return 0;

        // Find mid index
        int mid = si + (ei - si) / 2;
        int invCount = 0;

        // Count inversions in left half
        invCount += modifiedInversionCount(arr, si, mid);
        // Count inversions in right half
        invCount += modifiedInversionCount(arr, mid + 1, ei);
        // Count cross inversions while merging
        invCount += merge(arr, si, mid, ei);

        return invCount;
    }

    // Merge two sorted subarrays and count cross inversions
    public static int merge(int arr[], int si, int mid, int ei) {
        int tempArray[] = new int[ei - si + 1]; // Temporary array to store merged result
        int invCount = 0;
        int i = si; // Pointer for left subarray
        int j = mid + 1; // Pointer for right subarray
        int idx = 0; // Index for tempArray

        // Merge left and right parts while counting inversions
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                // No inversion, directly copy element
                tempArray[idx] = arr[i];
                i++;
            } else {
                // Inversion found: arr[i] > arr[j]
                tempArray[idx] = arr[j];
                j++;
                // All remaining elements from i to mid in left subarray form inversions with
                // arr[j]
                invCount += (mid - i + 1);
            }
            idx++;
        }

        // Copy remaining elements from left subarray (if any)
        while (i <= mid) {
            tempArray[idx] = arr[i];
            i++;
            idx++;
        }

        // Copy remaining elements from right subarray (if any)
        while (j <= ei) {
            tempArray[idx] = arr[j];
            j++;
            idx++;
        }

        // Copy merged and sorted elements back to original array
        for (idx = 0, i = si; idx < tempArray.length; idx++, i++) {
            arr[i] = tempArray[idx];
        }

        return invCount; // Return total inversion count found in this merge
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        // Count and print total inversions in the array
        System.out.println("Inversion Count: " + modifiedInversionCount(arr, 0, arr.length - 1));
        printArray(arr);
    }
}
