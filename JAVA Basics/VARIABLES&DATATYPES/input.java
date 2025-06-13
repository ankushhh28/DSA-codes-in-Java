import java.util.*;

// DIFFERENT INPUT FUNCTIONS OF SCANNER CLASS OBJECT(obj)...

public class input {
    public static void main(String args[]) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Input Values");
        // INTEGER INPUT

        int in = obj.nextInt();
        // BYTE INPUT
        byte by = obj.nextByte();
        // SHORT INPUT
        short sh = obj.nextShort();
        // LONG INPUT
        long lg = obj.nextLong();
        // FLOAT INPUT
        float fl = obj.nextFloat();
        // DOUBLE INPUT
        double dl = obj.nextDouble();
        // BOOLEAN INPUT
        boolean bool = obj.nextBoolean();
        // SINGLE WORD INPUT
        String name = obj.next();
        // TO TAKE MULTIPLE WORDS AS INPUT
        String bio = obj.nextLine();

        System.out.println("Output Values");

        System.out.println(in);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(lg);
        System.out.println(fl);
        System.out.println(dl);
        System.out.println(bool);
        System.out.println(name);
        System.out.println(bio);
    }
}
