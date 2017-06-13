class Addition
{
public int add(int i) //Method 1
{

return 0+i;
}
public int add(int i,int j) // Method 2
{
return i+j;
}
public double add(double i,double j) // Method 3
{
return i+j;
}
public double add(int i, double j)  // Method 4
{
return i+j;
}
public double add(double i,int j)  //Method 5
{
return i+j;
}
}
public class MethodOverloading
{
public static void main(String[] s)
{
Addition a=new Addition();
System.out.println(" Method 1 is called "+a.add(10));
System.out.println(" Method 2 is called "+a.add(10,20));
System.out.println(" Method 3 is called "+a.add(10.32,67.89));
System.out.println(" Method 4 is called "+a.add(1,11.43));
System.out.println(" Method 5 is called "+a.add(10.59,73));
}
}