import java.util.Scanner;
class beg_22
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
int max=0;
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
max=a[0];
for(int i=1;i<n;i++)
{
	if(max<a[i])
	{
		max=a[i];
	}
}
System.out.println("\n"+max);
}
}
