package SpringCore12_Annotations_Required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 4/4/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContext12AnnotationRequired.xml");
        ClassA classA = (ClassA)appContext.getBean("classA");
        classA.identifyClass();
    }
}
