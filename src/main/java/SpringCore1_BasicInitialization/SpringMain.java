package SpringCore1_BasicInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 3/27/2017.
 */
public class SpringMain {
    int x = 1;
    public static void main(String[] args) {
        //ClassA myClassA = new ClassA();
        //ClassB myClassB = new ClassB();

        //myClassA.identifyClass();
        //myClassB.identifyClass();

        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContext1.xml");
        ClassA myClassA = (ClassA) appContext.getBean(ClassA.class);
        ClassB myClassB = (ClassB) appContext.getBean(ClassB.class);

    }
}
