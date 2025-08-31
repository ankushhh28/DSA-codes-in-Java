public class findSubsetsofString {

    public static void printSubsets(String str, String ans, int idx) {
        // * Base case-> to print ans when string ends
        if (idx == str.length()) {
            if (ans.length() == 0)
                System.out.print(null + " ");
            else
                System.out.print(ans + " ");
            return;
        }

        // * Recursion work-> check that adding to subset or not

        // * choice-> yes
        printSubsets(str, ans + str.charAt(idx), idx + 1);
        // * choice-> no
        printSubsets(str, ans, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.print("Subsets of (" + str + ") : ");
        printSubsets(str, "", 0);
    }
}
