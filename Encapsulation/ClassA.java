package Encapsulation;

public class ClassA {

    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public class ClassB {

    }

    public static void main(String[] args) {
        ClassA aboj = new ClassA();
        aboj.setY(6);
        int num = aboj.getY();
        System.out.println(num);
    }

}

