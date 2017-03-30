package SpringCore_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by RXC8414 on 3/28/2017.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new FileSystemXmlApplicationContext("file:src\\main\\resources\\appContextCollection.xml");
        ClassAWithList myClassA = appContext.getBean("classA",ClassAWithList.class);
        ClassBWithMap myClassB = appContext.getBean("classB",ClassBWithMap.class);
        //myClassA.printList();
        myClassB.printMap();
    }
}
