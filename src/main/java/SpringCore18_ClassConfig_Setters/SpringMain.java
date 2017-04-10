package SpringCore18_ClassConfig_Setters;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by RXC8414 on 4/6/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigClass.class);
        ClassA myClassA = appContext.getBean(ClassA.class);
        myClassA.identifyClass();
        appContext.close();
    }
}
