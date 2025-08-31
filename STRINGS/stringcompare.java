public class stringcompare {
    public static void main(String[] args) {
        String s1 = "Meera";
        String s2 = "Meera";
        String s3 = new String("Meera");

        // comparisons
        if (s1 == s2)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        if (s1 == s3)  // it returns not equal bcz it declares with new keyword thus it is treated as different string
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        if(s1.equals(s3)) // .equals() returns boolean value checks equality of strings
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }

}
