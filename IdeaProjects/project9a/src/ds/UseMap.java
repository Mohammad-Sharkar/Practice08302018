package ds;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<String, String> cityNcountry = new HashMap<String, String>();
        cityNcountry.put("USA", "NY");
        cityNcountry.put("Canada", "Montreal");
        cityNcountry.put("UK", "London");
        cityNcountry.put("BANGLADESH", "Dhaka"); //font doesn't matter

        for (Map.Entry<String, String> state: cityNcountry.entrySet()){
            System.out.println(state.getKey() + " " + state.getValue() );
        }

    }
}
