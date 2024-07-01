package figures;
public class Rectangle
{
private double length;
private double width;
public Rectangle(double length, double width)
{
this.length = length;
this.width = width;
}
public double calcArea()
{
return length * width;
}
}
