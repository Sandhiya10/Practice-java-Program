import java.util.*;
public class FinalDemo
{
final int var;
public FinalDemo()
{

Scanner s=new Scanner(System.in);
var=s.nextInt();

}
void store()
{
/*Scanner s=new Scanner(System.in); //Error occurs since we are trying to intialize variable var through method store()
var=s.nextInt();
*/
}
public static void main(String[] str)
{
FinalDemo fd=new FinalDemo();
fd.store();
System.out.println(fd.var);
}
}

/*Note:

1: we can intitialize final variable through constructor
2.We can't intialize through  any of the methods


*/