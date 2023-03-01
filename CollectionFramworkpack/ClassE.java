package CollectionFramworkpack;

import java.util.*;

public class ClassE   {

    void meth1()
    {
        System.out.println("implementing LinkedHasSet()");

        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(100);        // insertion order maintained
        lhs.add("java");     // heterogeneous data allowed
        lhs.add(null);       // null value is allowed
        lhs.add(100);        // duplicate data not allowed
        lhs.add(500);       //  It is available from Java 1.4v
        lhs.add(1);          // not synchronized
        lhs.add(200);      // Default Capacity : 16 [Size increases by double] Its load factor is 0.75

        // System.out.println(lhs);

        Iterator i= lhs.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }


    }

    void meth2()
    {
        System.out.println("implementing HashSet");
        HashSet hs= new HashSet();

        hs.add(10);
        hs.add("java");
        hs.add(null);
        hs.add(10);
        hs.add(500);
        hs.add(12);

        System.out.println(hs);
       Iterator i= hs.iterator();
       while(i.hasNext())
       {
           System.out.print(i.next()+" ");
       }

        //System.out.println(hs.get(3);
        // in Hashset data will note stored in index values
        // Data will be stores basing on HASH VALUES.
    }

    void meth3()
    {
        System.out.println("implementing treeset");
        TreeSet ts=new TreeSet();

        ts.add(100);  // insertion order not maintained
       // ts.add("java"); // Heterogeneous data nit allow
       // ts.add(null);   // null value not allowed
        ts.add(500);      // duplicate data note allowed
        ts.add(100);      //[default capacity 16]size increase double load-factor 0.75
        ts.add(546);     // it  is available on java 1.2v
        ts.add(478);     // it is not synchronized by default

        System.out.println(ts);

        System.out.println("========================");

        System.out.println(ts.headSet(546));
        System.out.println(ts.tailSet(500));
    }

    public static void main(String[] args) {
       ClassE eobj= new  ClassE();
       //eobj.meth1();
       //eobj.meth2();
        eobj.meth3();

    }
}
