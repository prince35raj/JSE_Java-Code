package Encapsulation;

public class Rectangle {

    private int lenght;
    private int breadth;

    Rectangle( int lenght,int breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}




