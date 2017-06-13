import java.util.*;
public class Brand
{
public static void main(String[] a)
{

ArrayList MobileBrand=new ArrayList();
ArrayList<String> CarBrand=new ArrayList<String>();

// adding list of brands

MobileBrand.add("Samsung");
MobileBrand.add("Sony");
MobileBrand.add("HTC");

CarBrand.add("BMW");
CarBrand.add("Ford");
CarBrand.add("Swift");
CarBrand.add("Maruti");

// removing elment
CarBrand.remove(4);

// Reteiving one element
String BName=(String)MobileBrand.get(1); // By default it is Object type

//Traversing arraylist using iterator
Iterator itr=MobileBrand.iterator();
while(itr.hasNext())
{
Object o=itr.next();
System.out.println((String)o);

}

//Traversing using enhanced for loop

for(String str:CarBrand) // Since CarBrand is type safe no need for Type casting
{
System.out.println(str);
}

}}