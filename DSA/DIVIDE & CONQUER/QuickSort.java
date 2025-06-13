public class QuickSort {

    // ! Array for printing the elements
    public static void printArray(int arr[]) {
        System.out.print("Sorted Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        // * Base case-> when single element or si crosses ei */
        if (si >= ei)
            return;

        // * it gives the correct position of pivot index */
        int pivotIdx = partition(arr, si, ei);

        // * apply quick sort to the left part */
        quickSort(arr, si, pivotIdx - 1);
        // * apply quick sort to the right part */
        quickSort(arr, pivotIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        // * choose last element as pivot */
        int pivot = arr[ei];

        // * iterator for swapping(-1) */
        int i = si - 1;

        // * compare lessser elements with pivot and swapp */
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // * after all swapping move pivot to the correct position */
        i++;
        int temp = arr[i];
        arr[i] = pivot; // * pivot moved to ith index */
        arr[ei] = temp;
        // Agr pivot ko arr[ei] set kiya jaye, aur baad mein pivot = temp; likh diya
        // —lekin pivot ek local variable hai, isse array arr[] ke elements par koi asar
        // nahi padega.
        return i; // * returning pivot index */
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
