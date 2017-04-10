package SpringCore16_Annotations_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by RXC8414 on 3/30/2017.
 */
public class ClassC {
    @Autowired
    private ClassA objClassA;

    @Autowired
    @Qualifier("classBExt")
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