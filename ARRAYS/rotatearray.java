public class rotatearray {
    public static void reverse(int arr[], int i, int j) {
        // REVERSE ARRAY 
        while (i <= j) {
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    public static void rotate(int arr[], int k) {
        int n = arr.length;
        k= k%n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 3, 1, 4, 2, 7, 9 };
        int k = 3;

        System.out.println("Before Rotate-");
        printarray(arr);
        rotate(arr, k);
        System.out.println("After Rotate-");
        printarray(arr);
    }

}
