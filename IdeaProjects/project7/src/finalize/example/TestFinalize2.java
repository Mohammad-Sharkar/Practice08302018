package finalize.example;

public class TestFinalize2 {
    public static void main(String[] args) {
        String st = new String("House");
        System.out.println(st);//why null?
        st = null;
        TestFinalize tf = new TestFinalize();
        tf.finalize();
        System.gc();
        System.out.println("End of main");
        System.gc();
    }


     @Override
    public void other(){//why kata? how to write override..
        System.out.println("Finalize method hasbeen called....");
    }
}
