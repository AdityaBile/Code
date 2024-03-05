import java.util.*;

public class _16strings {
    // // Reverse a string by "stringbulders" ----------------------
    // public static void main(String[] args) {
    // StringBuilder str = new StringBuilder("Alpha");

    // for (int i = 0; i < str.length() / 2; i++) {
    // int start = i;
    // int end = str.length() - 1 - i;

    // char charStart = str.charAt(start);
    // char charEnd = str.charAt(end);

    // str.setCharAt(start, charEnd);
    // str.setCharAt(end, charStart);
    // }
    // System.out.println("Reverse string is : " + str);
    // }

    /*
     * public static void main(String[] args) {
     * // String str = "abc";
     * // String str1 = new String("xyz");
     * // System.out.println(str);
     * // System.out.println(str1);
     * 
     * // Scanner sc = new Scanner(System.in);
     * // String str = sc.nextLine();
     * // System.out.println(str);
     * 
     * // String firstName = "Aditya";
     * // String lastName = "Bile";
     * // String fullName = firstName + " " + lastName;
     * // System.out.println(fullName);
     * // System.out.println(fullName.length());
     * // System.out.println("Character at index 4 is " + fullName.charAt(4));
     * 
     * }
     */

    // Palindrome ---------------------------------------------------
    /*
     * public static Boolean getPalindrome(String check) {
     * // int n = check.length();
     * for (int i = 0; i < check.length(); i++) {
     * if (check.charAt(i) != check.charAt(check.length() - 1 - i)) {
     * return false;
     * }
     * }
     * return true;
     * }
     * 
     * public static void main(String args[]) {
     * String check = "noon";
     * Boolean ch1 = getPalindrome(check);
     * if (ch1) {
     * System.out.println("Is a palindrome");
     * } else {
     * System.out.println("Not a plaindrome");
     * }
     * 
     * }
     */

    // Finding Direction
    /*
     * public static float getDistance(String check) {
     * int X = 0;
     * int Y = 0;
     * for (int i = 0; i < check.length(); i++) {
     * if (check.charAt(i) == 'N') {
     * Y++;
     * }
     * if (check.charAt(i) == 'S') {
     * Y--;
     * }
     * if (check.charAt(i) == 'E') {
     * X++;
     * }
     * if (check.charAt(i) == 'W') {
     * X--;
     * }
     * }
     * int X2 = X * X;
     * int Y2 = Y * Y;
     * return (float) Math.sqrt(X2 + Y2);
     * }
     * 
     * public static void main(String args[]) {
     * String check = "N";
     * System.out.println(getDistance(check));
     * 
     * }
     */

    /*
     * public static String subString(String str, int si, int ei) {
     * String substr = "";
     * for (int i = si; i < ei; i++) {
     * substr += str.charAt(i);
     * }
     * return substr;
     * }
     * 
     * public static void main(String args[]) {
     * String str = "Welcome";
     * System.out.println(str.substring(2, 5));
     * // System.out.println(subString(str, 1, 6));
     * }
     * 
     */

    /*
     * public static void main(String args[]) {
     * StringBuilder sb = new StringBuilder("");
     * for (char ch = 'a'; ch <= 'z'; ch++) {
     * sb.append(ch);
     * }
     * System.out.println(sb);
     * }
     */

    /*
     * public static String toUpperCase(String str) {
     * StringBuilder sb = new StringBuilder("");
     * char ch = Character.toUpperCase(str.charAt(0));
     * sb.append(ch);
     * 
     * for (int i = 1; i < str.length(); i++) {
     * if (str.charAt(i) == ' ' && i < str.length() - 1) {
     * sb.append(str.charAt(i));
     * i++;
     * sb.append(Character.toUpperCase(str.charAt(i)));
     * 
     * } else {
     * sb.append(str.charAt(i));
     * }
     * }
     * return sb.toString();
     * }
     * 
     * public static void main(String args[]) {
     * String str = "hello, i am aditya";
     * System.out.println(toUpperCase(str));
     * System.out.println(str);
     * 
     * }
     */

    /*
     * public static String getCount(String str) {
     * StringBuilder sb = new StringBuilder("");
     * for (int i = 0; i < str.length(); i++) {
     * Integer count = 1;
     * while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
     * count++;
     * i++;
     * }
     * sb.append(str.charAt(i));
     * if (count > 1) {
     * sb.append(count);
     * }
     * 
     * }
     * return sb.toString();
     * }
     * 
     * public static void main(String args[]) {
     * String str = "aaabccddeeee";
     * System.out.println(getCount(str));
     * }
     */

    // public static String getCount(String str) {
    //     String newStr = " ";
    //     for (int i = 0; i < str.length(); i++) {
    //         Integer count = 1;
    //         while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    //             count++;
    //             i++;
    //         }
    //         newStr += str.charAt(i);
    //         if (count > 1) {
    //             newStr += count.toString();
    //         }

    //     }
    //     return newStr;
    // }

    // public static void main(String args[]) {
    //     String str = "aaabccddeeee";
    //     System.out.println(getCount(str));
    // }


    public static String compression(String str){
        // String newstr = "";
        StringBuilder newstr = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr.append(str.charAt(i));
            if(count>1){
                newstr.append(count.toString());
            }
        }
        return newstr.toString();
    }
    public static void main(String[] args){
        String str = "aaabbcdd";
        System.out.println(compression(str));
    }

}