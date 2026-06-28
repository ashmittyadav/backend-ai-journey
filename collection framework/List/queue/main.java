package queue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new Queue() {
        // }<>();

        
        q.offer(34);                   // add element in queue
        q.offer(32);
        q.offer(7);
        q.offer(30);
        q.offer(56);
        System.out.println(q);

        System.out.println(q.size());    // size of queue
        
        q.poll();                       // remove element from queue
        System.out.println(q);

        System.out.println(q.peek());  // show front element first

        System.out.println(q.isEmpty());     // check if queue is empty or not

        q.poll();
        q.poll();
        q.poll();
        q.poll();

        System.out.println(q.isEmpty());


    }
}
