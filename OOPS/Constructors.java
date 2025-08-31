public class Constructors {
    public static void main(String[] args) {
        Student obj1= new Student();
        Student marks= new Student(98);
    
    }
}
class Student{
    Student(){  //non-parameterized constructors
        System.out.println(" Inside Student Constructor");
    }
    Student(int marks){ //parameterized constructors
        System.out.println("Student marks= "+marks);

    }
}
