
public class superkeyword {
    public static void main(String args[]) {
        Dog tommy = new Dog();
        System.out.println(tommy.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {

    Dog() { // super();

        super.color = "white";
        System.out.println("Dog constructor called");
    }
}
