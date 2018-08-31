package ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMapWithList {
    public static void main(String[] args) {
        List<String> cityofUSA = new ArrayList<String>();
        cityofUSA.add("NEWYORK");
        cityofUSA.add("TAMPA");
        cityofUSA.add("RAI");
        cityofUSA.add("TUCKER");

        List<String> cityofBD = new ArrayList<String>();
        cityofBD.add("DHAKA");
        cityofBD.add("COMILLA");
        cityofBD.add("RAJSHAHI");
        cityofBD.add("NOAKHALI");

        List<String> cityofUK = new ArrayList<String>();
        cityofUK.add("LIVERPOOL");
        cityofUK.add("CHELSEA");
        cityofUK.add("MANCHESHTER");
        cityofUK.add("BRISBANE");

        Map<String, List<String>> listOfCountryNCity = new HashMap<String, List<String>>();
        listOfCountryNCity.put("USA", cityofUSA);
        listOfCountryNCity.put("UK", cityofUK);
        listOfCountryNCity.put("BD", cityofBD);

        for (Map.Entry<String, String> state:countryNcity.entrySet()){
            System.out.println(state.getKey() + "---->" + state.getValue());
        }
    }
}
