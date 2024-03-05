// package Stack;
import java.util.ArrayList;
import java.util.Stack;

public class arrayList {
    public class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        //empty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

    public static void main(String args[]){
        Stack st = new Stack();
        st.add(1);
        st.add(2);
        st.add(3);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
