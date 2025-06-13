public class bitwiseoperators {

    public static void main(String[] args) {
        
        // BITWISE AND(&) ---
        System.out.println(5&6);

        //BITWISE OR(|) ---
        System.out.println(5|6);

        //BITWISE XOR(^) ---
        System.out.println(5^6);

        //BITWISE 1'S COMPLEMENT
        System.out.println(~5);
        System.out.println(~0);

        //BITWISE LEFT SHIFT
        System.out.println(5<<2); // formula for calculating output>> [a<<b= a*2^b] 

        //BITWISE RIGHT SHIFT
        System.out.println(6>>2); // formula for calculating output>> [a>>b= a/2^b] 
        System.out.println(6>>1);
    }
    
}
