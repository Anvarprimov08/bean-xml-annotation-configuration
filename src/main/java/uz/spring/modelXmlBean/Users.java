package uz.spring.modelXmlBean;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public  class Users {
    private String name;
    private int age;
    private String address;

    public Users() {
        System.out.println("I am a user");
    }
}
