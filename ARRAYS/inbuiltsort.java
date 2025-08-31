import java.util.Arrays;

public class inbuiltsort {
    public static void printarray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void inbuiltsorting(int arr[], int n) {
        Arrays.sort(arr); // for using this in-built fn we need to add Arrays class in util package
        System.out.println("After Sorting-");
        printarray(arr, n);
    }

    public static void sort_in_range(int arr[], int n) {// for sorting in range of indexes

        System.out.println("Sorting in Range-");
        Arrays.sort(arr, 0, 4); // note that end index is excluded from sorting
        // this means sorting is done for 23,12,45,21
        printarray(arr, n);
    }

    public static void main(String args[]) {

        int arr[] = { 23, 12, 45, 21, 32, 17, 27 };
        int n = arr.length;
        System.out.println("Before Sorting-");
        printarray(arr, n);

        sort_in_range(arr, n);
        inbuiltsorting(arr, n);
    }

}
