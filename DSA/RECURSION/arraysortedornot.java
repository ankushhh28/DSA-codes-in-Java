public class arraysortedornot {
    public static boolean isSortedOrnot(int arr[], int i) {
        if (i == arr.length - 1) // base case
            return true;
        if (arr[i] > arr[i + 1])
            return false;

        return isSortedOrnot(arr, i + 1);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };

        if (isSortedOrnot(arr, 0))
            System.out.println("Array is Sorted");
        else
            System.out.println("Array is not Sorted");

    }
}
