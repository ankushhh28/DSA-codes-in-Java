public class powerof2ornot {
    public static boolean powerof2(int n) {
        if (n <= 0) // case for -ve values and 0
            return false;
        else
            return ((n & n - 1) == 0); // Property for finding power of 2 or not
    }

    public static void main(String[] args) {
        int n = 16;
        if (powerof2(n))
            System.out.println(n + " is power of 2");
        else
            System.out.println(n + " is not an power of 2");
    }

}
