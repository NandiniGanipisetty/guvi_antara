import java.util.Scanner;
class Play34
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String x=sc.nextLine();
for(int i=0;i<x.length();i=i+3)
{
	System.out.print(x.charAt(i));
}
}
}
