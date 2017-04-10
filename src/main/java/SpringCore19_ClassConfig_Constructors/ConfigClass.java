package SpringCore19_ClassConfig_Constructors;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public ClassA getClassA(){
        ClassA classA = new ClassA("Full Annotation","This is ClassA.");
        return classA;
    }
}
