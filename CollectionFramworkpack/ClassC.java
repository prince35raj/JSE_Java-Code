package CollectionFramworkpack;

import java.util.*;

public class ClassC {

    void meth1() {
        System.out.println("emp details");
        ArrayList<ClassB> al = new ArrayList<ClassB>();
        al.add(new ClassB(101, "Prince", "hr", 35000));

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i) + " ");

            System.out.println("===================");

            for(Object P:al)
            {

                System.out.println(P+" ");
            }
            System.out.println("=====================");

            Iterator it =al.iterator();
            while(it.hasNext()) {
                System.out.println(it.next() + " ");

            }
            System.out.println("=====================");

            ListIterator li= al.listIterator();

            while(li.hasNext())
            {
                System.out.print(li.next()+" ");
            }
            System.out.println();
        }

    }
    void meth2()
    {
        Vector v=new Vector();
        v.add(new ClassB(102,"sachin","hr",350000));

        Iterator i=v.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }

    void meth3()
    {
       LinkedList ll = new LinkedList();
       ll.add(new ClassB(103,"rahul","je",35000));

       ListIterator li= ll.listIterator();
       while(li.hasNext())
       {
           System.out.println(li.next()+" ");
       }
    }
    void meth4() {
        HashSet hs = new HashSet();
        hs.add(new ClassB(104, "susmita", "se", 25000));

        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.println(i.next() + " ");
        }
        this.meth1();
    }


    public static void main(String[] args) {
      ClassC cobj= new ClassC();
      cobj.meth2();
      cobj.meth3();
      cobj.meth4();

    }
}
