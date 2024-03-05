package OOP;

// public class Inheri {
//     public static void main(String[] args){
//         Dog don = new Dog();
//         don.walk();
//         don.eat();
//         don.eye = 2;
//         System.out.println(don.eye);


//     }
// }

// class Animals {
//     int eye;
//     public void eat(){
//         System.out.println("Eat");
//     }

//     public void breath(){
//         System.out.print("Breath");
//     }
// }

// class Dog extends Animals{
//     public void walk(){
//         System.out.println("walk");
//     }
// }

public class Inheri {
    public static void main(String[] args){
        Shark s1 = new Shark();
        s1.carni();
        s1.eye = 4;

        Peacock p1 = new Peacock();
        p1.weight();
        p1.fly();

        Dog d1 = new Dog();
        d1.legs = 4;
        d1.run();
        d1.bark();

    }
}

class Animals {
   int eye;
}

class Fish extends Animals{
    void swim(){
        System.out.println("All fish swims");
    }
}

class Tuna extends Fish{
    void herbi(){
        System.out.println("Vegeterian");
    }
}

class Shark extends Fish{
    void carni(){
        System.out.println("Non-Vege");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("All birds can fly");
    }
}

class Peacock extends Bird{
    void weight(){
        System.out.println("Fly less because of more weight");
    }
}

class Mammals extends Animals{
    int legs;
    void run(){
        System.out.println("Run on legs");
    }
}

class Dog extends Mammals{
    void bark(){
        System.out.println("Dogs bark only at night");
    }
}
