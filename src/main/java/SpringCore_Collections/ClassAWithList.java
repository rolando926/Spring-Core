package SpringCore_Collections;

import java.util.List;

/**
 * Created by RXC8414 on 3/28/2017.
 */
public class ClassAWithList {
    private List<String> students;

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }

    public void printList(){
        for (String temp:students) {
            System.out.println(temp);
        }
    }
}
