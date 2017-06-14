import java.util.*;
abstract class NIIT 				// Abstract Class (Abstraction)
{

private String CID,Cname,Name, ID;
public NIIT(String id,String name)
{
ID=id;
Name=name;
}
/*   Getter setter method ensures secured access of data (Encapsulation)
public void setCID(String cid)
{
CID=cid;
}
public String getCID()
{
return CID;
}
public void setCname(String cname)
{
Cname=cname;
}
public String getCname()
{
return Cname;
}
*/
public void CentreDetails()
{
System.out.println(this.Name+" belongs to ");
System.out.println("Center Id is "+getCID()+ " Center Name is "+getCname());
}

public abstract void displayAlumniDetails();  //   Method Overriding (Polymorphism)

}

class Student extends NIIT			// Inheritance
{
private String Sname;
private String SID;
private double fee= 80000;

public Student( String id,String name)
{
super(id,name);
Sname=name; SID=id;

}

public void displayAlumniDetails()
{
System.out.println();
System.out.println(" This alumni is student");
System.out.println("Student Name	:"+Sname);
System.out.println("Student ID 	:"+SID);
System.out.print("Centre Details 	:");
CentreDetails();
System.out.println(" Amount Paid 	:"+fee);

}
}

class Instructor extends NIIT
{
private String Iname;
private String IID;
private double Salary= 50000;

public Instructor( String id,String name)
{
super(id,name);
Iname=name; IID=id;

}

public void displayAlumniDetails()
{
System.out.println(" This alumni is Instructor");
System.out.println("Instructor Name	: "+Iname);
System.out.println("Instructor ID	: "+IID);
System.out.print(" Centre Details  	:");
CentreDetails();
System.out.println(" Salary 		:"+Salary);

}
}

public class NIITMain
{
public static void main(String[] a)
{
String n,i,cid,cn;
Scanner sc=new Scanner(System.in);
int choice=0;
System.out.println(" ------------Welcome to NIIT---------------");
System.out.println(" 1.Student ");
System.out.println(" 2.Instructor ");
choice=sc.nextInt();
switch(choice)
{
case 1:
System.out.println(" Enter Student Name ");
n=sc.next();
System.out.println(" Enter Student ID ");
i=sc.next();
NIIT student=new Student(i,n);
System.out.println(" Enter Centre ID ");
cid=sc.next();
student.setCID(cid);
System.out.println(" Enter Centre Name ");
cn=sc.next();
student.setCname(cn);
System.out.println(" The Entered details");
System.out.println(" =======================");
student.displayAlumniDetails();
break;

case 2:

System.out.println("Enter Instructor Name ");
n=sc.next();
System.out.println("Enter Instructor ID ");
i=sc.next();
NIIT instructor=new Instructor(n,i);
System.out.println("Enter Centre ID ");
cid=sc.next();
instructor.setCID(cid);
System.out.println("Enter Centre Name ");
cn=sc.next();
instructor.setCname(cn);
System.out.println("The Entered details");
instructor.displayAlumniDetails();
break;

default:
System.out.println(" Wrong choice");

}

}
}