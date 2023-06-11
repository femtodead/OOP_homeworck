package Services;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.PersonComparator;
import StudentDomen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher teach = new Teacher(firstName, secondName, age, "Doctoral degree");
        teachers.add(teach);
    }
    
    public List<Teacher> getSortedByFIOStudentsList()
    {
        List<Teacher> newTeachList = new ArrayList<Teacher>(teachers);
        newTeachList.sort(new PersonComparator<Teacher>());
        return newTeachList;
    }
}
