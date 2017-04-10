package SpringCore19_ClassConfig_Constructors;

/**
 * Created by RXC8414 on 4/6/2017.
 */
public class ClassA {
    private String strMessage1;
    private String strMessage2;

    public ClassA(String strMessage1, String strMessage2) {
        this.strMessage1 = strMessage1;
        this.strMessage2 = strMessage2;
    }

    public void identifyClass(){
        System.out.println(strMessage1+":"+strMessage2);
    }
}
