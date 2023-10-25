import java.util.Queue;

public class QueueLinkedListADT {
    // add queueu
    public static void queueAdd(Queue<String> queue){
        queue.add("IPhone");
        queue.add("Samsung");
        queue.add("Nokia");
        queue.add("Vertu");
        System.out.println(" Queue : " + queue);
    }
    // Add elements to a queue using the offer method
    public static void queueOffer(Queue<Integer> queue){
        for(int i = 0; i <= 10; i++){
            queue.offer(i);
        }
        System.out.println("Queue LinkedList : " + queue);
    }
    // View the element at the beginning of a queue using the peek method
    public static void queuePeek(Queue<Integer> queue){
        int accessElement = queue.peek();
        System.out.println("accessElement Queue LinkedList : " + accessElement);
        System.out.println("Queue LinkedList : " + queue);
    }
    // poll queueu : remove element in Queueu
    public static void queueRemove(Queue<Integer> queue){
        int removeElement = queue.poll();
        System.out.println("removeElement Queue LinkedList : " + removeElement);
        System.out.println("After remove LinkedList : " + queue);
    }

    // Search in Queue
    public static void queueSearch(Queue<Integer> queue, int value){
        boolean searchElement = queue.contains(value);
        if ( searchElement == false){
            System.out.println(value + " not in Queue");
        } else {
            System.out.println(value + " belongs to Queue " + searchElement);
        }
    }
    // for search
    public static void forQueue(Queue<Integer> queue){
        for(int i : queue){
            System.out.println(i);
        }
    }

}
