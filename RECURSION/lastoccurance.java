public class lastoccurance {
    public static int LastOccuranceWay2(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccuranceWay2(arr, i + 1, key);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int LastOccuranceWay1(int[] arr, int i, int key, int pos) {
        if (i == arr.length)
            return pos;
        if (arr[i] == key) {
            pos = i;
        }
        return LastOccuranceWay1(arr, i + 1, key, pos);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };

        // int index1 = LastOccuranceWay1(arr, 0, 5, -1);
        int index2 = LastOccuranceWay2(arr, 0, 5);

        if (index2 == -1) {
            System.out.println("Key not Found");
        } else {
            System.out.println("Last Occurance found at: " + index2);
        }
    }
}