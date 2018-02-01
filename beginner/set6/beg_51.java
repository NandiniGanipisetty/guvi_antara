import java.util.Scanner;
class beg_51
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=0,rem=0;
int [] a=new int[n];
int temp=0;
temp=n;
while(temp!=0)
{
	rem=temp%10;
	a[x]=rem;
	x++;
	temp=temp/10;
}
for(int i=x-1;i>=0;i--)
{
	System.out.print(a[i]+" ");
}
}
}
