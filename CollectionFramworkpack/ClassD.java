package CollectionFramworkpack;

import java.util.*;

public class ClassD
{
    void meth1()
    {
        System.out.println("implementing vector");

        Vector v=new Vector();
        v.add(100);          // insertion order is maintain
        v.add("java");       // heterogeneous data allowed
        v.add(50);           // default value is 10
        v.add(100);          // Duplicate data allowed
        v.add(500);          // it is available on java 1.0v [legacy Classes]
        v.add(null);        // null values is allowed
        v.add(15);          // it is SYNCHRONIZED by default

        System.out.println(v);
        System.out.println("========================");
        System.out.println("get():"+v.get(3));
        System.out.println("size():"+v.size());
        System.out.println("remove():"+v.remove(3));
        System.out.println("add():"+v.add(15));
        System.out.println("========================");
        System.out.println(v);


        System.out.println("Retrieving the data using for loop");
        for(int i=0;i<v.size();i++)
        {
            System.out.print(v.get(i)+" ");
            System.out.println();

        }
        System.out.println("=====================");
        System.out.println("Retrieving the data using for each loop");
        for (Object p:v)
        {
            System.out.print(p);
            System.out.println();

        }
        System.out.println("===================");

        System.out.println("Retrieving tha data using Iterator interface");

        Iterator i =v.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
            System.out.println();
            System.out.println("=============================");

        }
        System.out.println("Retrieving the data using enumeration interface");
        Enumeration e=v.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        } 
        System.out.println("==================================");
        System.out.println("Retrieving tha data using ListIterator IInterface");
        ListIterator li=v.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        System.out.print("remove"+v.remove(3)+" ");

    

    }


    void meth2()
    {
        System.out.println("====================================");
        System.out.println("implementing hashset");
        HashSet hs=new HashSet();

        hs.add(100);   // insertion not maintained
        hs.add("java");// heterogeneous data allowed
        hs.add(100);   // Duplicates are NOT ALLOWED
        hs.add(null);  // null is allowed
        hs.add(500);   // It is available from Java 1.2v
        hs.add(5.6);   // It is NOT synchronized by default
        hs.add(0000);  // Default Capacity : 16 [Size increases by double]
        hs.add(7898);  // Its load factor is 0.75

       // System.out.println(hs);

        Iterator i= hs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next()+" ");
        }
        
      


    }

    public static void main(String[] args) {
         ClassD dobj=new ClassD();
         dobj.meth1();
         dobj.meth2();

    }
}
