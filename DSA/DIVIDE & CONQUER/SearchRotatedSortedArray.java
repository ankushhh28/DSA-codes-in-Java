public class SearchRotatedSortedArray {

    public static int search(int arr[], int si, int ei, int target) {
        // * Base case */
        if (si > ei)
            return -1;

        int mid = si + (ei - si) / 2;

        // * Best case */
        if (arr[mid] == target)
            return mid;

        // * mid on L1 */
        if (arr[si] <= arr[mid]) {
            // * case a: L1 left side */
            if ((arr[si] <= target) && (target <= arr[mid])) {
                return search(arr, si, mid - 1, target);
            } else {
                // * case b: L1 right side */
                return search(arr, mid + 1, ei, target);
            }
        }
        // * case 2: mid on L2 */
        else {
            // * case c: L2 right side */
            if ((target >= arr[mid]) && (target <= arr[ei])) {
                return search(arr, mid + 1, ei, target);
            } else {
                // * case d: L2 left side */
                return search(arr, si, mid - 1, target);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println("Target is at index : " + search(arr, 0, arr.length - 1, 0));
    }
}
