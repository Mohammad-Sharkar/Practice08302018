package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {

        int num =16;
        try {
            int result = num / 0;
            System.out.println(result);
        } catch (Exception ex){//how to write it?
          System.out.println("you can't divide a number by zero, go learn math first");
       }
        System.out.println("I was able to come to this point");//what is efell??? someone asking question
    }
}
