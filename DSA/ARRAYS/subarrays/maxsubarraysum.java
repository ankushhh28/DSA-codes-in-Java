public class maxsubarraysum {  // brute force method
    public static void max_subaaray_sum(int num[]) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) { // decides start value
            int start = i;
            System.out.println("Sum of Subarrays starts from " + num[i] + " are-");
            for (int j = i; j < num.length; j++) { // decides end value
                int end = j;
                int current_sum = 0;

                for (int k = start; k <= end; k++) { // calculate all elements sum between start and end
                    current_sum = current_sum + num[k];
                }
                System.out.println(current_sum);
                if (max_sum < current_sum) {
                    max_sum= current_sum;
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
