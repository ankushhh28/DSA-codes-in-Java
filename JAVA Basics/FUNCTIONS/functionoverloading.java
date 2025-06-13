

public class functionoverloading {

    public static int product(int a, int b){
    return a*b;}

    public static int product(int a, int b,int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        System.out.println(product(3,5));
        System.out.println(product(3,4,5));
    }
    
}
