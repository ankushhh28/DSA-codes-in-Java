public class largeststring {
    public static void main(String args[]) {
        String fruits[] = { "apple", "banana", "mango" };

        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) { // fn for comparing largest string in lexicographic order-
                largest = fruits[i];
            }
        }
        System.out.println("Largest String--> " + largest);
    }

}
