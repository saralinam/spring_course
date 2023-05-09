package spring_introduction;

import org.springframework.stereotype.Component;


//@Autowired  annotation can be used constructor, setter & variable


//@Component("catBean")
public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void sound() {
        System.out.println("Cat sound:  "+"Meow-meow");
    }
}
