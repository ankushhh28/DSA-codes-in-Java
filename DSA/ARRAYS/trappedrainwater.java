public class trappedrainwater {
    public static int calculatetrappedrainwater(int height[]) {
        int n = height.length;
        // calutlate left max boundary>array

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right max boundary>array

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedwater = 0;
        // loop for calculation of waterlevel & trappedwater
        for (int i = 0; i < n; i++) {
            // calculate waterlevel
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // calculate trapped water= waterlevel- height of bar
            trappedwater += (waterlevel - height[i]);

        }
        return trappedwater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("Total Trapped-Water= " + calculatetrappedrainwater(height));
    }
}












































