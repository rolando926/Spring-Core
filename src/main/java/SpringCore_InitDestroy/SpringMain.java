package SpringCore_InitDestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 4/3/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContextInitDestroy.xml");
        ClassA classA = (ClassA)appContext.getBean("classA");
        classA.identifyClass();

        //((ConfigurableApplicationContext)appContext).close();
        //((FileSystemXmlApplicationContext)appContext).close();
    }
}
