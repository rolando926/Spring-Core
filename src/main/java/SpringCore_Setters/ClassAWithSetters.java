package SpringCore_Setters;

/**
 * Created by RXC8414 on 3/28/2017.
 */
public class ClassAWithSetters {
    private String strMessage;
    private String strIdentifier;

    public String getStrIdentifier() {
        return strIdentifier;
    }

    public void setStrIdentifier(String strIdentifier) {
        this.strIdentifier = strIdentifier;
    }

    public String getStrMessage() {
        return strMessage;
    }

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public void identifyClass(){
        System.out.println(strIdentifier+":"+strMessage);
    }
}
