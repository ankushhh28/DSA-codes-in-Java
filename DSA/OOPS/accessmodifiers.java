public class accessmodifiers {
    public static void main(String args[]){
        BankAccount myaccount= new BankAccount();
        myaccount.username="ankush";
        System.out.println(myaccount.username);
        myaccount.setpassword("123");
        myaccount.showpassword();
        myaccount.setpassword("456");
        myaccount.showpassword();

    }
}
class BankAccount{
    public String username;
    private String password;
    
    void setpassword(String pwd){
        password=pwd;
    }
    void showpassword(){
        System.out.println(password);
    }

}
