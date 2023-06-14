package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class Model implements iGetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }


    @Override
    public List<Student> getAllStudentsList() {
        return students;
    }

    @Override
    public HashMap<Long, Student> getAllStudentsHash() {
        HashMap<Long, Student> hashStudets = new HashMap<>();
        for (long i = 0; i < this.students.size(); i++) {
            hashStudets.put(i, this.students.get((int)i));
        }
        return hashStudets;
    }

    @Override
    public void del(Student stud) {
        this.students.remove(stud);
    }    
}
