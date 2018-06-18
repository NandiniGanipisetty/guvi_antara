import java.util.Scanner;
class Hun11
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String x=sc.nextLine();
String [] y=x.split(" ");
for(String i : y)
{
	StringBuffer sb=new StringBuffer(i);	
	System.out.print(sb.reverse()+" ");
}
}
}



