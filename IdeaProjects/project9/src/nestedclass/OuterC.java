package nestedclass;

public class OuterC {//OPENING OF OUTER CLASS

    InnerClassA ia = new InnerClassA();
    InnerClassB ib = new InnerClassB();

        public void outerClassMethodA(){
            System.out.println("Apple");
            ia.innerClassAMethodA();
            ia.innerClassAMethodB();
            ib.innerClassBMethodA();
            ib.innerClassBMethodB();
        }
        public void outerClassMethodB(){
            System.out.println("Avocado");
            ia.innerClassAMethodB();
            ia.innerClassAMethodA();
            ib.innerClassBMethodB();
            ib.innerClassBMethodA();
        }

        public class InnerClassA{
        public void innerClassAMethodA(){
            System.out.println("Grapes");

        }
        public void innerClassAMethodB(){
            System.out.println("GrapeFruit");
        }
    }
    public class InnerClassB{
        public void innerClassBMethodA(){
            System.out.println("Cheery");
        }
        public void innerClassBMethodB(){
            System.out.println("Plum");
        }
    }
}
