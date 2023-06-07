package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup> {
    private int counter;
    private final List<StudentGroup> groupList;

    public StudentStreamIterator(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public boolean hasNext() {
        return counter < groupList.size();
    }

    @Override
    public StudentGroup next() {
        if(!hasNext())
        {
            return null;
        }
        return groupList.get(counter++);
    }
    
}
