public class abstractclass {
    public static void main(String[] args) {
        Horse h= new Horse();
        h.eat();
        h.walk();
        
        Chicken c= new Chicken();
        c.eat();
        c.walk();
    }
}
abstract class Animal{
    //constructor
    Animal(){
        System.out.println("Animal Constructor called");
    }
    //non-abstract method
    void eat(){
        System.out.println("animal eats");
    }
    //abstract method > provide idea but not implementation 
    abstract void walk();

}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken constructor called");
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}

