package SpringCore5_ObjectDependencies;

/**
 * Created by RXC8414 on 3/30/2017.
 */
public class ClassA {
    private String strMessage;

    public ClassA(String strMessage) {
        this.strMessage = strMessage;
    }

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
