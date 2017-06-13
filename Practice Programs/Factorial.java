import java.util.*;
class Factorial
{
public static void main(String[] a)
{
int number,fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
number=sc.nextInt();
System.out.print("Factorial of "+ number+" is ");
while(number>1)
{
fact=fact*number;
number=number-1;
}
System.out.println(fact);
}
}