public class OOPSBasic {
    public static void main(String args[]) {
        Pen obj = new Pen(); // creates object of pen class
        obj.setcolor("Blue");
        System.out.println(obj.color);

        obj.settip(5);
        System.out.println(obj.tip);

        obj.color = "red";
        System.out.println(obj.color);
    }
}

class Pen {
    String color;
    int tip; 

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}
