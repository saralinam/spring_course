package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component annotation can be used constructor, setter & variable

//@Component("personBean")
public class Person {

//    @Autowired        //3.  @Autowired dependency injection with variable
//    @Qualifier("catBean")     //usually @Qualifier will be after the annotation @Autowired
    private Pet pet;

    @Value("${person.lastName}")
    private String lastName;
    @Value("${person.firstName}")
    private String firstName;
    @Value("${person.hobby}")
    private String hobby;


    //1.  @Autowired for constructor
    //if you have one constructor, you don't need to use @Autowired annotation but still works.
    //we will use just for readability with one constructor in parent class
//    @Autowired   //1. @Autowired for constructor
//    public Person( @Qualifier("catBean") Pet pet) {
//        System.out.println("Person bean is created ");
//        this.pet = pet;
//    }

    public Person(Pet pet) {
        System.out.println("Person bean is created ");
        this.pet = pet;
    }


//    public Person() {
//        System.out.println("Person bean is created ");
//        this.pet = pet;
//    }

    //2.dependency injection with setter
    //pet -> setPet

//    @Autowired  //2. @Autowired for setter
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Hi, my lovely Pet!");
        pet.sound();
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        System.out.println("Class Person:  set lastName");
        this.lastName = lastName;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        System.out.println("Class Person:  set firstName");
        this.firstName = firstName;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        System.out.println("Class Person:  set hobby");
        this.hobby = hobby;
    }
}
