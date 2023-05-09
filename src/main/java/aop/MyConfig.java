package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//we will not use configuration xml, but we will use java code for configuration
@Configuration
@ComponentScan("aop")
@EnableAspectJAutoProxy   //@EnableAspectJAutoProxy gives us to use Spring Aop Proxy
public class MyConfig {

}
