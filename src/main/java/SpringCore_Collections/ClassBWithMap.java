package SpringCore_Collections;

import java.util.Map;
import java.util.Set;

/**
 * Created by RXC8414 on 3/28/2017.
 */
public class ClassBWithMap {
    private Map<String,String> students;

    public Map<String, String> getStudents() {
        return students;
    }

    public void setStudents(Map<String, String> students) {
        this.students = students;
    }

    public void printMap(){
        Set<String> keys = students.keySet();
        for (String key:keys) {
            System.out.println(key+":"+students.get(key));
        }
    }
}
