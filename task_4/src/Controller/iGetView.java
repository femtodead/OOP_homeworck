package Controller;

import java.util.HashMap;
import java.util.List;

import Model.Student;

public interface iGetView {
    void printAllStudents(List<Student> students);
    void printAllStudentsHash(HashMap<Long, Student> students);
    String prompt(String message);
}
