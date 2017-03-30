package SpringCore_BasicInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 3/27/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        //ClassA myClassA = new ClassA();
        //ClassB myClassB = new ClassB();

        //myClassA.identifyClass();
        //myClassB.identifyClass();

        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContext.xml");
        ClassA myClassA = appContext.getBean("classA",ClassA.class);
        ClassB myClassB = (ClassB)appContext.getBean("classB");

        myClassA.identifyClass();
        myClassB.identifyClass();
    }
}
