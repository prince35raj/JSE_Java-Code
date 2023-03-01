package CollectionFramworkpack;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.List;

public class ClassF
{
    void meth1()
    {
        System.out.println("implementing linked-list in queue");

       List ll=new LinkedList<>(); //

        ll.add(100);
        ll.add("java");
        ll.add(100);
        ll.add(null);
        // ll.offer(30); C.E because offer() is present in Queue Interface

        LinkedList l2=new LinkedList();

        l2.add(100);
        l2.add("java");
        l2.offer(235);  // l2 will implement BOTH the functionalities of LIST & QUEUE

        System.out.println(ll);
        System.out.println(l2);

        System.out.println("remove"+l2.remove());
        System.out.println(l2);



    }

    public static void main(String[] args) {
        ClassF fobj=new ClassF();
        fobj.meth1();
    }
}
