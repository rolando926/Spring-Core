package SpringCore17_ClasssConfig_BasicAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by RXC8414 on 3/27/2017.
 */
public class SpringMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ClassConfig.class);
        ClassA myClassA = appContext.getBean(ClassA.class);
        ClassB myClassB = appContext.getBean(ClassB.class);

        myClassA.identifyClass();
        myClassB.identifyClass();

        appContext.close();
    }
}
