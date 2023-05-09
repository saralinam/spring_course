package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Pet pet = new Cat();

        //1. dependency injection with constructor
//        Person person = context.getBean("myPerson", Person.class);
//        person.callYourPet();


        //2.dependency injection with setter

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getLastName());
        System.out.println(person.getFirstName());
        System.out.println(person.getHobby());

        context.close();
    }
}
