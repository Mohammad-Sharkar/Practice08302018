package singleton.example;

public class TestHouse {
    public static void main(String[] args) {
        House h1 = House.getSingleton();
        h1.displayHouseDim();
        House h2 = House.getSingleton();
        h2.displayHouseDim();
        System.out.println(h1.hashCode());
        System.out.println(h1.hashCode());
    }
}
