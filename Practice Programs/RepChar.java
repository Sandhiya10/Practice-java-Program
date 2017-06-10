import java.util.*;
public class RepChar
{
public static void main(String[] a)
{
String Name;char[] c;char res;int count=0;
Scanner sc=new Scanner(System.in);
Name=sc.next();

c=Name.toCharArray();
for(int i=0;i<c.length;i++)
{
count=0;
for(int j=0;j<c.length;j++)
{
if(c[i]==c[j] && (i!=j))
{
count++;

}
}
if(count==0)
{
System.out.println("The first non repetitive character of the string is "+c[i]);
break;
}
}

}

}