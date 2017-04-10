package SpringCore20_ClassConfig_ObjectDependencies;

/**
 * Created by RXC8414 on 4/6/2017.
 */
public class ClassB {
    private String strMessage;

    public void setStrMessage(String strMessage) {
        this.strMessage = strMessage;
    }

    public String identifyClass(){
        return strMessage;
    }
}
