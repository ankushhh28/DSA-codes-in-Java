public class multipleinheritancebyinterface {
    public static void main(String[] args) {
        Bear b= new Bear();
        b.eats();
        b.legs();
    }
}
interface Herbivores{
    void eats();
}
interface Carnivores{
    void legs();
}
class Bear implements Herbivores,Carnivores{
    public void eats(){
        System.out.println("bear eats plants & animals");
    }
    public void legs(){
        System.out.println("bear has two legs");
    }
}
