import java.util.*;
public abstract class FurnitureItem
{
double width,height,price;

public FurnitureItem(double w,double h,double p)
{
width=w;
height=h;
price=p;
}

public void display( FurnitureItem f)
{

System.out.println("Width: +width);
System.out.println("Height: "+height);
System.out.println("Price: "+price);

}

class BookShelf extends FurnitureItem
{

public BookShelf(double w,double h,double p)
{
super(w,h,p);
}
}

class Chair extends FurnitureItem
{
public Chair(double w,double h,double p)
{
super(w,h,p);
}
}

class FurnitureMain
{
public static void main(String[] a)
{
int choice;
do
{
System.out.println("------------Furniture---------------");
System.out.println("1.Book Shelf");
System.out.println("2.Chair);
Scanner sc=new Scanner(System.in);
choice=sc.nextInt();
switch(choice)
{


}
}

}