import java.util.*;
public class WordCount
{
static String s;
public static void main(String[] a)
{
int count=0; 
Scanner sc=new Scanner(System.in);
s=sc.nextLine().trim();
for(int j=0;j<s.length();j++)
{
if((s.charAt(j))==' ') 
count++;
}
System.out.println("The word count is "+(count+1));
}
}

	