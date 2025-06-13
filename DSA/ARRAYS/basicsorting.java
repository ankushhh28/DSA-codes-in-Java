
public class bubble {
    public static void bubblesort(int arr[], int n) {

        for (int pass = 0; pass < n - 1; pass++) { // number of passes < n-1(which means n-2)
            boolean swap = false;
            for (int j = 0; j < n - 1 - pass; j++) { // every time comparison decreases by pass number
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (swap == false) { // this code is used for corner case> for sorted array to minimize time to O(n)
                break;
            }
        }

    }

    public static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int n = arr.length;
        System.out.println("Before Sorting-");
        printarray(arr, n);
        bubblesort(arr, n);
        System.out.println("Sorted Array-");
        printarray(arr, n);
    }
}
