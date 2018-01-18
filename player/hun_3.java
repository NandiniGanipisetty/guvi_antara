import java.util.Scanner;
import java.lang.String;
class hun_3
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int rem,rev=0,temp=0;
System.out.println("reverse is :\n");
temp=x;
while(temp!=0)
{
	rem=temp%10;
	rev=rev*10 + rem;
	temp=temp/10;
}
System.out.println(rev);
}
}

