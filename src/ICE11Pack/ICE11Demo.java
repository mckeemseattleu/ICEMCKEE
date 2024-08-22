/*
 * Mike McKee
 * CPSC 5002, Seattle University 
 * This is free an unencumbered software released into public domain. 
 */
package ICE11Pack;



/**
 * This program tests the Stack and Queue classes. 
 * @author Mike McKee
 */
public class ICE11Demo
{

    public static void main(String[] args) { 
        //Test String stack
        Stack<String> stringStack = new Stack<String>();
        System.out.println("A STACK OF STRINGS");
        System.out.println("Testing empty method: (true) " 
                            + stringStack.empty());
        
        System.out.println("Pushing 3 Strings onto stack...");       
        stringStack.push("I love dogs.");
        stringStack.push("Dogs are cute.");
        stringStack.push("Go dogs!");
        
        System.out.println("Testing toString: " + stringStack);
        System.out.println("Testing empty(): (false) " 
                           + stringStack.empty());

        //Test Integer stack
        Stack<Integer> intStack = new Stack<Integer>();
        System.out.println("\nA STACK OF INTEGERS");
        System.out.println("Testing empty method: (true) "
                + stringStack.empty());

        System.out.println("Pushing 3 integers onto stack...");
        intStack.push(88);
        intStack.push(99);
        intStack.push(1001);

        System.out.println("Testing toString: " + intStack);
        System.out.println("Testing empty(): (false) "
                + intStack.empty());

        //Test queue of Strings
        //Queue  stringQue = new Queue();
        Queue<String> stringQue = new Queue<String>();
        System.out.println("\nA QUEUE OF STRINGS");
        System.out.println("Testing empty method: (true) " 
                            + stringQue.empty());
        System.out.println("Pushing 3 Strings onto queue...");
        stringQue.enqueue("I");
        stringQue.enqueue("love");
        stringQue.enqueue("dogs");
        System.out.println("(I love dogs) " + stringQue); //test toString method
        System.out.println("(dogs love I) " + stringQue.reverseQueue());

        Queue<String> sqCopy = stringQue.copy();
        System.out.println("Copy of (I love dogs) " + sqCopy);

        //Test queue of Integers
        //Queue  intQue = new Queue();
        Queue<Integer> intQue = new Queue<Integer>();
        System.out.println("\nA QUEUE OF Integers");
        System.out.println("Testing empty method: (true) "
                + stringQue.empty());
        System.out.println("Pushing 3 Integers onto queue...");
        intQue.enqueue(1);
        intQue.enqueue(2);
        intQue.enqueue(3);
        System.out.println("(1 2 3) " + intQue); //test toString method

     }
}