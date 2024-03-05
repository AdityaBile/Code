// package Queue;

import java.util.Queue;

public class arrayQ {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;

            //For circular queue
            front = -1;
        }

        public static boolean isEmpty(){
            // return rear == -1;

            //  For circular queue
            return rear == -1 && front == -1;
        }

        //For circular queue

        public static boolean isFull(){
            return (rear+1)%size == front;
        }
    
        public static void add(int data){
            // if(rear == size-1){
            //     System.out.println("Queue is full");
            // }
            // rear = rear+1;
            // arr[rear] = data;

            //for circular Queue
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }

            if(front == -1){
                front = 0;
            }

            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] =arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        //Remove for circular queue
        public static int removeCq(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if(rear==front){
                rear= front = -1;
            }
            else{
                front = (front+1) % size;
            }

            return result;
        }

        // public static void peek(){
        //     if(isEmpty()){
        //         System.out.println("Queue is empty");
        //         return;
        //     }
        //     System.out.println(arr[0]);
        //     return;

        // }

        //           OR

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

        //peek for circular queue
        public static int peekCq(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }    

    public static void main(String[] args){
        Queue q = new Queue(5);
        
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);

        
        
        // while(!q.isEmpty()){
        //     q.peek();
        //     //         or
        //     System.out.println(q.peek());
        //     q.remove();
        // }

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.removeCq());
        q.add(4);
        System.out.println(q.removeCq());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peekCq());
            q.removeCq();
        }

    }
    
}
