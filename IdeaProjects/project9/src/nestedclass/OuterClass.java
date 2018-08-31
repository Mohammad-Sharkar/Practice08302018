package nestedclass;
//Mfi bhai teach this
public class OuterClass {
    InnerClassA innerA = new InnerClassA();

    public void outerMethodA() {
        System.out.println("InnerA MethodA");
        innerA.innerAMethodA();
    }

    public void outerMethodB() {
        System.out.println("InnerA MethodB");
    }
    public class InnerClassA {

        public void innerAMethodA() {
            System.out.println("InnerA MethodA");

        }

        public void innerAMethodB() {
            System.out.println("InnerA MethodB");
        }

        public class InnerClassB {
            public void innerBMethodA() {
                System.out.println("InnerB MethodA");

            }

            public void innerBMethodB() {
                System.out.println("InnerB MethodB");
            }
        }
    }
}