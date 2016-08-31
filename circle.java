public class circle extends shape
{
private static double radius;
public circle()
{
}
public circle(double radius)
{

this.radius=radius;
}

public circle(double radius, String color, boolean filled)
{

this.radius=radius;
super.color=color;
super.filled=filled;
}

public double getArea()
{
double area=(33/7)*radius*radius;

return area;
}
public double getPerimeter()
{
double peri=2*(33/7)*radius;
return peri;
}

public static void main(String []args)
{
circle c1=new circle(3);
System.out.println(c1.getArea());
System.out.println(c1.getPerimeter());
}
}