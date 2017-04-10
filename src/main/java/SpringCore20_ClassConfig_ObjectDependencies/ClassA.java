package SpringCore20_ClassConfig_ObjectDependencies;

/**
 * Created by RXC8414 on 4/6/2017.
 */
public class ClassA {
    private String strMessage;

    public ClassA(String strMessage) {
        this.strMessage = strMessage;
    }

    public String identifyClass(){
        return strMessage;
    }
}
