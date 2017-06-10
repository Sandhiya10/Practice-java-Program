public class LargeNum
{
public static void main(String[] s)
{
  int largenumber;
  int arr[]={120,567,203};
  largenumber=arr[0];
    for(int i=0;i<arr.length-1;i++)
      {
        if(largenumber<arr[i])
        largenumber=arr[i];
      }
System.out.println("Largest Number is "+largenumber);
}}
