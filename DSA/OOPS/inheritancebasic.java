public class inheritancebasic {
    public static void main(String[] args) {
        Lion obj= new Lion();
        System.out.println(obj.color);
        obj.breathe();
        obj.eat();
    }
}
//base class
class Animal{
    String color= "yellow";
    
    void eat(){
        System.out.println("eats");
    }
    
}
//derived class
class Lion extends Animal{
    int legs;
    void breathe(){
        System.out.println("breathe");
    }
}

