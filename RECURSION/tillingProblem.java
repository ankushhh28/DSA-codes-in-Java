public class tillingProblem {
    public static int TillingProblem(int n) {
        // * 2*n (floor size) & n->Floorlength

        // * base case
        if (n == 0 || n == 1)
            return n;

        // * vertical choice
        int fn1 = TillingProblem(n);
        // * horizontal choice
        int fn2 = TillingProblem(n - 1);

        // * total choice
        int totalWays = fn1 + fn2;

        return totalWays;
    }

    public static int TillingProblemWithFibonacci(int n) {
        if (n <= 1)
            return 1;

        // * total choice
        int totalWays = TillingProblemWithFibonacci(n - 1) + TillingProblemWithFibonacci(n - 2);

        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println("Total Ways: " + TillingProblem(7));
    }
}

// ! REASON BEHIND n==0 returns 1:
// * n==0 par 1 return karna isliye sahi hai kyunki wo ek"complete valid
// * solution" hota hai— floor poora cover ho chuka hota hai bina koi galti
// * ke.Aur hum bas total number of valid ways gin rahe hain.
