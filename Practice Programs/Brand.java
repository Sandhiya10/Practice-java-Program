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
CarBrand.remove(3);

// Reteiving one element
String BName=(String)MobileBrand.get(1); // By default it is Object type

//Traversing arraylist using iterator
System.out.println(" ----------Mobile Brands-------");
Iterator itr=MobileBrand.iterator();
while(itr.hasNext())
{
Object o=itr.next();
System.out.println((String)o);

}
System.out.println(" ----------Car Brands-------");
//Traversing using enhanced for loop

for(String str:CarBrand) // Since CarBrand is type safe no need for Type casting
{
System.out.println(str);
}

}}