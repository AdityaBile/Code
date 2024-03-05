package OOP;

public class Abstractcls {
    public static void main(String[] args){
        Mustang m1 = new Mustang();
        // Horse h1 = new Horse();
        // h1.walk();
        // h1.eat();
        // h1.setColor();
        // System.out.println(h1.color);
    }
}

abstract class Animal{
    String color;
    Animal(){
        // color = "Brown";
        System.out.println("This is animal const.");
    }
    void eat(){
        System.out.println("Animals eat");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("This is horse const.");
    }
    void walk(){
        System.out.println("Horse walks on 4 legs");
    }
    void setColor(){
        color = "White";
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("This is Mustang const.");
    }
}

class Chicken extends Animal{
    
    void walk(){
        System.out.println("Chicken walks on 2 legs");
    }
    void setColor(){
        color = "Yellow";
    }

}