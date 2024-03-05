import java.util.*;
public class reverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }

        return result.toString();
    }
    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        System.out.println("Reverse order of string is : "+reverse("Aditya Bile"));
    }
}
