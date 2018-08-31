package conditionalstatement;

import java.util.Scanner;

public class CompareValue2 {
    public static void main(String[] args) {
        Scanner nishat = new Scanner(System.in);//how Mafi bhai bring it?
        System.out.println("please enter two numbers: ");
        int num1 =nishat.nextInt(), num2 =nishat.nextInt();
        if (num1>num2){
            System.out.println("Num1 is greater than Num2");
        }else{
            System.out.println("Num2 is greater than Num1");
        }
    }
}
