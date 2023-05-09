package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//we didn't initialize Dog @Component annotation, it will be default (dog)
//@Scope("prototype")
//@Scope("singleton") default , gives your the same object and address
public class Dog implements Pet{


//    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void sound(){
        System.out.println("Dog sound:  " + "Woof, woof");
    }

//   @PostConstruct
//    protected void init(){
//        System.out.println("Class Dog: init method ");
//    }
//
//    @PreDestroy
//    private void destroy(){
//        System.out.println("Class Dog: destroy method ");
//    }

    //getter-setter

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
