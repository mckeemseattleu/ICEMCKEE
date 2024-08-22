package ICE9Pack;

import java.util.Random;

public class CreateMinStack {
   private static Node head;

   /**
    * The Node class creates Node objects that hold an integer and the
    * location of the next Node in the list.
    */

   private class Node {
      int element;      //The value to be stored in the Node
      Node next;        //The node that this Node will point to

      /**
       * Single argument constructor
       * @param el   The value to be stored in the node.
       */

      private Node(int el) {
         element = el;  //The value to be stored in the Node
         next = null;   //The node that this Node will point to
      }

      private Node(int el, Node n)
      {
         element = el;
         next = n;
      }
   }

   public static void main(String[] args) {
      Random rand = new Random();
      CreateMinStack stack = new CreateMinStack();
      final int NODES = 10;

      for (int i = 0; i < NODES; i++) {
         Node newNode = stack.new Node(rand.nextInt(100) + 1, head);
         head = newNode;
      }
      printNodes();
      System.out.println("The minimum value is " + min());

   }

   public static int min() {
      Node current = head;
      int min = current.element;

      while (current != null) {
         if (min > current.element) {
            min = current.element;
         }
         current = current.next;
      }
      return min;
   }

   public static void printNodes() {
      Node current = head;
      while (current != null) {
         System.out.println("Node: " + current.element);
         current = current.next;
      }
   }
}
