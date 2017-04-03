package SpringCore4_pNamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 3/29/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContext4Namespace.xml");
        ClassAUsingNamespace myClassA = appContext.getBean("classA",ClassAUsingNamespace.class);
        myClassA.identifyClass();
    }


}
