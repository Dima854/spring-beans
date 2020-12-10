package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage extends Timer {


    @Autowired
    @Qualifier("dog")
    private Animal animal;



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(this.getTime().toString());
        System.out.println("________________________");
    }
}
