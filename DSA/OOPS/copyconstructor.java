public class copyconstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "ankush";
        s1.rollno = 20;
        s1.password = "abcd";
        s1.marks[0] = 86;
        s1.marks[1] = 75;
        s1.marks[2] = 97;

        Student s2 = new Student(s1);
        s1.marks[2] = 99;
        s2.password = "xyz";
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.password);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollno;
    String password;
    int marks[] = new int[3];

    Student() {
        System.out.println("Constructor is called by s1");
    }
    // shallow copy constructor
    // Student(Student s1){
    // System.out.println("Constructor is called by s2");

    // this.name= s1.name;
    // this.rollno= s1.rollno;
    // this.marks= s1.marks;

    // }

    // deep copy constructor> in this new array created
    Student(Student s1) {
        System.out.println("Constructor is called by s2");
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }
}
