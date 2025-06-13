public class accessmodifiers {
    public static void main(String[] args) {
        BankAccount obj= new BankAccount();
        obj.setusername("abc");
        System.out.println(obj.getusername());
        obj.setpassword(123);
        System.out.println(obj.getpassword());
    }
}
class BankAccount{
    private String username;
    private int password;
    public String getusername(){ // getter for username
        return username;
    }
    public int getpassword(){  // getter for password
        return password;
    }
    public void setusername(String user){ //setter for username
        username=user;
    }
    public void setpassword(int pass){ // setter for password
        password= pass;
    }
}
