import java.io.*; 
public class fibonnaci {
    public static int fibonacci_numbers(int n) 
    { 
        if(n == 0){ 
        return 0; 
        } 
        else if(n == 1){ 
        return 1; 
        } 
        else{ 
        return fibonacci_numbers(n-2) + fibonacci_numbers(n-1); 
        } 
    } 
    public static void main (String[] args) { 
        // O(n*2^n)
        // O(n)
        int n = 7; 
        for(int i = 0; i < n; i++){ 
        System.out.print(fibonacci_numbers(i)+ " "); 
        } 

        // Iterative
        /*
        O(n) & O(n)
        public static void main(String[] args) {
        int n = 10; 
        int[] fibonacciSeries = new int[n];

        
        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
         */
    } 
} 

