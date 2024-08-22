/** 
   The LinkedQueueDemo class demonstrates 
   the use of the LinkedQueue class.
*/
package ICE9Pack;

public class LinkedQueueDemo
{
    public static void main(String [] args)
    {
        LinkedQueue queue = new LinkedQueue();
        
        // Add 4 names
       String [ ] names = 
		      {"Alfonso", "Bob", "Carol", "Deborah"};
       System.out.println("Adding names: ");
       for (String s : names)
       {
           System.out.print(s + " ");
           queue.enqueue(s);         
       }
       
       System.out.println("\nState of queue is: ");
       System.out.println(queue);
       
       // Remove 2 names
       System.out.println("Removing 2 names.");
       queue.dequeue(); queue.dequeue();   
       System.out.println("State of queue is: ");
       System.out.println(queue);
       
       // Add another name
       System.out.println("Adding the name Elaine:");
       queue.enqueue("Elaine");
       System.out.println("State of queue is: ");
       System.out.println(queue);      
    }
}