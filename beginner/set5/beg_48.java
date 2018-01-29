import java.util.Scanner;
class beg_48
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] a=new int[n];
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
int avg=0,s=0;
for(int i=0;i<n;i++)
{
	s=s+a[i];
}
avg=s/n;
System.out.println(avg);
}
}
