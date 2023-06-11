package Controllers;

import Services.TeacherService;
import StudentDomen.Teacher;

public class TeacherController implements iPersonController<Teacher> {
    private final TeacherService dataService =  new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
}
