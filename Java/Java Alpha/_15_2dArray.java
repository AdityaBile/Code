import java.util.*;

public class _15_2dArray {

    // public static boolean search(int matrix[][], int key) {
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[0].length; j++) {
    // if (matrix[i][j] == key) {
    // System.out.print("Key was found");
    // return true;
    // }
    // }
    // }
    // System.out.println("Key did not found");
    // return false;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int matrix[][] = new int[3][3];
    // int n = matrix.length;
    // int m = matrix[0].length;

    // // INPUT
    // System.out.println("Enter the number : ");
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // matrix[i][j] = sc.nextInt();
    // }
    // }

    // // OUTPUT
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(matrix[i][j] + " ");
    // }
    // System.out.println();
    // }

    // search(matrix, 10);

    // }

    


    //Spiral Matrix
        public static void spiral(int matrix[][]){
            int startRow = 0;
            int startCol = 0;
            int endRow = matrix.length-1;
            int endCol = matrix[0].length-1;

            while(startRow<=endRow && startCol<=endCol){
                // top 
                for(int i= startCol; i<=endCol; i++){
                    System.out.print(matrix[startRow][i]+",");
                }

                // right
                for(int i=startRow+1; i<=endRow; i++){
                    System.out.print(matrix[i][endCol]+",");
                }

                //bottom
                for(int i=endCol-1; i>=startCol; i--){
                    
                    if(startRow==endRow){
                        break;
                    }
                    System.out.print(matrix[endRow][i]+",");
                }

                //left
                for(int i =endRow-1; i>=startRow+1; i--){
                    if(startCol==endCol){
                        break;
                    }
                    System.out.print(matrix[i][startCol]+",");
                }
                startRow++;
                startCol++;
                endRow--;
                endCol--;
            }
        }

    public static void main(String[] args){
        int matrix[][] = {{1,2,3,4,5}, {6,7,8,9,10}
         ,{11,12,13,14,15}}; /*, {16,17,18,19,20}, {21,22,23,24,25}*/
        spiral(matrix);
    }
}
