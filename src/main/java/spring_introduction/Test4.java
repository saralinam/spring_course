package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext  context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        //singleton scope
        //we will get the same output, because it will make one object, one address
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Bella");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Maybe");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());


//        System.out.println("myDog and yourDog are the same ?  " +(myDog==yourDog));   // true
//        System.out.println(myDog);       //spring_introduction.Dog@3857f613
//        System.out.println(yourDog);    //spring_introduction.Dog@3857f613


        //prototype scope
        //we will get the different output, because it will make different object and address each time
//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Bella");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Maybe");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());


//        System.out.println("myDog and yourDog are the same ?  " +(myDog==yourDog));   // false
//        System.out.println(myDog);       //spring_introduction.Dog@1fa121e2
//        System.out.println(yourDog);    //spring_introduction.Dog@7eac9008



        context.close();


    }
}
