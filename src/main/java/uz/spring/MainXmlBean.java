package uz.spring;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.spring.modelXmlBean.Car;
import uz.spring.modelXmlBean.Users;

public class MainXmlBean {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Users bean = context.getBean(Users.class);
        Users user = (Users) context.getBean("users");
        System.out.println(bean);
        System.out.println(user);

        Car carBean = (Car) context.getBean("car");
        Car car = context.getBean(Car.class);
        System.out.println(car);
        System.out.println(carBean);

        System.out.println(bean == user);
        System.out.println(car.equals(carBean));
    }
}
