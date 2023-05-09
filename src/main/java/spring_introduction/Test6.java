package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//
//        System.out.println("is this the same objects?  " + (cat1==cat2));
//
//        System.out.println(cat1);
//        System.out.println(cat2);

//        cat.sound();

        Person person =context.getBean("personBean", Person.class);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getHobby());


//        Person person2 =context.getBean("personBean", Person.class);
//        person.callYourPet();

        context.close();
    }
}
