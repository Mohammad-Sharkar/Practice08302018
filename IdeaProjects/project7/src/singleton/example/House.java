package singleton.example;

public class House {
    private static House house;
    //private House house = null;
    private House(){//constructor
    }
    public static House getSingleton(){
        house = new House();
        return house;
    }
    public void displayHouseDim(){
        System.out.println("99 by 99");
    }
}
