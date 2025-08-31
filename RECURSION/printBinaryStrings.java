public class printBinaryStrings {

    public static void binaryStrings(int n, int lastPlace, String str) {

        // * base case
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // * work we have to perform
        /*
            if (lastPlace == 0) {
                binaryStrings(n - 1, 0, str + "0");
                binaryStrings(n - 1, 1, str + "1");
            } else {
                binaryStrings(n - 1, 0, str + "0");
                }
        */

        // * Another way-> 0 ke liye to lastPlace 0 ho ya 1 dono me call krna hai but 1 ke liye sirf last place 0 ho tb hi call krna hai so isiliye 0 wali call common kr di hai or 1 wali ke liye ek special condition de di hai

        binaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            binaryStrings(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {
        binaryStrings(3, 0, "");
    }
}
