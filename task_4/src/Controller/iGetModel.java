package Controller;

import java.util.HashMap;
import java.util.List;

import Model.Student;

public interface iGetModel {
    public  List<Student> getAllStudentsList();
    public  HashMap<Long, Student> getAllStudentsHash();
    public void del(Student stud);
}
