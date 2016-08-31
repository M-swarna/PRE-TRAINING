public class Rectangle extends shape
{
private static double radius;
public Rectangle()
{
}
public Rectangle(double width, double length)
{

this.width=width;
this.length=length;
}

public circle(double width, double length, String color, boolean filled)
{

this.width=width;
this.length=length;
super.color=color;
super.filled=filled;
}

public double getArea()
{
double area=width*length;

return area;
}
public double getPerimeter()
{
double peri=2*(width+length);
return peri;
}

public static void main(String []args)
{
Rectangle r1=new Rectangle(4,5);
System.out.println(r1.getArea());
System.out.println(r1.getPerimeter());
}
}