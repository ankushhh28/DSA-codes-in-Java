public class statickeyword {
    public static void main(String args[]){
        Student s1= new Student();
        Student.schoolname= "NG"; //static variables can also be accessed through class names
        s1.setname("aman");
        System.out.println(s1.getname());
        s1.setrollno(20);
        System.out.println(s1.getrollno());
        System.out.println(s1.schoolname);

        Student s2= new Student();
        s2.setname("raj");
        System.out.println(s2.getname());
        s2.setrollno(11);
        System.out.println(s2.getrollno());
        System.out.println(s2.schoolname);


    }
}
class Student{
    String name;
    int rollno;
    static String schoolname;
    
    void setname(String name){
        this.name= name;
    }
    String getname(){
        return this.name;
    }

    void setrollno(int number){
        this.rollno= number;
    }
    int getrollno(){
        return this.rollno;
    }
}
