package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Model.Model;
import Model.Student;
import View.View;

public class Controller {
    private iGetView view;
    private iGetModel model;
    private iGetView viewhash;
    private iGetModel modelhash;

    private List<Student> students;
    private HashMap<Long,Student> studentsHash;

    /**
     * @param view вюшка для листа
     * @param model модель для листа
     * @param viewhash вюшка для мапы
     * @param modelhash модель для мапы
     */
    public Controller(iGetView view, iGetModel model, iGetView viewhash , iGetModel modelhash) {
        this.view = view;
        this.model = model;
        this.viewhash = viewhash;
        this.modelhash = modelhash;
        this.students = new ArrayList<Student>();
        this.studentsHash = new HashMap<Long,Student>();
    }

    /**
     * немного добавлений, для хранения акуальной мапы
     */
    public void getAllStudents() {
        students = model.getAllStudentsList();
        studentsHash = modelhash.getAllStudentsHash();
    }

    public boolean testData() {
        if (students.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void update() {
        //MVP
        getAllStudents();
        if(testData())
        {
            view.printAllStudents(students);
        }
        else{
            System.out.println("Список студентов пуст!");
        }

        //MVC
        //view.printAllStudents(model.getAllStudents());
    }

    public void run()
    {
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt("Введите команду:");
            com = Commands.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;
                        /**
     * добавил отдельную команду для отдельного просмотра
     */
                case HASH:
                    getAllStudents();
                    viewhash.printAllStudentsHash(studentsHash);
                    break;
                case DELETE:    /**
                * Сама команда не зательевая 
                * Сначало выводит оба списка, потом запрашивает id удаляемого студента
                * проверяем оба списка по элементно вытаскивая из каждого студента id 
                * как только находим останавливаемся
                * соответственно если в списке не было подходящих студентов выводим сообщение об отсутствии токовых
                */
                    getAllStudents();
                    System.out.println("LIST");
                    view.printAllStudents(students);
                    System.out.println("HASH");
                    viewhash.printAllStudentsHash(studentsHash);
                    String delcom = view.prompt("Введите id удоляемого студента:");
                    int id = Integer.parseInt(delcom);
                    boolean flag = false;
                    for (Student student : students) {
                        if (student.getId() == id)
                        {
                            System.out.println(student + "\n" + "Был успешно удален из List");
                            model.del(student);
                            flag = true;
                            break;
                        }
                    } 
                    if (!flag) {
                        System.out.println("Данная запись не была найдена в List");
                    }
                    for (Map.Entry<Long, Student> item :  studentsHash.entrySet()) {
                        if (item.getValue().getId() == id)
                        {
                            System.out.println(item.getValue() + "\n" + "Был успешно удален из HASH");
                            // studentsHash.remove(item.getKey());
                            modelhash.del(item.getValue());
                            flag = true;
                            break;
                        }
                    }                
                    if (!flag) {
                        System.out.println("Данная запись не была найдена в HASH");
                    }

            }

        }
    }

}
