public class setRightMostBit {
    public static int setRightBit(int n) {
        int i = 0;
        while (true) {
            if ((n & (1 << i)) == 0) {
                n = n | (1 << i);
                return n;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(setRightBit(n));

    }
}
