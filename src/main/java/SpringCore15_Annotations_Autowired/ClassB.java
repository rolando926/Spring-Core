package SpringCore15_Annotations_Autowired;

/**
 * Created by RXC8414 on 4/5/2017.
 */
public class ClassB {
    private String strMessage;

    public ClassB(String strMessage) {
        this.strMessage = strMessage;
    }

    public String identifyClass(){
        return strMessage;
    }
}
