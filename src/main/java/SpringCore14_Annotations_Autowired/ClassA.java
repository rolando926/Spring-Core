package SpringCore14_Annotations_Autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RXC8414 on 4/5/2017.
 */
public class ClassA {
    private String strMessage;

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public void identifyClass(){
        System.out.println(strMessage);
    }
}
