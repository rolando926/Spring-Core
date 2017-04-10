package SpringCore16_Annotations_Qualifier;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 4/6/2017.
 */
public class SpringMain {

    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContext16AnnotationQualifier.xml");
        ClassC classC = appContext.getBean("classC",ClassC.class);
        classC.identifyClass();
    }

}
