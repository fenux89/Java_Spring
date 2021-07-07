package homework1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Config.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(Config.class);
        Apartment apartment = ctx.getBean("apartment", Apartment.class);
        Television tele = ctx.getBean("television", Television.class);
        // Television tele2 = ctx.getBean("televisionMap", Television.class);  // как то можно вывести Map в таком виде?

        Apartment apartment1 = app.getBean(Apartment.class);
        Television tele1 = app.getBean("setTele", Television.class);
        Television tele4 = app.getBean("setInit", Television.class);


        System.out.println();
        System.out.println("config.xml");
        System.out.println(apartment);
        System.out.println();
        System.out.println(tele);

        System.out.println();
        System.out.println("Config.class");
        System.out.println(apartment1);
        System.out.println();
        System.out.println(tele1);
        System.out.println(tele4);

        //      System.out.println(tele2);


    }
}
