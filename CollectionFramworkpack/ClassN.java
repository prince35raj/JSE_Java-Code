package CollectionFramworkpack;

public class ClassN implements Comparable <ClassN> {
    private String EmpName;
    private int EmpId;
    private String EmpDept;

    public ClassN(String empName, int empId, String empDept) {
        EmpName = empName;
        EmpId = empId;
        EmpDept = empDept;
    }



    @Override
    public String toString() {
        return "ClassN{" +
                "EmpName='" + EmpName + '\'' +
                ", EmpId=" + EmpId +
                ", EmpDept='" + EmpDept + '\'' +
                '}';
    }

    @Override
    public int compareTo(ClassN o) {
      //  return this.EmpName.compareTo(EmpName);
        return this.EmpId-o.EmpId;
    }
}
