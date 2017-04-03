package SpringCore_InitDestroy;

import java.awt.*;

/**
 * Created by RXC8414 on 4/3/2017.
 */
public class ClassA {
    private String strMessage;

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public void initMethod(){
        System.out.println("This is the init method...");
    }

    public void destroyMethod(){
        System.out.println("This is the destroy method...");
    }

    public void identifyClass(){
        System.out.println(strMessage);
    }
}
