public class Butterfly{
    public static void main(String args[]){
        // n = 4
        /* 
        *      *
        **    **
        ***  ***
        ********
        ********
        ***  ***
        **    **
        *      *
        */
        // First Half
        int n =4;
        for(int i=1; i<=4; i++){
            // Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // Space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            // Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Second Half
        for(int i=n; i>=1; i--){
            // Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            // Space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print("  ");
            }
            // Star
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}