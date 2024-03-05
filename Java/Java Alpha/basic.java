import java.util.*;

public class basic {
    // public static void main(String args[]) {
    // // Input
    // Scanner sc = new Scanner(System.in);
    // double number = sc.nextDouble();
    // System.out.println(number);

    // boolean word = sc.nextBoolean();
    // System.out.println(word);

    // byte code = sc.nextByte();
    // System.out.println(code);

    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the radius");
    // float radius = sc.nextFloat();
    // float area = 3.14f * radius * radius;
    // System.out.println(area);

    // // TYpe Conversion
    // Scanner sc = new Scanner(System.in);
    // float a = sc.nextInt();
    // System.out.println(a);

    // // type conversion not possiblke
    // // int b = sc.nextFloat();
    // // System.out.println(b);

    // // Type casting
    // float a = 12.34f;
    // int b = (int) a;
    // System.out.println(b);

    // char ch = 'a';
    // int ch1 = ch;
    // char CH = 'b';
    // int CH1 = CH;
    // System.out.println(ch1);
    // System.out.println(CH1);

    // }

    // public static void main(String args[]) {
    // System.out.println("Hello World!");
    // int a = 10;
    // int b = 5;
    // int sum = a + b;
    // System.out.println(sum);
    // }

    public static void main(String args[]) {
        // // Average
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the numbers ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println((a + b + c) / 3);

        // // Sqaure Area
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of side of square ");
        // float side = sc.nextFloat();
        // float area = side * side;
        // System.out.println(area);

        // bill
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of pen,pensil and earser ");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float earser = sc.nextFloat();
        System.out.println("Here's your Bill");
        System.out.println("Pen: " + pen);
        System.out.println("Pencil: " + pencil);
        System.out.println("earser: " + earser);
        System.out.println("Total bill with gst: " + ((pen + pencil + earser) * 0.18));

    }
}
