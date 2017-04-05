package SpringCore14_Annotations_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 4/5/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContext14AnnotationAutowired.xml");
        ClassB classB = appContext.getBean("classB",ClassB.class);
        classB.identifyClass();
    }
}
