package homework1;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

@Data
public class Apartment implements IApartment {

    private int numberRooms;
    private double space;
    private Map<String,Television> television;
    private double price;
    private int floor;


    public Apartment(int numberRooms, double space) {
        this.numberRooms = numberRooms;
        this.space = space;

    }

    public void setMapTelevision(Map<String, Television> television){
        this.television=television;
    }
}
