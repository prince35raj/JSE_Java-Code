package pack4;

import com.pack2.ClassH;

public class ClassC extends ClassH
{
    public void meth3()
    {
        System.out.println("ClassC meth3()");
    }

    public static void main(String[] args) {
        ClassC cobj=new ClassC();
        cobj.meth1();
        cobj.meth2(); //parent class method
        cobj.meth3(); // grand parent class method
    }

}
