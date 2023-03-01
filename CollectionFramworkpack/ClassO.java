package CollectionFramworkpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassO
{
    void meth1()
    {
        ArrayList al=new ArrayList<ClassN>();
        al.add(new ClassN("ABC",02,"salesmen"));
        al.add(new ClassN("DEF",01,"hr"));


        Collections.sort(al);

      //  System.out.println(al);

        Iterator i=al.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }


    }

    public static void main(String[] args)
    {
        new ClassO().meth1();

    }

}
