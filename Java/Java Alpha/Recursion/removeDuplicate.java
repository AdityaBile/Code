package Recursion;

public class removeDuplicate {
    public static void removeDupli(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDupli(str, idx+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDupli(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args){
        String str = "apnnacollege";
        removeDupli(str, 0, new StringBuilder(""), new boolean[26]);
    } 
}
