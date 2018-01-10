import java.io.Console;
class beg_9
{
public static void main(String args[])
{
Console c=System.console();
int n=Integer.parseInt(c.readLine("enter the size of array\n"));
int k=Integer.parseInt(c.readLine("enter the range\n"));
int []a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=Integer.parseInt(c.readLine("x["+i+"]="));
}
int sum=0;
for(int i=0;i<k;i++)
{
	sum=sum+a[i];
}
System.out.println(sum);
}
}
