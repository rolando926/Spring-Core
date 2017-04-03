package SpringCore_PropertiesFile;

import SpringCore_ObjectDependencies.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 3/31/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContextProperties.xml");
        ClassC myClassC = (ClassC) appContext.getBean("classC");
        myClassC.identifyClass();
    }


}


