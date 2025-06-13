public class reversearray {

    public static void reverse(int numbers[]) {
        int first = 0;
        int last = numbers.length - 1;
        while (first < last) { // by swapping first and last index reverse the array...
            // swap
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Array before Reverse: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Array after Reverse: ");
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

}
