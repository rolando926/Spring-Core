package SpringCore17_ClasssConfig_BasicAnnotation;

/**
 * Created by RXC8414 on 3/27/2017.
 */
public class ClassA {
    private String strMessage;

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public void identifyClass(){
        System.out.println("This is ClassA...");
    }
}
