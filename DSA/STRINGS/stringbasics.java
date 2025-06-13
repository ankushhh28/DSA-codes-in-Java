import java.util.*;

public class stringbasics {
    public static void printletters(String name) {
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        // String declaration methods
        String city1 = "Indore";
        String city2 = new String("Bhopal");

        String name;
        String fullname;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name: ");
        name = sc.next(); // for input single word

        // System.out.println("Enter full name:");
        // fullname = sc.nextLine(); // for input whole line

        System.out.println("Output-");
        System.out.println(name);

        System.out.println(name.length()); // function for string length calculation
        // System.out.println(name.charAt(0)); // it gives the word at specific index

        // System.out.println(fullname);

        printletters(name);
        String newcity = city1 + city2; // concatenation of string
        System.out.println(newcity);
    }

}
