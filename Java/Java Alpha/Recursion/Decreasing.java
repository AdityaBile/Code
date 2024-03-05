package Recursion;

// public class Decreasing {
//     public static void DescNo(int n){
//         if(n==1){
//             System.out.print(n);
//             return;
//         }
//         System.out.print(n+" ");
//         DescNo(n-1);
//     }

//     public static void main(String[] args){
//         int n=10;
//         DescNo(n);
//     }    
// }



public class Decreasing{
    public static void DescOrder(int n){
        //base case
        if(n==1) {
            System.out.println(1);
            return;
        }
        //kaam
        System.out.print(n+" ");

        //recurssion
        DescOrder(n-1);
    }

    public static void main(String[] args){
        DescOrder(10);
    }
}
