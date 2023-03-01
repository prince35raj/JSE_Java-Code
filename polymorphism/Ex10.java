package polymorphism;

public class Ex10 {
    private String x = "Ax";

    protected String y = "Ay";

    public String z = "Az";

    public String toString() {
        return x + y + z;
    }

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        // String X=ex10.toString();
        //  System.out.println(X);
        System.out.println(ex10);
    }
}
    class Ex11 extends Ex10
    {
        private String X="Bx";
        public String z="Bz";

        public String toString()
        {
            return X+y+z;
        }

        public static void main(String args[]) {
           Ex11 ex11=new Ex11();
            System.out.println(ex11);
        }
    }
    class Ex12 extends Ex10
    {
        private String x="CX";

        public static void main(String[] args) {
            Ex12 ex12=new Ex12();
            System.out.println(ex12.x);
            System.out.println(ex12);
        }
    }
    class Ex13 extends Ex12
    {
        private String x="Dx";

        public String z="Dz";

        public static void main(String[] args) {
           Ex13 ex13=new Ex13();
            System.out.println(ex13.x);
            System.out.println(ex13.y);
            System.out.println(ex13.z);
            System.out.println(ex13);

            Ex12 ex=new Ex13();
            // System.out.println(ex.x);
            System.out.println(ex.y);
            System.out.println(ex.z);
            System.out.println(ex);
        }

    }

//}
