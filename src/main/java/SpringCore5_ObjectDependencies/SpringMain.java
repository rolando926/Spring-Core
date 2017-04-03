package SpringCore5_ObjectDependencies;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 3/30/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("src\\main\\resources\\appContext5ObjectDependencies.xml");
        ClassC myClassC = appContext.getBean("classC",ClassC.class);
        ClassC myClassCWithConst = appContext.getBean("classCWithConstructor",ClassC.class);
        myClassC.identifyClass();
        myClassCWithConst.identifyClass();
    }
}
