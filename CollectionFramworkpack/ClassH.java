package CollectionFramworkpack;


import java.util.*;

public class ClassH {
    void meth1() {
        LinkedHashMap map = new LinkedHashMap();

        map.put("java", 101);       //maintained insertion order 1.4v
        map.put("python", 102);    // Hetergeneous keys & Hetergeneous values are allowed
        map.put("NULL", 104);
        map.put(null, null);       // null keys & null values are allowed
        map.put("COLLECTION", 105); // Default Capacity: 16 size increases by DOUBLE,  LoadFactor: 0.75
        map.put("HTMLS", 106);
        map.put("C", 107);
        map.put("JS", 108);
        map.put("C++", 109);
        map.put("CSS", 101);
        map.put("BSS", 102);
        map.put("HTML", 105);

        // System.out.println(map);


        LinkedHashSet hs1 = new LinkedHashSet(map.keySet());
        Iterator i = hs1.iterator();
        System.out.println("key" + hs1);
        System.out.println("==========================");
        while (i.hasNext()) {
            System.out.println(i.next());

        }
        System.out.println("==============================");

        LinkedHashSet hs2 = new LinkedHashSet(map.entrySet());
        System.out.println("entries" + hs2);


        Iterator i2 = hs2.iterator();
        while (i2.hasNext()) {
            //   System.out.println(i2.next());
            Map.Entry e = (Map.Entry) i2.next();
            System.out.println(e.getKey() + "  " + e.getValue());
        }

    }

    void meth3() {
        System.out.println("implementing hashmap");

        HashMap hm = new HashMap();   //insertion not maintained 1.2v
        hm.put(101, "java");        //  Hetergeneous keys & Hetergeneous values are allowed
        hm.put(102, "css");        // null keys & null values are allowed
        hm.put(103, "html");      // duplicate key not allowed but value is allowed
        hm.put(103, "html");
        hm.put(104, "html");
        hm.put(null, "null");

        System.out.println(hm);
        System.out.println("====================");
        HashSet hm1 = new HashSet<>(hm.entrySet());

        System.out.println("entry-set" + hm1);
        System.out.println("========================");

        HashSet hm2 = new HashSet(hm.keySet());
        System.out.println("key" + hm2);
        System.out.println("==========================");

        Iterator i = hm1.iterator();
        while (i.hasNext()) {
            //  System.out.println(i.next()+ " ");

            Map.Entry r = (Map.Entry) i.next();
            System.out.println(r.getKey() + " " + r.getValue());
        }


    }

    void meth2() {
        System.out.println("implementing treemap");

        TreeMap map = new TreeMap();

        map.put(101, "Java"); // Insertion order is not maintained BUT sorting order of keys is maintained
        map.put(500, 1000);// Heterogeneous keys are NOT allowed but  Hetergeneous values are allowed
        map.put(600, null);// null keys are NOT allowed null values are allowed
        map.put(103, "Java");// Default Capacity: 16 size increases by DOUBLE,  LoadFactor: 0.75
        map.put(104, "Python");// It is available from Java 1.2v
        map.put(106, "Css"); // It is NOT SYNCHRONIZED
        map.put(108, "Html");
        System.out.println(map);
        map.put(108, "Oracle");
        System.out.println(map);
        System.out.println("=============================");
        System.out.println(map.get(103));// Python
        System.out.println("=============================");
    }

    void meth4() {
        Hashtable ht = new Hashtable();
        ht.put(101, "java"); // insertion order not maintained
        ht.put(102, "java"); // heterogeneous or homogeneous data allowed
        ht.put(103, "html"); // null key not allowed
        ht.put(104, "null"); // Default Capacity: 16 size increases by DOUBLE,  LoadFactor: 0.75
        ht.put(105, "null"); //  It is available from Java 1.0v [LEGACY class]
        ht.put(106, "css");  // it is synchronized

        System.out.println(ht);

    }

    public static void main(String[] args) {
        ClassH hobj = new ClassH();
        //   hobj.meth1();
        //  hobj.meth2();
        //hobj.meth3();
        hobj.meth4();
    }
}
