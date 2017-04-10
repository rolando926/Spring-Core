package SpringCore16_Annotations_Qualifier;

/**
 * Created by RXC8414 on 3/30/2017.
 */
public class ClassB {
    private String strMessage;

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public String identifyClass(){
        return strMessage;
    }
}
