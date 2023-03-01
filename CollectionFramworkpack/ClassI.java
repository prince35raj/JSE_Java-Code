package CollectionFramworkpack;

import java.util.ArrayList;

public class ClassI implements Comparable<ClassI> {
    private String stuName;
    private int sturoll;
    private String studept;

    public ClassI(String stuName, int sturoll, String studept) {
        this.stuName = stuName;
        this.sturoll = sturoll;
        this.studept = studept;
    }

    @Override
    public String toString() {
        return "ClassI{" + "stuName='" + stuName + '\'' + ", sturoll=" + sturoll + ", studept='" + studept + '\'' + '}';
    }

    @Override
    public int compareTo(ClassI o) {
        // return this.stuName.compareTo(o.stuName);
       // return this.studept.compareTo(o.studept);
        return this.sturoll-o.sturoll;
    }
}