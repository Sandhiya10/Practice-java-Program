import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class StringDemo
{
String Data="Java is a general-purpose computer programming language that is concurrent, class-based, object-oriented, and specifically designed to have as few implementation dependencies as possible. It is intended to let application developers WORA,meaning that compiled Java code can run on all platforms that support Java without the need for recompilation.Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of computer architecture.";

boolean findStr(String str)
{

boolean result=false;
Pattern p=Pattern.compile(str);
Matcher m=p.matcher(Data);
while(m.find())
{

result=true;
}
return result;
}

}

public class StringMain
{

public static void main(String[] a)
{
String str;
System.out.println("Enter the string to check");
Scanner s=new Scanner(System.in);
str=s.next();
StringDemo sd=new StringDemo();
if(sd.findStr(str))
System.out.println("Your string is in the Context");
else
System.out.println("Your string is not in the Context");


}
}
