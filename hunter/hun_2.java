import java.util.Scanner;
import java.lang.String;
class hun_2
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int f=1;
System.out.println("factorial is :\n");
for(int i=1;i<=x;i++)
{
	f=f*i;
}
System.out.println(f);
}
}

