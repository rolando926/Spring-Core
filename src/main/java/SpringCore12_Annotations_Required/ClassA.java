package SpringCore12_Annotations_Required;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by RXC8414 on 4/4/2017.
 */
public class ClassA {
    private String strMessage;
    private String strAnnotation;

    public String getStrMessage() {
        return strMessage;
    }

    @Required
    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public String getStrAnnotation() {
        return strAnnotation;
    }

    @Required
    public void setStrAnnotation(String strClass) {
        this.strAnnotation = strClass;
    }

    public void identifyClass(){
        System.out.println(strAnnotation+":"+strMessage);
    }
}
