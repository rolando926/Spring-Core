package SpringCore13_Annotations_Autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RXC8414 on 4/4/2017.
 */
public class ClassA {
    private String strMessage;
    private String strAnnotation;

    public String getStrAnnotation() {
        return strAnnotation;
    }

    @Autowired
    public void setStrAnnotation(String strAnnotation) {
        this.strAnnotation = strAnnotation;
    }

    public String getStrMessage() {
        return strMessage;
    }

    @Autowired
    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public void identifyClass(){
        System.out.println(strAnnotation+":"+strMessage);
    }
}
