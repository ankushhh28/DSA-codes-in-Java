public class practiseQuestion {
    public static void printArray(String str[]) {
        System.out.print("Sorted Stirng: [ ");
        for (String i : str) {
            System.out.print(i + " ");
        }
        System.out.print("]");
    }

    public static Boolean isAlphabeticallySmaller(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            return true;
        }
        return false;
    }

    public static String[] merge(String str1[], String str2[]) {
        int m = str1.length;
        int n = str2.length;
        String str3[] = new String[m + n];

        int i = 0; // * iterator for left part array */
        int j = 0; // * iterator for right part array */
        int idx = 0; //* iterator for str3 array */

        while (i < m && j < n) {
            if (isAlphabeticallySmaller(str1[i], str2[j])) {
                str3[idx] = str1[i];
                i++;
            } else {
                str3[idx] = str2[j];
                j++;
            }
            idx++;
        }
        // * for the remaining element of str1 */
        while (i < m) {
            str3[idx] = str1[i];
            i++;
            idx++;
        }
        // * for the remaining element of str2 */
        while (j < n) {
            str3[idx] = str2[j];
            j++;
            idx++;
        }

        return str3;
    }

    public static String[] mergeSort(String str[], int si, int ei) {
        // * base case */
        if (si == ei) {
            String[] singleStr = { str[si] };
            return singleStr;
        }

        // * calculate mid */
        int mid = si + (ei - si) / 2;

        // * left sorted part */
        String str1[] = mergeSort(str, si, mid);
        // * right sorted part */
        String str2[] = mergeSort(str, mid + 1, ei);

        // * merging both left and right sorted part */
        String str3[] = merge(str1, str2);
        return str3;

    }

    public static void main(String[] args) {
        String str[] = { "sun", "earth", "mars", "mercury" };
        printArray(mergeSort(str, 0, str.length - 1));
    }
}