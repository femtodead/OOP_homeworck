package Model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Controller.iGetModel;

public class FileModel implements iGetModel {
    private String fileName;
    
    public FileModel(String fileName) {
        this.fileName = fileName;
        
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public List<Student> getAllStudentsList() {
        List<Student> students  = new ArrayList<Student>();
        try
        {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.add(pers);
                line = reader.readLine();
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        return students;
    }
    
    @Override
    public HashMap<Long, Student> getAllStudentsHash() {
        HashMap<Long, Student> students  = new HashMap<Long, Student>();
        long key = 0; 
        try
        {
            File file = new File("HASH"+fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line!=null)
            {
                System.out.println(key);
                String[] param = line.split(" ");
                System.out.println(param);
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.put(key, pers);
                line = reader.readLine();
                key++;
            }
        }
        catch(Exception e)
            {
            System.out.println(e.getMessage());
            }
    
         return students;
    }
    public void saveAllStudentsHashToFile(HashMap<Long, Student> students)
    {
        try(FileWriter fw = new FileWriter("HASH"+fileName, true))
        {
            for(Map.Entry<Long, Student> item :  students.entrySet())
            {
                fw.write("kye= " +item.getKey() +" "+ item.getValue().getFirstName()+" "+item.getValue().getSecondName()+" "+item.getValue().getAge()+" "+item.getValue().getId());
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveAllStudentToFile(List<Student> students)
    {
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Student pers : students)
            {
                fw.write(pers.getFirstName()+" "+pers.getSecondName()+" "+pers.getAge()+" "+pers.getId());
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



    @Override
    public void del(Student stud) {
        // String fileName = "example.txt";
        // строка, которую нужно удалить
        String lineToRemove = stud.toString();

        try {
            // создаем временный файл
            File tempFile = new File("temp.txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            // читаем исходный файл
            BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
            String currentLine;

            while ((currentLine = reader.readLine()) != null) {
                // если текущая строка не равна удаляемой 
                // записываем ее во временный файл
                if (!currentLine.equals(lineToRemove)) {
                    writer.write(currentLine + System.getProperty("line.separator"));
                }
            }

            // закрываем ридер и писатель
            reader.close();
            writer.close();

            // удаляем исходный файл
            File oldFile = new File(this.fileName);
            oldFile.delete();

            // переименовываем временный файл в исходное имя файла
            tempFile.renameTo(oldFile);

            System.out.println("Строка " + lineToRemove + " удалена из файла " + this.fileName);

        } catch (IOException ex) {
            System.out.println("Ошибка при удалении строки из файла " + this.fileName);
            ex.printStackTrace();
        }
    }

    
}
