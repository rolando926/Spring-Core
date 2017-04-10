package SpringCore19_ClassConfig_Constructors;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by RXC8414 on 4/6/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigClass.class);
        ClassA classA = appContext.getBean(ClassA.class);
        classA.identifyClass();
        appContext.close();
    }
}
