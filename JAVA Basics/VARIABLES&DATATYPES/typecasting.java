
//TYPE CONVERSION --> LOSSY CONVERSION ERROR...
// SOLUTION OF LOSSY CONVERSION IS TYPECASTING...

public class typecasting {
    public static void main(String args[]) {

        float marks = 99.87f; // lossy conversion from double to float
        int marks2 = (int) marks;

        char ch = 'A';
        int num = ch; // conversion of character to number is possible in java
        
        System.out.println(marks2);
        System.out.println(num);

    }
}