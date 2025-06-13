public class maxsubarraysumprefixarray {
    public static void max_subaaray_sum(int num[]) {
        int prefix[] = new int[num.length]; // prefix array declaration
        prefix[0] = num[0];

        //CREATE PREFIX ARRAY----
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i]; // formmula generates prefix array
        }

        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) { // decides start value
            int start = i;
            System.out.println("Sum of Subarrays starts from " + num[i] + " are-");
            for (int j = i; j < num.length; j++) { // decides end value
                int end = j;

                int current_sum = start == 0 ? prefix[end]/* corner case */ : prefix[end] - prefix[start - 1]; // formula
                                                                                                               // for
                                                                                                               // sum
                                                                                                               // calculate
                System.out.println(current_sum);
                if (max_sum < current_sum) {
                    max_sum = current_sum;
                }

            }
            System.out.println();
        }
        System.out.println("Maximum Sum in all Subarrays:" + max_sum);

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        max_subaaray_sum(num);
    }

}
