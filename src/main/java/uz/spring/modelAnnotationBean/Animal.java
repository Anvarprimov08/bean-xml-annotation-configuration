package uz.spring.modelAnnotationBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Animal {
    private String name;
    private String color;

    public Animal(){
        System.out.println("I am a animal");
        this.name = "Rex";
        this.color = "black";
    }
}
