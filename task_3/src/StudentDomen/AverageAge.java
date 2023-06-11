package StudentDomen;

import java.util.List;

public class AverageAge<T extends Person> {
    List<T> myList;     
    public AverageAge(List<T> list) {
        this.myList = list;

    }

    public  void getAverageAge() {
        double count = 0;
        for (int i = 0; i < myList.size(); i++) {
            count = count + myList.get(i).getAge();
        }
        System.out.println("Средний возраст в списке = " +  count/myList.size());
    }       
}
