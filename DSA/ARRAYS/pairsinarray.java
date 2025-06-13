public class pairsinarray {
    public static void pairs(int numbers[]) {
        int total_pairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int first = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + first + " , " + numbers[j] + ") ");
                total_pairs++;
            }
            System.out.println();

        }
        System.out.println("Toatal Pairs= " + total_pairs);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairs(numbers);
    }

}
