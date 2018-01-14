import java.util.Scanner;
class beg_27
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String x=sc.next();
int z;
for(int i=0;i<x.length();i++)
{
	z=x.charAt(i);
	System.out.println(z);
	if(z>=48 && z<=57)
	{
		System.out.println("Yes\n");
	}
}
System.out.println("No\n");
}
}	
