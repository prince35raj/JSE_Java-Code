package IOSTREAMS;


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ClassA {
    void FileOperation1() throws Exception {
        System.out.println("Read Data from a file");
        FileInputStream rd = new FileInputStream("C:\\Users\\Prince Henry\\Desktop\\file1.txt");
        System.out.println("Connection Created");
        int i;
        while ((i = rd.read()) != -1)
            System.out.print((char) i);
        System.out.println();
        System.out.println("Data Retrieved");
        rd.close();
    }

    void FileOperation2() throws Exception {
        System.out.println("Writing data in a file");
        FileOutputStream Wd = new FileOutputStream("C:\\Users\\Prince Henry\\Desktop\\file2.txt");
        System.out.println("Connection created");
        String data = " Microsoft";
        byte arr[] = data.getBytes();
        Wd.write(arr);
        System.out.println("Data Retrieved");
        Wd.close();
    }

    void FileOperation3() throws Exception {
        System.out.println("Copying data one file into another file");
        FileInputStream Wd = new FileInputStream("C:\\Users\\Prince Henry\\Desktop\\pic.jpg");
        FileOutputStream cd = new FileOutputStream("C:\\Users\\Prince Henry\\Desktop\\pic1.jpg");

        System.out.println("Connection Created ");

        int i;
        while ((i = Wd.read()) != -1) {
            cd.write(i);
        }
        System.out.println("data Retrieved ");

        Wd.close();
        cd.close();

    }

    public static void main(String[] args) throws Exception {
        ClassA aboj = new ClassA();
        aboj.FileOperation1();
        aboj.FileOperation2();
        aboj.FileOperation3();

    }
}



