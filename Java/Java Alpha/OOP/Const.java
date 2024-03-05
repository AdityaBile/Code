package OOP;
public class Const {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "abc";
        s1.roll = "12";
        s1.marks[0] = 80;
        s1.marks[1] = 100;
        s1.marks[2] = 90;


        // //Shallow Copy
        // Student s2 = new Student(s1);
        // s1.marks[0] = 90;
        // System.out.println(s2.name);
        // System.out.println(s2.roll);
        // System.out.println(s2.marks[1]);
        // System.out.println(s2.marks[2]);
        // System.out.println(s2.marks[0]);

        //Deep Copy
        Student s2 = new Student(s1);
        s1.marks[0] = 70;
        System.out.println(s2.name);
        System.out.println(s2.roll);
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        

    }
}

class Student{
    public String name;
    private String pass;
    public String roll;
    int marks[] = new int[3];

    public void setPass(String newPass){
        this.pass = newPass;
    }

    public void getPass(){
        System.out.println(pass);
    }

    Student(){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        //Shallow Copy
        // this.marks = s1.marks;

        //Deep Copy
        for(int i=0; i<3; i++){
            this.marks[i] = s1.marks[i]; 
        }
    }
}