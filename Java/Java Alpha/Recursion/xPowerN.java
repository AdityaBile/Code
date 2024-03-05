package Recursion;

// public class xPowerN{
//     public static int xPowN(int x, int n){
//         // base case
//         if(n==1){
//             return x;
//         }
//         //kaam
//         int xPownm1 = xPowN(x, n-1);
//         int xPown = x*xPownm1;
//         //recurssion
//         return xPown;
//     }

//     public static void main(String[] args){
//         System.out.println(xPowN(2,5));
//     }
// }



//Optimization
public class xPowerN{
    public static int xPowN(int x, int n){
        // base case
        if(n==1){
            return x;
        }
        // kaam
        int halfPow = xPowN(x, n/2);
        int halfPowSq = halfPow * halfPow;

        if(n % 2 != 0){
            halfPowSq = x * halfPowSq;
        }

        //recurssion
        return halfPowSq;
    }
    public static void main(String[] args){
        System.out.println(xPowN(2,5));
    }
}
