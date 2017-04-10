package SpringCore20_ClassConfig_ObjectDependencies;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    public ClassC getClassC(){
        ClassC classC = new ClassC();
        return classC;
    }
}
