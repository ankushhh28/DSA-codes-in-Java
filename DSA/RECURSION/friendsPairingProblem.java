public class friendsPairingProblem {
    public static int friendsPairingWay2(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairingWay2(n - 1) + (n - 1) * friendsPairingWay2(n - 2);
    }

    public static int friendsPairing(int n) {

        // * Base Case
        if (n == 1 || n == 2) {
            return n;
        }

        // * single case
        int fnm1 = friendsPairing(n - 1);

        // * Pair case
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        // * Total Ways
        int totalWays = fnm1 + pairWays;

        return totalWays;
    }

    public static void main(String[] args) {
        // System.out.println(friendsPairing(3));
        System.out.println(friendsPairingWay2(3));

    }
}
