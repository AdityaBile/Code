import java.util.*;

public class heapFirst {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        //Add data
        public void add(int data){ // O(logn)
            // add at last index
            arr.add(data);
            
            int x = arr.size()-1;
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x= par;
                par = (x-1)/2;
            }
        }

        // Peek
        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left<arr.size() && arr.get(left)<arr.get(minIdx)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(right)<arr.get(minIdx)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i , arr.get(minIdx));
                arr.set(minIdx, temp);


                heapify(minIdx);
            }


        }

        public int remove(){
            int data = arr.get(0);

            // Swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // remove last number
            arr.remove(arr.size()-1);

            heapify(0);
            return data;
        }
        
        public boolean isEmpty() {
            return arr.size()==0;
        } 

    }
    public static void main(String[] args){
        Heap h = new Heap();
        h.add(3);
        h.add(5);
        h.add(1);
        h.add(2);

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

    }
}
