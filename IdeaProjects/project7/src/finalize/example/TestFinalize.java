package finalize.example;

public class TestFinalize {

    public static void main(String[] args) {
        String st = new String ("House");
        System.out.println(st);
        st = null;
        TestFinalize tf = new TestFinalize();
        tf.finalize();
        System.gc();
        System.out.println("End of main");
        System.gc();
    }
    //how to write override
    public void finalize(){
        System.out.println("Finalize method has been called.....");
    }
}//end of main ashar kotha na, keno ashtese?
//finalize kata keno?
