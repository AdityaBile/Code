import java.util.*;

public class _11funcMeth {
    // public static void printHello() {
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // System.out.println("Hello World");
    // return;
    // }

    // public static void main(String args[]) {
    // printHello();
    // }

    // public static int printSum() {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the two numbers");
    // int num1 = sc.nextInt();
    // int num2 = sc.nextInt();
    // int sum = num1 + num2;
    // System.out.println("Sum of two numbers is : " + sum);
    // return 0;
    // }

    // public static void main(String args[]) {
    // printSum();
    // }

    // or

    // // SUM function -------------------------------------
    // public static int printSum(int num1, int num2) {
    // int sum = num1 + num2;
    // return sum;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter 2 no. : ");
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = printSum(a, b);
    // System.out.println(sum);
    // }

    // // SWAP function -------------------------------------
    // public static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("Value of a " + a);
    // System.out.println("Value of b " + b);
    // }

    // public static void main(String args[]) {
    // int a = 13;
    // int b = 34;
    // swap(a, b);
    // }

    // // Product of 2 number --------------------------------------
    // public static int prod(int a, int b) {
    // int multiply = a * b;
    // return multiply;
    // }

    // public static void main(String args[]) {
    // System.out.println("Product of 2 numbers is : " + prod(12, 5));
    // }

    // // Factorial By While Loop ---------------------------------
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the no. : ");
    // int n = sc.nextInt();
    // int fact = 1;
    // int i = 1;
    // while (i <= n) {
    // fact *= i;
    // i++;
    // }
    // System.out.println("Factorial of " + n + " is : " + fact);
    // }

    // // Factorial by function -----------------------------------
    // public static int fact(int n) {
    // int f = 1;
    // for (int i = 1; i <= n; i++) {
    // f *= i;
    // }
    // return f;
    // }

    // public static void main(String args[]) {
    // System.out.println("Factorial of number is : " + fact(5));
    // }

    // // Binomial Coefficient -----------------------
    // public static int factorial(int n) {
    // int fact = 1;
    // for (int i = 1; i <= n; i++) {
    // fact *= i;
    // }
    // return fact;
    // }

    // public static int bino_coef(int n, int r) {
    // int n_fact = factorial(n);
    // int r_fact = factorial(r);
    // int nmr_fact = factorial(n - r);

    // int binocoef = n_fact / (r_fact * nmr_fact);
    // return binocoef;
    // }

    // public static void main(String args[]) {
    // System.out.println("Binomial Coefficient is : " + bino_coef(5, 2));
    // }

    // // Function overloading parameter ----------------------
    // public static int multiply(int a, int b, int c) {
    // return a * b * c;
    // }

    // public static int multiply(int a, int b) {
    // return a * b;
    // }

    // public static void main(String args[]) {
    // System.out.println(multiply(5, 7));
    // System.out.println(multiply(3, 4, 5));
    // }

    // // Function overloading data types ------------------------
    // public static int add(int a, int b) {
    // return a + b;
    // }

    // public static float add(float a, float b) {
    // return a + b;
    // }

    // public static void main(String args[]) {
    // System.out.println(add(5, 7));
    // System.out.println(add(3.6f, 4.9f));
    // }

    // // Prime or Not -----------------------------
    // public static boolean isPrime(int n) {
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;

    // }

    // public static void main(String args[]) {
    // System.out.println(isPrime(97));

    // }

    // // Prime or Not -------------------------------------
    // public static boolean isPrime(int n) {
    // boolean isPrime = true;
    // for (int i = 2; i <= n - 1; i++) {
    // if (n % i == 0) {
    // isPrime = false;
    // return isPrime;
    // }
    // }
    // return isPrime;

    // }

    // public static void main(String args[]) {
    // System.out.println(isPrime(97));

    // }

    // // Prime or Not ---------------------------------
    // public static boolean isPrime(int n) {
    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void main(String ars[]) {
    // System.out.println(isPrime(54));

    // }

    // // Print Prime numbers in range --------------------
    // public static boolean isPrime(int n) {
    // if (n == 2) {
    // return true;
    // }

    // for (int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public static void primeInRange(int n) {
    // for (int i = 2; i <= n; i++) {
    // if (isPrime(i)) {
    // System.out.print(i + " ");
    // }
    // }
    // }

    // public static void main(String ars[]) {
    // primeInRange(20);
    // }

    // // Binary to DecimaL---------------------------
    // public static void binToDeci(int bina) {
    // int binaryNo = bina;
    // int pow = 0;
    // int deciNo = 0;

    // while (bina > 0) {
    // int lastDigit = bina % 10;
    // deciNo = deciNo + ((int) Math.pow(2, pow) * lastDigit);

    // pow++;
    // bina = bina / 10;
    // }

    // System.out.println("Binary to decimal conversion of " + binaryNo + " is : " +
    // deciNo);
    // }

    // public static void main(String args[]) {
    // binToDeci(100);
    // }

    // // Decimal To Binary------------------
    // public static void decToBin(int deci) {
    // int deciNo = deci;
    // int pow = 0;
    // int binNo = 0;

    // while (deci > 0) {
    // int rem = deci % 2;
    // binNo = binNo + ((int) Math.pow(10, pow) * rem);

    // pow++;
    // deci = deci / 2;
    // }
    // System.out.println("Decimal to Binary conversion of " + deciNo + "is : " +
    // binNo);
    // }

    // public static void main(String args[]) {
    // decToBin(7);
    // }

    // // Average of 3 numbers -------------------------------------------
    // public static int avg(int a, int b, int c) {
    // return (a + b + c) / 3;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the 3 no. : ");
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // System.out.println("Average of 3 no. is : " + avg(a, b, c));
    // }

    // // Even Or Odd -----------------------------------------------------
    // public static boolean isTrue(int n) {
    // if (n % 2 == 0) {
    // return true;
    // }
    // return false;
    // }

    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("enter the no. ");
    // int n = sc.nextInt();
    // System.out.println(isTrue(n));

    // if (isTrue(n)) {
    // System.out.println("Is a even no.");
    // } else {
    // System.out.println("Is a odd no.");
    // }
    // }

    // //Palindrome
    // public static void main(String args[]) {
    // int lastDigit;
    // int store = 0;
    // int power = 0;

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number :");
    // int num = sc.nextInt();
    // int origNum = num;
    // while (num > 0) {
    // lastDigit = num % 10;
    // store = store + lastDigit * (int) Math.pow(10, power);

    // power++;
    // num /= 10;
    // }
    // if (origNum == store) {
    // System.out.println(origNum + " Is a plaindrome no. i.e. " + store);
    // } else {
    // System.out.println("Not a palindrome no.");
    // }

    // // Reverse a number -----------------------------------------
    // public static void main(String args[]) {
    // int lastDigit;
    // int store = 0;
    // int power = 0;

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the number :");
    // int num = sc.nextInt();
    // int origNum = num;
    // while (num > 0) {
    // lastDigit = num % 10;
    // store = store * 10 + lastDigit;

    // power++;
    // num /= 10;
    // }
    // System.out.println(store);
    // }

    // }

}
