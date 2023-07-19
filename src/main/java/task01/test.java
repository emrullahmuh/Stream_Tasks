package task01;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class test {
    public static void main(String[] args) {
         cities city=new cities();


  city.addCity("london");
        city.addCity("tokyo");
        city.addCity("istanbul");
        city.addCity("brooklyn");
        city.addCity("miami");
        city.addCity("adana");
        city.addCity("mersin");
        System.out.println(city.getCities());

       // Function<cities,String >name=





    }
}
