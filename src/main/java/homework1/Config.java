package homework1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class Config {


    private Map<String, Television> television = new HashMap<>();


    @Bean
    public Apartment getApartment() {
        Apartment apartment = new Apartment(10, 300.0);
        apartment.setFloor(45);
        apartment.setPrice(9500000);
        apartment.setMapTelevision(television);

        return apartment;
    }

    @Bean
    public Map<String, Television> setTelevision() {
        television.put(setTele().model, setTele());
        television.put(setTele1().model, setTele1());
        television.put(setTele2().model, setTele2());
        return television;

    }

    @Bean(initMethod = "setInfo")
    public Television setTele() {
        return new Television("T900", "Sony", 2000);
    }

    @Bean(initMethod = "setInfo")
    public Television setTele1() {
        return new Television("T950", "Sony", 3000);
    }

    @Bean(initMethod = "setInfo")
    public Television setTele2() {
        return new Television("V1000", "Haier", 4000);
    }



}
