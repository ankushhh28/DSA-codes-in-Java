public class printsubarray {
    public static void subaarayprint(int num[]) {
        int total=0;
        for (int i = 0; i < num.length; i++) { // decides start value
            int start = i;
            System.out.println("Subarrays starts from " + num[i] + " are-");
            for (int j = i; j < num.length; j++) { // decides end value
                int end = j;

                for (int k = start; k <= end; k++) { // print all elements between start and end
                    System.out.print(num[k] + " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays= "+total);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        subaarayprint(num);
    }

}
