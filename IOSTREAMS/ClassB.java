package IOSTREAMS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassB {

    void FileOperation1() throws Exception {
        System.out.println("Reading  data a file");
        FileInputStream fi = new FileInputStream("C:\\Users\\Prince Henry\\Desktop\\File5.txt");
        System.out.println("connection Created");

        int i;
        while ((i = fi.read()) != -1)
            System.out.print((char) i);
        System.out.println();
        System.out.println("data Retrieved");
        fi.close();

    }

    void FileOperation2() throws Exception {
        System.out.println("Writing Data into a file");
        FileOutputStream dr = new FileOutputStream("C:\\Users\\Prince Henry\\Desktop\\file6.txt");
        System.out.println("connection created");
        String data = "java is awesome";
        byte arr[] = data.getBytes();
        dr.write(arr);
        System.out.println("data retrieved");
        dr.close();

    }


    void FileOperation3() throws Exception {
        System.out.println("copying data one file into another file");
        FileInputStream fi = new FileInputStream("C:\\Users\\Prince Henry\\Desktop\\file6.txt");
        FileOutputStream dr = new FileOutputStream("C:\\Users\\Prince Henry\\Desktop\\file7.txt");
        int i;
        while((i= fi.read())!=-1)
            System.out.println();
    }

    public static void main(String[] args) throws Exception {
        ClassB bobj = new ClassB();
        // bobj.FileOperation1();
        bobj.FileOperation2();

    }
}
