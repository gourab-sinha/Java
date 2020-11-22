package Module5.Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperations {
    public void queueFirst(){
        System.out.println("Normal queue operations");
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<5;i++){
            queue.add(i);
        }

        System.out.println(queue.peek()); // returns front value
        System.out.println(queue.poll()); // returns front value and removes from the queue
        System.out.println(queue.peek());
        System.out.println(queue.contains(4)); // true if present else false
    }

    public void queueSecond(){
        System.out.println("Priority queue operations");
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for(int i=5;i>0;i--){
            priorityQueue.add(i);
        }

        System.out.println(priorityQueue.peek()); // returns front value
        System.out.println(priorityQueue.poll()); // returns front value and removes from the queue
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.contains(4)); // true if present else false
    }
}
