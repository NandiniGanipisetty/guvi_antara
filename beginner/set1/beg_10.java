import java.io.Console;
class beg_10
{
public static void main(String [] args)
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter the number\n"));
int rem=0,z=0;
int temp;
temp=n;
while(temp!=0)
{
	rem=temp%10;
	z=z+1;
	temp=temp/10;
}
System.out.println(z);
}
}
