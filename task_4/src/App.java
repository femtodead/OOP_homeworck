import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.FileModel;
import Model.Model;
import Model.Student;
import Model.hashModel;
import View.View;
import View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", "Иванов", 21, 101);
        Student s2 = new Student("Андрей", "Сидоров", 22, 111);
        Student s3 = new Student("Иван", "Петров", 22, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 25, 171);
        Student s6 = new Student("Лена", "Незабудкина", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        HashMap<Long, Student> hashStudents  = new HashMap<Long, Student>();

        Student s7 = new Student("Александр", "Назаров", 20, 114);
        Student s8 = new Student("Кирилл", "Ширяев", 21, 112);
        Student s9 = new Student("Владимир", "Рябов", 19, 145);
        Student s10 = new Student("Герман", "Лобанов", 27, 176);
        Student s11 = new Student("Адриан", "Жданов", 32, 198);
        Student s12 = new Student("Максимилиан", "Рожков", 35, 143);
        Student s13 = new Student("Игнат", "Григорьев", 31, 147);
        Student s14 = new Student("Эрнест", "Мышкин", 55, 138);
        Student s15 = new Student("Болеслав", "Иванов", 28, 160);
        Student s16 = new Student("Бенедикт", "Моисеев", 15, 117);
        Student s17 = new Student("Соломон", "Воробьёв", 17, 195);
        Student s18 = new Student("Аким", "Семёнов", 44, 123);
        hashStudents.put((long)0, s7);
        hashStudents.put((long)1, s8);
        hashStudents.put((long)2, s9);
        hashStudents.put((long)3, s10);
        hashStudents.put((long)4, s11);
        hashStudents.put((long)5, s12);
        hashStudents.put((long)6, s13);
        hashStudents.put((long)7, s14);
        hashStudents.put((long)8, s15);
        hashStudents.put((long)9, s16);
        hashStudents.put((long)10, s17);
        hashStudents.put((long)11, s18);



        // FileModel fModel = new FileModel("StudentsDB.txt");
        // // fModel.saveAllStudentToFile(students);
 
        iGetModel model = new Model(students);
        // iGetModel newFModel = fModel;
        iGetView view = new View();
 
        // Controller controller = new Controller(view, newFModel);
        // //controller.update();
        // controller.run();

        // fileModel.saveAllStudentsHashToFile(hashStudents);
        iGetModel modelhash = new hashModel(hashStudents);
        iGetView viewhash = new ViewEng();
        Controller controller = new Controller(view, model, viewhash ,modelhash);
        controller.run();
    }
}
