package SpringCore_PropertiesFile;

/**
 * Created by RXC8414 on 3/31/2017.
 */
public class ClassA {
    private String strMessage1;

    public ClassA(String strMessage1) {
        this.strMessage1 = strMessage1;
    }

    public String getStrMessage1() {
        return strMessage1;
    }

    public void setStrMessage1(String strMessage1) {
        this.strMessage1 = strMessage1;
    }

    public String identifyClass(){
        return strMessage1;
    }
}
