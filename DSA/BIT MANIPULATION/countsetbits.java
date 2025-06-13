public class countsetbits {
    public static int countSetbits(int n) {
        int count = 0;
        while (n > 0) {
            // check LSB
            if ((n & 1) != 0)
                count++;

            // remove LSB
            n = n >> 1;
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(countSetbits(7));
    }

}
