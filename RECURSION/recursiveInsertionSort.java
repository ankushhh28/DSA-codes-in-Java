public class recursiveInsertionSort {

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int arr[], int i, int n) {

        if (i == n) {
            return;
        }

        int j = i;
        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
            j--;
        }
        insertionSort(arr, i + 1, n);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        System.out.print("Before Sorting: ");
        printArray(arr);
        insertionSort(arr, 0, arr.length);
        System.out.print("After Sorting:  ");
        printArray(arr);

    }
}
