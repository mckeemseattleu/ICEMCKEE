/** 
   The LinkedQueueDemo class demonstrates 
   the use of the LinkedQueue class.
*/

package ICE10Pack;

public class LinkedQueueIntDemo
{
    public static void main(String [] args)
    {
        LinkedQueueInt queue = new LinkedQueueInt();
        
        // Add 4 names
       int [] nums =
		      {1, 2, 3, 4};
       System.out.println("Adding nums: ");
       for (int s : nums)
       {
           System.out.print(s + " ");
           queue.enqueue(s);         
       }
       
       System.out.println("\nState of queue is: ");
       System.out.println(queue);
       
       // Remove 2 names
       System.out.println("Removing 2 nums.");
       queue.dequeue(); queue.dequeue();   
       System.out.println("State of queue is: ");
       System.out.println(queue);
       
       // Add another name
       System.out.println("Adding the num 10:");
       queue.enqueue(10);
       System.out.println("State of queue is: ");
       System.out.println(queue);
        System.out.println("Queue Max is: ");
        System.out.println(queue.getMax());
        System.out.println("Queue Min is: ");
        System.out.println(queue.getMin());
    }
}