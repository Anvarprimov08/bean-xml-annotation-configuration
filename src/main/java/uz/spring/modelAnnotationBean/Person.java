package uz.spring.modelAnnotationBean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    public Person() {
        System.out.println("I am a person");
        this.name = "Anvar";
        this.age = 26;
    }
}
