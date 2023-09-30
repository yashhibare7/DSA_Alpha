public class CopyConstructor {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Yash";
        s1.roll = 1;
        s1.password = "abc123";

        Student s2 = new Student(s1);
        System.out.println(s2.name);
    }
}

class Student{
    String name;
    int roll;
    String password;

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student(){
        System.out.println("Constructor is called...");
    }
}
