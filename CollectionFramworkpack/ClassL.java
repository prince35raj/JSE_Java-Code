package CollectionFramworkpack;

public class ClassL
{
    private String stuName;
    private int StuRoll;
    private String stuDept;

    public String getStuName() {
        return stuName;
    }

    public int getStuRoll() {
        return StuRoll;
    }

    public String getStuDept() {
        return stuDept;
    }

    public ClassL(String stuName, int stuRoll, String stuDept)
    {
        this.stuName = stuName;
        StuRoll = stuRoll;
        this.stuDept = stuDept;
    }

    @Override
    public String toString() {
        return "ClassL{" +
                "stuName='" + stuName + '\'' +
                ", StuRoll=" + StuRoll +
                ", stuDept='" + stuDept + '\'' +
                '}';
    }
}
