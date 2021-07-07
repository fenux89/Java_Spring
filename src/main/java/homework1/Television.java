package homework1;

import lombok.Data;

@Data
public class Television implements ITelevision{
    String model;
    String company;
    double price;

    public Television() {
    }

    public Television(String model, String company, double price) {
        this.model = model;
        this.company = company;
        this.price = price;
    }

    public void setInfo(){
        System.out.println("Модель " + model + "\nКомпания " + company + "\nЦена " + price);
    }

  

}
