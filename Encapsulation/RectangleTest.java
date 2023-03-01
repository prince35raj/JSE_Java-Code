package Encapsulation;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle aboj = new Rectangle(10, 20);

        int l = aboj.getLenght();
        int b = aboj.getBreadth();

        int area = l * b;
        System.out.println("area:" +area);

        aboj.setLenght(50);
        aboj.setBreadth(60);

        int ln = aboj.getLenght();
        int br = aboj.getBreadth();
        int newarea = ln * br;
        System.out.println("new area:"+newarea);

    }
    }
