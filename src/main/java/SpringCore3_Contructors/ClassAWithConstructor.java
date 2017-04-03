package SpringCore3_Contructors;

/**
 * Created by RXC8414 on 3/28/2017.
 */
public class ClassAWithConstructor {

    private String strMessage;
    private String strIdentifier;

    public ClassAWithConstructor(String strMessage, String strIdentifier) {
        this.strMessage = strMessage;
        this.strIdentifier = strIdentifier;
    }

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
