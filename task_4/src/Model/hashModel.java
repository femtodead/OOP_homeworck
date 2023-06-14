package Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class hashModel implements iGetModel{
    private HashMap<Long,Student> hashStudents;

    public hashModel(HashMap<Long,Student> hashStudents) {
        this.hashStudents = hashStudents;
    }

    @Override
    public List<Student> getAllStudentsList() {
        Collection<Student> temp = this.hashStudents.values();
        List<Student> my_list = new ArrayList<Student>(temp);
        return my_list;
    }

    @Override
    public HashMap<Long, Student> getAllStudentsHash() {
        return hashStudents;
    }

    @Override
    public void del(Student stud) {
        for (Map.Entry<Long, Student> item :  hashStudents.entrySet()) {
            if (item.getValue().equals(stud))
            {
                this.hashStudents.remove(item.getKey());
                break;
            }
        };
    }

    
}
