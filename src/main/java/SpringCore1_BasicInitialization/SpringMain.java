package SpringCore1_BasicInitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        //ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContext1.xml");
        //ClassA myClassA = (ClassA) appContext.getBean(ClassA.class);
        //ClassB myClassB = (ClassB) appContext.getBean(ClassB.class);

        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ClassConfig.class);
        ClassA myClassA = appContext.getBean(ClassA.class);
        ClassB myClassB = appContext.getBean(ClassB.class);

        myClassA.identifyClass();
        myClassB.identifyClass();

        appContext.close();
    }
}
