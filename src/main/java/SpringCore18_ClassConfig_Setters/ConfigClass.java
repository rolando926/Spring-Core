package SpringCore18_ClassConfig_Setters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public ClassA getClassA(){
        ClassA myClassA = new ClassA();
        myClassA.setStrMessage("This is ClassA from Config Class.");
        return myClassA;
    }

}
