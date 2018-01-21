import java.util.Scanner;
class beg_32
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
char c;
int z=0;
String x=sc.nextLine();
for(int i=0;i<x.length();i++)
{
	c=x.charAt(i);
	if((int)c==32)
	{
		z++;
	}		
}
System.out.println(z);
}
}
		

