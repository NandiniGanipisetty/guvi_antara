import java.io.Console;
class beg_13
{
public static void main(String []args)
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter the number\n"));
int temp,flag=0;
int x=0;
x=n/2;
if(n==0 || n==1)
{
	System.out.println("no\n");
}
else
{
	for(int i=2;i<=x;i++)
	{
	if(n%i==0)
	{
	System.out.println("no\n");
	flag=1;
	break;
	}
	}
if(flag==0)
	checkpal(n);
}
}
static void checkpal(int n)
{
int t;
t=n;
int rem,rev=0;
while(t!=0)
{
	rem=t%10;
	rev=rev*10 + rem;
	t=t/10;
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