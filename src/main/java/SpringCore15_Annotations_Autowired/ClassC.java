package SpringCore15_Annotations_Autowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RXC8414 on 4/5/2017.
 */
public class ClassC {
    private ClassA objClassA;
    private ClassB objClassB;

    @Autowired
    public ClassC(ClassA objClassA, ClassB objClassB) {
        this.objClassA = objClassA;
        this.objClassB = objClassB;
    }

    public void identifyClass(){
        String str = "This is ClassC :";
        if(objClassA != null) str += objClassA.identifyClass();
        if(objClassB != null) str += objClassB.identifyClass();
        System.out.println(str);
    }
}
