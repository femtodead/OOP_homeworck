package StudentDomen;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{
    private List<StudentGroup> groupList;
    private int numberStream;

    public StudentStream(List<StudentGroup> groupList,int numberStream) {
        this.groupList = groupList;
        this.numberStream = numberStream;
    }

    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(groupList);
}

    public int getNumberStream() {
        return numberStream;
    }

    public void setNumberStream(int numberStream) {
        this.numberStream = numberStream;
    }

    @Override
    public String toString() {
        return "StudentStream" + '\n' + 
        ", numberStream=" + numberStream +'\n'+
        ", SizeStream=" + groupList.size() +'\n'+ 
        ", groupList=" + groupList +  "]";
    }


}