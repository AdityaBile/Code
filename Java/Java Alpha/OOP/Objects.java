package OOP;
public class Objects {
    public static void main(String[] args){
        Pen p1 = new Pen();
        System.out.println(p1.color);

        p1.changeColor("Red");
        System.out.println("Default color : "+p1.color);
        System.out.println(p1.color);

        p1.changeColor("Yellow");
        System.out.println(p1.color);

        p1.changeTip(6);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color = "Blue";
    int tip = 5;

    void changeColor(String newColor){
        color = newColor;
    }

    void changeTip(int newTip){
        tip = newTip;
    }
}
