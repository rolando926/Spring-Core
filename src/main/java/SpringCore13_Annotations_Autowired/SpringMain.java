package SpringCore13_Annotations_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 4/4/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContext13AnnotationAutowired.xml");
        ClassA classA = appContext.getBean("classA",ClassA.class);
        classA.identifyClass();

    }
}
