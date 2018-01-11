import java.io.Console;
class beg_12
{
public static void main(String [] args)
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter the number\n"));
int temp,rem,rev=0;
temp=n;
while(temp!=0)
{
	rem=temp%10;
	rev=rev*10 + rem;
	temp=temp/10;
}
if(n==rev)
{
	System.out.println("yes\n");
}
else
{
	System.out.println("no\n");
}
}
}

	