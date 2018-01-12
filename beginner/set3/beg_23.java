import java.util.Scanner;
class beg_23
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
int min=0;
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
min=a[0];
for(int i=1;i<n;i++)
{
	if(min>a[i])
	{
		min=a[i];
	}
}
System.out.println("\n"+min);
}
}
