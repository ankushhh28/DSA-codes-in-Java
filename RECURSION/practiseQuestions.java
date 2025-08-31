public class practiseQuestions {

    // ! QUESTION -> 01

    public static void printAllOccurances(int nums[], int idx, int key) {
        // * base case
        if (idx == nums.length)
            return;
        if (nums[idx] == key) {
            System.out.print(idx + " ");
        }
        printAllOccurances(nums, idx + 1, key);
    }

    // ! QUESTION -> 02

    public static void numberToString(int n) {
        String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        // * base case
        if (n == 0)
            return;
        int lastDigit = n % 10;
        numberToString(n / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    // ! QUESTION -> 03

    public static int lengthOfString(String str) {
        // * base case
        if (str.equals(""))
            return 0;
        return 1 + lengthOfString(str.substring(1));
    }

    // ! QUESTION -> 04

    public static int countContiguousSubstring(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int start = i;
            for (int end = str.length() - 1; end >= start; end--) {
                if (str.charAt(start) == str.charAt(end)) {
                    count++;
                }
            }
        }
        return count;
    }

    // ! QUESTION -> 05

    public static void TowerOfHanoi(int n, char src, char helper, char dest) {
        // base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        TowerOfHanoi(n - 1, src, dest, helper); // move n-1 disks from src to helper
        System.out.println("Move disk " + n + " from " + src + " to " + dest); // move nth disk to dest
        TowerOfHanoi(n - 1, helper, src, dest); // move n-1 disks from helper to dest
    }

    public static void main(String[] args) {

        // ! Question 1
        printAllOccurances(new int[] { 3, 2, 4, 5, 6, 2, 7, 2, 2 }, 0, 2);
        System.out.println();

        // ! Question 2
        numberToString(1234);
        System.out.println();

        // ! Question 3
        System.out.print("Length of String: " + lengthOfString("abcdefgh"));
        System.out.println();

        // ! Question 4
        System.out.println("Total Count of Contiguous Substrings: " + countContiguousSubstring("abcbac"));

        // ! Question 5
        TowerOfHanoi(3, 'A', 'B', 'C');

    }
}
