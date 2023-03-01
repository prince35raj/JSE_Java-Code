package CollectionFramworkpack;

import java.util.Comparator;

public class ClassK_comparator implements Comparator<ClassL>
{

    @Override
    public int compare(ClassL o1, ClassL o2) {
        return o1.getStuRoll()- o2.getStuRoll();
    }
}
