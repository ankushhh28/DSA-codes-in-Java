

public class foverloading {

    public static int product(int a, int b){
    return a*b;}

    public static float product(float a, float b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(product(3,4));
        System.out.println(product(3.0f,4.0f));
    }
    
}
