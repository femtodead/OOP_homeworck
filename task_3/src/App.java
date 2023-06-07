import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;

public class App {
    public static void main(String[] args)  {

        //System.out.println(man.toString());

        Student pers1 = new Student("Денис", "Криницын", 35, 1);
        //System.out.println(pers1.toString());

        Student s1 = new Student("Сергей", "Иванов", 22, 101);
        Student s2 = new Student("Андрей", "Сидоров", 23, 111);
        Student s3 = new Student("Иван", "Петров", 18, 121);
        Student s4 = new Student("Игорь", "Иванов", 23, 301);
        Student s5 = new Student("Даша", "Цветкова", 24, 171);
        Student s6 = new Student("Лена", "Незабудкина", 25, 104);
        Student s7 = new Student("Александр", "Назаров", 20, 101);
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

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        listStud1.add(pers1);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s12);
        listStud3.add(s13);
        listStud3.add(s14);
        listStud3.add(s15);
        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s16);
        listStud4.add(s17);
        listStud3.add(s18);

        StudentGroup group4333 = new StudentGroup(listStud1, 4333);
        StudentGroup group4222 = new StudentGroup(listStud2, 4222);
        StudentGroup group4555 = new StudentGroup(listStud3, 4555);
        StudentGroup group4666 = new StudentGroup(listStud4, 4666);

        List<StudentGroup> StreamList = new ArrayList<StudentGroup>();
        StreamList.add(group4333);
        StreamList.add(group4222);
        StreamList.add(group4555);
        StreamList.add(group4666);
        StudentStream stream1  = new StudentStream(StreamList, 1);
        
        for (StudentGroup studentGroup : stream1) {
           System.out.println(studentGroup.toString()); 
        }

        System.out.println("=============Sort==================");

        Collections.sort(stream1.getGroupList());

        for (StudentGroup studentGroup : stream1) {
            System.out.println(studentGroup.toString()); 
         }


         System.out.println("=============GS.toString==================");

         System.out.println(stream1.toString());
        // //System.out.println(group4335.toString());

        // for(Student stud:group4335)
        // {
        //     System.out.println(stud.toString());
        // }

        // System.out.println("===============================");
        // Collections.sort(group4335.getGroup());

        // for(Student stud:group4335)
        // {
        //     System.out.println(stud.toString());
        // }
    }
}