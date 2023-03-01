package java8;

public class ClassA
{
    void meth1()
    {
        System.out.println("implementing lambda expression");
        interfaceA x=()->System.out.println("hi");
        x.meth1();

        InterfaceB y=(int a , int b)-> System.out.println(a+b);
        y.meth2(10,20);

       interfaceC Z=(int m,int k)->
        {
           if(m>=50)
               return m+100;
           else
               return k-100;
        };
        System.out.println("==>"+Z.meth3(55,5));
    }

    public static void main(String[] args) {
        new ClassA().meth1();
    }

}
