package nestedclass;

public class Skin {
  Muscle ms = new Muscle();
  Bone bn = new Bone();



    public void dark() {
        System.out.println("mostly African community");
        //ms.strong();
        //ms.weak();
        bn.skull();
        //bn.rib();
    }
    public void brown() {
        System.out.println("mostly Asian community");
        //ms.strong();
        //ms.weak();
        //bn.skull();
        //bn.rib();
    }
    public class Muscle {
        public void strong() {
            System.out.println("stronger people");
        }

        public void weak() {
            System.out.println("weaker people");
        }
    }
        public class Bone {
            public void skull() {
                System.out.println("strong skull");
            }
            public void rib() {
                System.out.println("weaker rib");
            }
        }
    }

