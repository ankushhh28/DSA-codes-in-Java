public class fastexponentation {
    public static int fastexpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            // check LSB
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1; // removes last bit after multiplication
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(fastexpo(3, 5));
    }
}
