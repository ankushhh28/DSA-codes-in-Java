public class interfacebasic {
    public static void main(String args[]){
        Queen q= new Queen();
        q.moves();
        King k= new King();
        k.moves();
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up down left right digonal(in all 4 directns)");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up down left right digonal(by 1 step)");
    }
}
