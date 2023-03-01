package abstraction;

public abstract class rectangle {
    public void area1(int l, int b) {
        int area = l * b;
        System.out.println(area);
    }
     abstract void area2(int s);

}
