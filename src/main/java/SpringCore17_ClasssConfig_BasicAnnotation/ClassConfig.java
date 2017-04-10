package SpringCore17_ClasssConfig_BasicAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassConfig {
    @Bean
    public ClassA getClassA(){
        ClassA myClassA = new ClassA();
        return myClassA;
    }

    @Bean
    public ClassB getClassB(){
        ClassB myClassB = new ClassB();
        return myClassB;
    }
}
