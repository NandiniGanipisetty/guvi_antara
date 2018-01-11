import java.io.Console;
class beg_19
{
public static void main(String [] args)
{
Console c=System.console();
int x=Integer.parseInt(c.readLine("enter the number\n"));
int f=1;
for(int i=1;i<=x;i++)
{
	f=f*i;
}
System.out.println(f);
}
}
