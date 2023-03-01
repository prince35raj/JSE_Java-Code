package CollectionFramworkpack;

public class ClassB {

    int empid;
    String name = "empname";
    String dept = "empdept";
    int salary;

    public ClassB(int empid, String name, String dept, int salary) {
        this.empid = empid;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ClassB{" + "empid=" + empid + ", name='" + name + '\'' + ", dept='" + dept + '\'' + ", salary=" + salary + '}';
    }
}

