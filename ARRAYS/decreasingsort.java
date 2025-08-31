import java.util.Collections;
import java.util.Arrays;

public class decreasingsort {
    public static void printarray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer arr[] = { 1, 2, 3, 4, 5 };
        Arrays.sort(arr, Collections.reverseOrder());  // for reverse sorting
        printarray(arr);
        Arrays.sort(arr, 0, 3, Collections.reverseOrder()); // for reverse sorting in range
        printarray(arr);
    }

}
