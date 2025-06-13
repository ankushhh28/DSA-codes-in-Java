public class countingsort {
    public static void countsort(int arr[], int n) {

        int count[] = new int[maximum(arr, n) + 1]; // auxilliary array for counting the frequency of elements
        for (int i = 0; i < n; i++) {
            count[arr[i]]++; // it insert the frequency of elements of arr[] at their index numbers
        }

        int j = 0;

        for (int i = 0; i < count.length; i++) { // it sorts the elementin the main array using count array
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static int maximum(int arr[], int n) { // function for calculating the maximum index value
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void printarray(int arr[], int n) { // function for printing value
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 2, 4, 3, 1, 6, 3, 4 };
        int n = arr.length;
        System.out.println("Before Sorting- ");
        printarray(arr, n);
        countsort(arr, n);
        System.out.println("After Sorting");
        printarray(arr, n);

    }

}
