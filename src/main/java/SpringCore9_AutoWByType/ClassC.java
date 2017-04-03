package SpringCore9_AutoWByType;

/**
 * Created by RXC8414 on 3/30/2017.
 */
public class ClassC {
    private ClassA objClassA;
    private ClassB objClassB;

    public ClassA getObjClassA() {
        return objClassA;
    }

    public void setObjClassA(ClassA objClassA) {
        this.objClassA = objClassA;
    }

    public ClassB getObjClassB() {
        return objClassB;
    }

    public void setObjClassB(ClassB objClassB) {
        this.objClassB = objClassB;
    }

    public void identifyClass() {
        String str = "This is ClassC: ";
        if (objClassA != null) str+= objClassA.identifyClass();
        if (objClassB != null) str+= objClassB.identifyClass();

        System.out.println(str);
    }
}