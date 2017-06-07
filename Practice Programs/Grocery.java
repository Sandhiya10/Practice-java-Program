import java.util.*;

public class Grocery
{
int weight;

void weightNow()
{
System.out.println("Enter the weight of the grocery right now");
Scanner s=new Scanner(System.in);
weight=s.nextInt(); 
}

int weightShow()
{

System.out.println("The weight is"+weight);
return 0;
}
}

class GroceryMain
{
public static void main(String[] args)
{
Grocery g=new Grocery();
g.weightNow();
g.weightShow();

}


}
