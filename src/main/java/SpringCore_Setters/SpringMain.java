package SpringCore_Setters;

import SpringCore_Contructors.ClassAWithConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 3/28/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        //ClassAWithConstructor myClassA = new ClassAWithConstructor("This is ClassA with Constructor...");

        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContextSetters.xml");
        ClassAWithSetters myClassA = appContext.getBean("classA",ClassAWithSetters.class);
        myClassA.identifyClass();
    }
}

