public class maxsubarraysumkadane {
    public static void max_subaaray_sum(int num[]) {

        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        for (int i = 0; i < num.length; i++) {
            current_sum = current_sum + num[i];
            if (current_sum < 0) { // set current sum value 0 in -ve case
                current_sum = 0;
            }
            if (max_sum < current_sum) { // compare max sum with current sum
                max_sum = current_sum;
            }
        }
        System.out.println("Maximum Sum in all Subarrays:" + max_sum);

    }

    public static void main(String[] args) {
        int num[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        max_subaaray_sum(num);
    }

}
