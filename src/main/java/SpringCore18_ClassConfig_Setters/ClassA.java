package SpringCore18_ClassConfig_Setters;

/**
 * Created by RXC8414 on 4/6/2017.
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
