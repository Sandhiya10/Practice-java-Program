class ContinueDemo
{
public static void main(String[] args)
{
int i=1;   
while(i<=10)
{
System.out.println("in while loop");   //  -------
if(i==5) {      
continue;
i++;
}
System.out.println(i);     // 1 2  3  4
i++;     // i=5
}

}

}