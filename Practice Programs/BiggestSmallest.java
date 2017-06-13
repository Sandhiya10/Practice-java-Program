import java.util.*;
public class BiggestSmallest
{
public static void main(String[] a)
{
int[] array=new int[5];
int largeNumber,smallNumber;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 5 numbers");
for(int i=0;i<5;i++)
{
array[i]=sc.nextInt();
}
largeNumber=array[0];smallNumber=array[0];
for(int j=0;j<5;j++)
{
if(array[j]>largeNumber)
largeNumber=array[j];
if(array[j]<smallNumber)
smallNumber=array[j];
}
System.out.println("Largest Number is "+largeNumber);
System.out.println("Smallest number is "+smallNumber);
}
}