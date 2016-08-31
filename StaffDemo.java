 class Staff extends Person
{

public String school;
public double pay;

public Staff(String name,String address,String school,double pay)
{

super(name,address);
this.school=school;
this.pay=pay;

}

public String getSchool()
{

return school;
}


public double getPay()
{

return pay;
}
public void setPay(double pay)
{
this.pay=pay;
}


public void setSchool(String School)
{
this.school=school;
}


public String toString()
{

return getName()+"\n"+getAddress()+"\n"+ pay+"\n"+school+"\n";
}

}
public class StaffDemo
{
public static void main(String []args)
{
Person p1=new Person("swarna","MVGR");
Person p2=new Staff("","","MR SCHOOL",5000);
System.out.println(p1.getName());
System.out.println(p1.toString());
System.out.println(p2.toString());
p2.setName("M SWARNA");

System.out.println(p2.toString());
}
}