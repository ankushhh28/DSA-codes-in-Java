public class insertionsort {

    public static void sorting(int arr[], int n) {
        for (int i = 1; i < n; i++) { // for calculate the number of passes
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) { // used for placing element of unsorted array at right in sorted part

                // swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

    }

    public static void main(String args[]) {

        int arr[] = { 5, 4, 1, 3, 2 };
        int n = arr.length;
        System.out.println("Before Sorting-");
        printarray(arr, n);
        sorting(arr, n);
        System.out.println("After Sorting-");
        printarray(arr, n);
    }

}
