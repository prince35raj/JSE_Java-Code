package Exceptionpack;

public class ClassD implements Cloneable // Marker interface
{
    int x = 100;
    int y = 200;

    ClassD show() throws CloneNotSupportedException
    {
        ClassD obj=(ClassD) super.clone();
        return obj;

    }
}
