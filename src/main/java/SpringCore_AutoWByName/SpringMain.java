package SpringCore_AutoWByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 4/3/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContextAutoWByName.xml");
        ClassC classC = appContext.getBean("classCAuto", ClassC.class);
        classC.identifyClass();
    }
}
