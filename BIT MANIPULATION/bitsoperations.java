public class bitsoperations {

    public static int checkithbit(int n, int i) {
        int bitmask = 1 << i; // operand we use with & operator
        if ((n & bitmask) == 0)
            return 0;
        return 1; // if result is not equals to 0

    }

    public static int setithbit(int n, int i) {
        int bitmask = 1 << i; // operand we use with & operator
        return n | bitmask;// set ith bit to 1 and return

    }

    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i); // operand we use with & operator
        return n & bitmask; // clear ith bit to 0 and return

    }

    public static int clearibits(int n, int i) {
        int bitmask = (~0) << i; // we can also take -1<<i as ~0= -1
        return n & bitmask;
    }

    public static int clearrangeofBits(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1; // b= pow(2,i)-1 as 1<<i= 2^i we can also use b= (int)Math.pow(2, i) - 1
        int bitmask = a | b;
        return n & bitmask;
    }

    public static int updateithbit(int n, int i, int newbit) {
        // APPROACH 1
        // if (newbit == 0)
        // return clearithbit(n, i);
        // else
        // return setithbit(n, i);

        // APPROACH 2
        n = clearithbit(n, i); // first clear ith bit
        int bitmask = newbit << i;
        return n | bitmask;

    }

    public static void main(String args[]) {
        // System.out.println("ith bit= " + checkithbit(10, 2)); // num=10 and ith
        // place=2
        // System.out.println(setithbit(10, 2)); // num=10 and ith place=2
        // System.out.println(clearithbit(10, 1)); // num=10 and ith place=2
        // System.out.println(updateithbit(10, 2, 1));
        // System.out.println(clearibits(15, 2));
        System.out.println(clearrangeofBits(10, 2, 4)); // clear bits from range i to j
    }
}
