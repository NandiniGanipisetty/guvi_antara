import java.util.*;
class Hun3
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int [n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
int c=0;
for(int i=0;i<n;i++)
{
	if(a[i]==i)
	{
		System.out.print(a[i]+" ");
		c=0;
	}
	else
	{
		c++;
	}		
}
if(c==n)
{
	System.out.println("-1");
}
}
}
