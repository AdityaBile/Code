package Recursion;

public class Fibonacci {
    // public static int Fib(int count){
    //     if(count == 2){
    //         return 1;
    //     }
    //     if(count ==1){
    //         return 0;
    //     }
    //     int fibnm2 = Fib(count-2);
    //     int fibnm1 = Fib(count-1);
    //     int fib = fibnm1 + fibnm2;
    //     return fib;
    // }
    // public static void main(String[] args){
    //     int n=4;
    //     System.out.println(Fib(n));


    // }


    public static int Fib(int n){
        //base
        if(n==1) return 0;
        if(n==2) return 1;
        //recurssion
        return Fib(n-1)+Fib(n-2);
    }
    public static void main(String[] args){
        System.out.print("Fibonacci of n is : "+Fib(6));
    }
}
