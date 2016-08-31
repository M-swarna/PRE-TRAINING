public class Person
{
public String name;
public String address;

public Person(String name,String address)
{
this.name=name;
this.address=address;

}
public String getName()
{

return name;
}

public String getAddress()
{
return address;
}
public void setName(String name)
{

this.name=name;
}
public void setAddress(String address)
{
this.address=address;
}
public String toString()
{
String str=this.getName()+ this.getAddress();
return str;

}
}