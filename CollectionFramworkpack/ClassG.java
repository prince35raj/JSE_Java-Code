package CollectionFramworkpack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ClassG {
    void meth1() {
        System.out.println("implementing Hashmap");

        HashMap map = new HashMap();

        map.put("prince", 101); // insertion order not maintained
        map.put("rohit", 102);  // heterogeneous key & value allowed
        map.put(103, "python"); // default capacity is 16 [ increases by DOUBLE,  LoadFactor: 0.75]
        map.put("null", "null"); // null key and null values is  allowed
        map.put(104, "Css"); // It is NOT SYNCHRONIZED
        map.put(105, "Html"); // / It is available from Java 1.2v
        map.put("prince",106);  // duplicate key are not allowed but duplicate values is allowed

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(106));
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(104));

        System.out.println("====================================");

        HashSet hs1=new HashSet(map.keySet());

        System.out.println("key:"+hs1);

        HashSet hs2=new HashSet(map.entrySet());

        System.out.println("entries:"+hs2);

        System.out.println("====================================");

       Iterator i= hs2.iterator();
        while(i.hasNext())
        {
            // System.out.println(i.next());

            Map.Entry e=(Map.Entry)i.next();
            System.out.println(e.getKey()+" "+e.getValue());
        }


    }

    public static void main(String[] args) {
        new ClassG().meth1();
    }

}
