package ds;

import java.util.List;
import java.util.Stack;
public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack= new Stack();
        stack.push("Dhaka");
        stack.push("Comilla");
        stack.push("Noakhali");
        stack.push("Rajshahi");


        /*System.out.println(stack.peek()); //to peek the top one*/

        /*if (stack.peek().equalsIgnoreCase("RAJSHAHI"))  //IF YOU WRITE nOAKHALI, IT WILL NOT APPEAR, only the last one.
        but if matches no problem with case
        System.out.println(stack.pop());*/

        while (!stack.empty()){   //while loop will apear when it is true, stack is not empty, so true, it appears
            System.out.println(stack.pop()); //peek dile keno unlimited Rajshahi ashe?

        }


        }

    }

