public class hierarchicalinheritance {
    public static void main(String[] args) {
        Mammal m= new Mammal();
        Fish f= new Fish();
        Bird b= new Bird();
        m.eat();
        b.eat();
        f.eat();
    }
}

// base class
class Animal {
    void eat() {
        System.out.println("eats");
    }
}

// derived class- I
class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

// derived class- II
class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

// derived class-III
class Bird extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}
