public class selectionsort {
    public static void sorting(int arr[], int n) {

        for (int i = 0; i < n - 1; i++) { // this loop count no. of passes
            int minposition = i;
            for (int j = i + 1; j < n; j++) { // this loop decides min element index
                if (arr[minposition] > arr[j]) { // for descending order use '<' sign
                    minposition = j;
                }
            }
            // swap the minposition index with ith element
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
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
        printarray(arr, n);
        sorting(arr, n);
        System.out.println("After Sorting-");
        printarray(arr, n);
    }

}
