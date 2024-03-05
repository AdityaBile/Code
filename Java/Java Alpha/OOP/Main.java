// package OOP;

// public class interface1 {
//     public static void main(String args[]){
//         Animal1 bear = new Animal1();
//         bear.eat();
//         System.out.println(bear.color);
//     }
// }

// interface Herbi1{
//     void eat();

// }

// interface Carni1{
//     String color = "Brown";

// }

// class Animal1 implements Herbi1, Carni1{
//     public void eat(){
//         System.out.println("Eat flesh");
//     } 

//     String color = "Red";
// }


package OOP;

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat();
}

class Animal implements Herbivore, Carnivore {
    private String color;

    public Animal(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        if (this.color.equals("Brown")) {
            System.out.println("Eat flesh");
        } else {
            System.out.println("Eat plants");
        }
    }

    public String getColor() {
        return this.color;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal bear = new Animal("Red");
        bear.eat();
        System.out.println(bear.getColor());
    }
}


