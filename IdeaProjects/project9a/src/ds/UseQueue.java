package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>(); //why newQueue or array list doesn't work?
        queue.add("Brishti");
        queue.add("Shama");
        queue.add("Pranti");
        queue.add("Priyana");

        /*System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        *//*without being any change it is calling one after
         another from the beginning, but if you wanna call
         them together use itertor*/
//using iterator traverse through the LinkedList
        /*Iterator it = queue.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }    // we can also do by for loop */
//using for each traverse through the LinkedList
        /*for (String st: queue){
            System.out.println(st);  // this is another way to call by for loop or while loop
        }*

        //using while as long as LinkedList is not isEmpty()
         while (!queue.isEmpty()){
             System.out.println(queue.poll());
         }
    }
}
