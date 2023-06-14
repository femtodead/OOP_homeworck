package View;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

public class ViewEng implements iGetView {

    public void printAllStudentsHash(HashMap<Long, Student> students)
    {
        System.out.println("-----Displaying a list of students-----");
        for(Map.Entry<Long, Student> item :  students.entrySet())
        {
            System.out.println("kye " + item);
        }
        System.out.println("-----End of list-----");
    }

    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("-----Вывод списка студентов-----");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("-----Конец списка-----");
    }


}