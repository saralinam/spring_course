package spring_introduction;

import org.springframework.context.annotation.*;


@Configuration
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_introduction")
public class MyConfig {

    @Bean
    @Scope("singleton")  //Default, the same object is returned each time
//    @Scope("prototype")   //new object created each time it is injected
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    //we don't have to show @Scope("singleton"), because it is default
    public Person personBean(){
        return new Person(catBean());
    }
}
