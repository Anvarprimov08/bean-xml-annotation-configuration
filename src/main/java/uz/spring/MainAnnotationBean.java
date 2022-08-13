package uz.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import uz.spring.modelAnnotationBean.Person;
import uz.spring.modelAnnotationBean.Animal;

public class MainAnnotationBean {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("uz.spring");

//        use following when declare AnnotationConfigApplicationContext with empty constructor
//        context.scan("uz.spring");
//        context.refresh();

        Person bean = context.getBean(Person.class);
        Person person = (Person) context.getBean("person");
        System.out.println(bean);
        System.out.println(person);

        Animal animalBean = (Animal) context.getBean("animal");
        Animal animal = context.getBean(Animal.class);
        System.out.println(animal);
        System.out.println(animalBean);

        System.out.println(bean == person);
        System.out.println(animal.equals(animalBean));
    }
}
