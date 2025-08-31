public class add1usingNOT {
    public static void main(String[] args) {
        int x=5;
        // as ~x= -(x+1) thus, we calculate -(~x) which is -(~x)= x+1
        System.out.println(x+" + 1 = "+ -(~x));
        x=2;
        System.out.println(x+" + 1 = "+ -(~x));
        x=-3;
        System.out.println(x+" + 1 = "+ -(~x));
    }

}
