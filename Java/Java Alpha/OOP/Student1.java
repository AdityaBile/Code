// package OOP;

// class Student1 {
 
//     public static void main(String args[])
//     {
 
//         // Declaring an array of student
//         Student[] arr;
 
//         // Allocating memory for 2 objects
//         // of type student
//         arr = new Student[2];
 
//         // Initializing the first element
//         // of the array
//         arr[0] = new Student(1701289270, "Satyabrata");
 
//         // Initializing the second element
//         // of the array
//         arr[1] = new Student(1701289219, "Omm Prasad");
 
//         // Displaying the student data
//         System.out.println(
//             "Student data in student arr 0: ");
//         arr[0].display();
 
//         System.out.println(
//             "Student data in student arr 1: ");
//         arr[1].display();
//     }
// }
 
// // Creating a student class with
// // id and name as a attributes
// class Student {
 
//     public int id;
//     public String name;
 
//     // Student class constructor
//     Student(int id, String name)
//     {
//         this.id = id;
//         this.name = name;
//     }
 
//     // display() method to display
//     // the student data
//     public void display()
//     {
//         System.out.println("Student id is: " + id + " "
//                            + "and Student name is: "
//                            + name);
//         System.out.println();
//     }
// }


/* */
public class Student1 {
    public static void main(String[] args){
        Details[] arr = new Details[2];

        arr[0] = new Details("Aditya", 12, 94);
        arr[1] = new Details("Abhi", 14, 98);

        for(int i=0; i<arr.length; i++){
            System.out.print("Name of student : "+arr[i].name+ " /n Roll no is : "+arr[i].roll+" /n Total marks obtained are : " + arr[i].marks);
        }
    }
}

class Details{

    String name;
    int roll;
    int marks;

    Details(String name, int roll, int marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}
