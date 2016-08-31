public abstract class shape
{

public boolean filled;
public String color;

public shape()
{
}

public shape(String colot, boolean filled)
{

this.color=color;
this.filled=filled;
}

public String getColor()
{

return color;
}


public void setColor(String color)
{

this.color=color;

}
public boolean isFilled()
{
return filled;
}
public abstract double getArea();
public abstract double getPerimeter();
}