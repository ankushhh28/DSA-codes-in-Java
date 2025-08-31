public class largestnumber {

    public static int largest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // IT STORES -INFINITY...

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int smallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // IT STORES INFINITY...

        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }



    public static void main(String[] args) {
        int numbers[] = { 5, 3, 8, 80, 40, 2, 6 };

        System.out.println("Largest Number is: " + largest(numbers));
        System.out.println("Smallest Number is: " + smallest(numbers));
    }

}
