import java.io.Console;
class beg_20
{
public static void main(String [] args)
{
Console c=System.console();
int x=Integer.parseInt(c.readLine("enter the number\n"));
int mul;
for(int i=1;i<=5;i++)
{
	mul=x*i;
	System.out.print(mul+" ");
}
}
}
