public class multilevelinheritance {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        System.out.println(tommy.color);
        tommy.eat();
        tommy.legs = 4;
        System.out.println(tommy.legs);
    }
}

// base class
class Animal {
    String color = "yellow";

    void eat() {
        System.out.println("eats");
    }

}

// derived class- I
class Mammal extends Animal {
    int legs;
}

// derived class- II
class Dog extends Mammal {
    String breed;
}
