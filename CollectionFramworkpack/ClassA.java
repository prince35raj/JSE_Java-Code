package CollectionFramworkpack;


import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {
    void meth1() {
        System.out.println("Implementing ArrayList");
        ArrayList al = new ArrayList<>();
      //  ArrayList<Integer> al=new ArrayList<Integer>(); // Generics
        al.add(10);          //insertion order is main maintained
        al.add("java");     // heterogeneous data allows
        al.add(null);       // null is allows
        al.add(10);         // duplicate data allows
        al.add(75);         // default capacity is 10 :[Size will be increase by HALF]
        al.add(1);          // it is available from Java 1.2v
        al.add(99);         // it is NOT SYNCHRONIZED by default .
        al.add(43);
        al.add(30);
        al.add(40);
        al.add(56);
        al.add(75);
        al.add(80);

      /*  System.out.println(al);

        System.out.println("===================================");
        System.out.println("size:" +al.size());
        System.out.println("get:" +al.get(5));
        System.out.println("remove:"+al.remove(4));
        System.out.println(al);
        System.out.println("get:"+al.get(al.size()-1));

        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
            System.out.println();
        }

        System.out.println("============");

        for (Object P:al)
        {
            System.out.println(P+" ");
        } */
        Iterator i=al.iterator();
        while (i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println("remove"+al.remove(0));

        System.out.println(al);


    }
    public static void main(String[] args) {

        new ClassA().meth1();
    }


}
