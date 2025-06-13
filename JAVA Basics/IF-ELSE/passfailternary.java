import java.util.*;

// CHECK IF A STUDENT WILL PASS OR FAIL [ marks>=33: PASS     marks<33:FAIL] using TERNARY OPERATOR

public class passfailternary {
    public static void main(String[] args) {
        int marks;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Marks of Student: ");
        marks= sc.nextInt();

        String check= (marks>=33)?"PASS":"FAIL";
        System.out.println(check);
    }
    
}
