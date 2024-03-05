import java.util.*;
public class pustBottom {
    public static void bottom(Stack<Integer> st, int n){
        if(st.isEmpty()){
            st.push(n);
            return;
        }
        int top = st.pop();
        bottom(st,n);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        bottom(st, 4);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        
    }

}
