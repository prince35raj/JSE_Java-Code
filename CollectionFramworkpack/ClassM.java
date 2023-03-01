package CollectionFramworkpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassM
{
    void meth1()
    {
        ArrayList al=new ArrayList();

        al.add(new ClassL("prince",101,"softEng"));
        al.add(new ClassL("manish",102,"hr"));

     //   System.out.println(al);

        Collections.sort(al,new ClassK_comparator());

      Iterator i=al.iterator();
      while(i.hasNext())
      {
          System.out.println(i.next());
      }

    }

    public static void main(String[] args) {
        new ClassM().meth1();
    }
}
