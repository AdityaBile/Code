package Recursion;

public class Increasing {
    // public static void IncingNo(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     IncingNo(n-1);
    //     System.out.print(n+" ");
    // }

    // public static void main(String[] args){
    //     int n=10;
    //     IncingNo(n);
    // }




    public static void IncOrder(int n){
        //base case
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        //recurssion
        IncOrder(n-1);
        //kaam
        System.out.print(n+" ");

    }
    public static void main(String[] args){
        IncOrder(10);
    }
}
