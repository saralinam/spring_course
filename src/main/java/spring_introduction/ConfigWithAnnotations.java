package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");


        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getLastName());
        System.out.println(person.getFirstName());
        System.out.println(person.getHobby());

//        Cat myCat = context.getBean("catBean", Cat.class);
//        myCat.sound();

        context.close();
    }
}
