public class OOPS {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name= "yash";
        s1.rollno= 123;
        s1.password="abcdefg";

        Student s2 = new Student(s1);
        s2.rollno = 234;
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        
    }
}

class Student{
    String name;
    int rollno;
    String password;

    Student(){
        System.out.println("Constructor call ho gaya...");
    }

    Student(Student s1){
        this.name = s1.name;
        this.rollno=s1.rollno;
        this.password=s1.password;
    }
}
