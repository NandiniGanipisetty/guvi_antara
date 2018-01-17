import java.util.Scanner;
class hun_13
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int rem,s=0;
int temp=0;
temp=n;
while(temp!=0)
{
	rem=temp%10;
	s=s + rem*rem;
	temp=temp/10;
}
System.out.println(s);
}
}