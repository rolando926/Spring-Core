package SpringCore14_Annotations_Autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RXC8414 on 4/5/2017.
 */
public class ClassB {
    @Autowired
    private ClassA myClassA;

    @Autowired
    private Integer value;

    @Autowired
    private String strMessage;


    public void identifyClass(){
        myClassA.identifyClass();
        System.out.println(value);
        System.out.println(strMessage);
    }
}
