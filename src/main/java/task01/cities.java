package task01;

import java.util.ArrayList;
import java.util.List;

public class cities {

    private List<String>cities=new ArrayList<>();

    public void addCity(String city){
        cities.add(city);
    }
    public List<String> getCities() {
        return cities;
    }
public String getName(){
      String name="";
    for (String city : getCities()) {
        name=city;
    }


        return name;
}


}
