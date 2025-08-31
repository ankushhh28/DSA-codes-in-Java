public class methodoverloading {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println(calc.area(3.5));
        System.out.println(calc.area(2, 3));
        System.out.println(calc.area(4));
    }
}

class Calculate {
    int area(int side) {
        return side * side;
    }

    double area(double radius) {
        return 3.14 * radius * radius;
    }

    int area(int l, int b) {
        return l * b;
    }
}