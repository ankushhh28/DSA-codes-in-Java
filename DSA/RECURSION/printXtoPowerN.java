public class printXtoPowerN {

    // * Rule: x^n= x*x^(n-1) here x->base & n->power
    // * base case: n=1 then return x or n=0 then return 1...

    public static int calculatePower(int x, int n) {
        if (n == 0) // base case
            return 1;

        // int ans = x * calculatePower(x, n - 1);
        // return ans;

        return x * calculatePower(x, n - 1);
    }

    public static int calculatePowerOptimizedWay(int x, int n) {
        // * Logic: depends on value of n
        // * CASE 1> when n is even
        // * x^n= x^(n/2) * x^(n/2)
        // * CASE 2> when n is odd
        // * x^n= x * x^(n/2) * x^(n/2)

        if (n == 1)
            return x;

        int halfPower = calculatePowerOptimizedWay(x, n / 2);

        // * for odd cases
        if (n % 2 != 0)
            return x * halfPower * halfPower;

        return halfPower * halfPower;
    }

    public static void main(String[] args) {
        // System.out.println("Answer= " + calculatePower(2, 5));
        System.out.println("Answer= " + calculatePowerOptimizedWay(2, 7));
    }
}
