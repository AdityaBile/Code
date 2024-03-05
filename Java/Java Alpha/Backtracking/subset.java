public class subset {
    public static void subsetFun(String str, String ans, int i){
        // Base case
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        // kaam
        // yes
        subsetFun(str, ans+str.charAt(i), i+1);
        // no
        subsetFun(str, ans, i+1);
    }
    public static void main(String[] args){
        String str = "abc";
        subsetFun(str, "", 0);
    }
}
