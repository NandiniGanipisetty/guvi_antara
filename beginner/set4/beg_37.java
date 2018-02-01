import java.io.Console;
class beg_37
{
public static void main(String [] args)
{
Console c=System.console();
int x=Integer.parseInt(c.readLine("enter 1st no. : "));
int y=Integer.parseInt(c.readLine("enter 2nd no. : "));
int temp=0;
temp=y;
y=x;
x=temp;
System.out.println(x+" "+y);
}
}
