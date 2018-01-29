import java.util.Scanner;
class beg_45
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=0,rem=0,count=0;
temp=n;
while(temp!=0)
{
	rem=temp%10;
	count++;
	temp=temp/10;
}
System.out.println(count);
}
}
