package SpringCore11_AutoWByConstructor;

/**
 * Created by RXC8414 on 3/30/2017.
 */
public class ClassC {
    private ClassA objClassA;
    private ClassB objClassB;

    public ClassC(ClassA objClassA, ClassB objClassB) {
        this.objClassA = objClassA;
        this.objClassB = objClassB;
    }

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